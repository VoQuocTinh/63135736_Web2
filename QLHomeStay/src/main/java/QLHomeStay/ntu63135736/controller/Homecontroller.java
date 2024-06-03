package QLHomeStay.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import QLHomeStay.ntu63135736.model.Phongmodel;
import QLHomeStay.ntu63135736.service.Phongservice;

@Controller
public class Homecontroller {
    
    @Autowired
    private Phongservice phongService;

    @GetMapping("/home")
    public String index(Model model, @PageableDefault(size = 4) Pageable pageable) {
        Page<Phongmodel> phongPage = phongService.getAllPhongs(pageable);
        model.addAttribute("phongPage", phongPage);
        return "index"; 
    }
    @GetMapping("/AboutUs")
	public String index() {
		return "AboutUs"; 
	}
   
}
