package ThiCK.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ThiCK.ntu63135736.model.Usermodel;
import ThiCK.ntu63135736.service.UserServiceImpt;

@Controller
@RequestMapping("/User")
public class UserController {
	@Autowired UserServiceImpt userService;
	@GetMapping("/all")
	public String getAll(Model model) {
		List<Usermodel> dsND = userService.findallUsermodel();
		model.addAttribute("dsUser", dsND);
		return "danhsachUser";
	}
	@GetMapping("/login")
    public String loginForm() {
        return "login"; // Trả về trang đăng nhập
    }
	@GetMapping("/logout")
    public String logoutForm() {
        return "logout"; // Trả về trang đăng xuất
    }
	}
