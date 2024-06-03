package QLHomeStay.ntu63135736.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Admincontroller {
		@GetMapping("/admin")
		public String index() {
			return "admin"; 
		}
	}
