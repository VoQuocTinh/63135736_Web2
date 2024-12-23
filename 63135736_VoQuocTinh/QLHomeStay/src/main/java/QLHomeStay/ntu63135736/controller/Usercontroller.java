package QLHomeStay.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import QLHomeStay.ntu63135736.model.Usermodel;
import QLHomeStay.ntu63135736.service.Userservice;


@Controller
public class Usercontroller {
	
    @Autowired
    private Userservice userService;
    
	@GetMapping("/User")
    public String index(Model model) {
        List<Usermodel> listUsers = userService.getAllUsers();
        model.addAttribute("listUsers", listUsers);
        return "User";
    }
	@PostMapping("/register")
    public String register(@ModelAttribute("user") Usermodel user, RedirectAttributes redirectAttributes) {
        // Thêm user vào cơ sở dữ liệu
        userService.addUser(user);
        // Chuyển hướng đến trang đăng nhập
        redirectAttributes.addFlashAttribute("successMessage", "Đăng ký thành công! Vui lòng đăng nhập.");
        return "redirect:/login";
    }
	}
