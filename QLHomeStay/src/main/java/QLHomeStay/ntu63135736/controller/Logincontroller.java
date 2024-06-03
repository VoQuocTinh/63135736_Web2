package QLHomeStay.ntu63135736.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import QLHomeStay.ntu63135736.model.Usermodel;
import QLHomeStay.ntu63135736.service.Userservice;
import jakarta.servlet.http.HttpSession;

@Controller
public class Logincontroller {

    @Autowired
    private Userservice userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Trả về trang đăng nhập (login.html)
    }
    @PostMapping("/login")
    public String login(String tendangnhap, String matkhaunguoidung, String emailnguoidung, HttpSession session) {
        // Xác thực thông tin đăng nhập
        if (userService.isValidUser(tendangnhap, matkhaunguoidung, emailnguoidung)) {
            // Lấy vai trò của người dùng từ cơ sở dữ liệu
            String role = userService.getUserRole(tendangnhap); // Giả sử có một phương thức getUserRole trong userService
            
            // Lưu thông tin đăng nhập vào phiên làm việc
            session.setAttribute("username", tendangnhap);
            
            // Chuyển hướng dựa trên vai trò của người dùng
            if ("admin".equals(role)) {
                return "redirect:/admin";
            } else {
                return "redirect:/index";
            }
        } else {
            // Đăng nhập không thành công, chuyển hướng lại trang đăng nhập
            return "redirect:/login";
        }
    }
    }