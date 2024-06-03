package QLHomeStay.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import QLHomeStay.ntu63135736.model.Phongmodel;
import QLHomeStay.ntu63135736.service.Phongservice;

	@Controller
	@RequestMapping("/admin")
	public class Phongcontroller {
	
	    @Autowired
	    private Phongservice phongService;
	    
	    @GetMapping("/phong")
	    public String listPhongs(Model model) {
	        List<Phongmodel> listPhongs = phongService.getAllPhongs();
	        model.addAttribute("listPhongs", listPhongs);
	        return "Phong";
	    }
	

	    @GetMapping("/add")
	    public String showAddPhongForm(Model model) {
	        model.addAttribute("phong", new Phongmodel());
	        return "themphong";
	    }
	    @PostMapping("/save")
	    public String savePhong(@ModelAttribute("phong") Phongmodel phong) {
	        phongService.savePhong(phong);
	        return "redirect:/admin/phong";
	    }

	
	    @GetMapping("/phong/sua/{id}")
	    public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
	        Phongmodel phong = phongService.getPhongById(id);
	        model.addAttribute("phong", phong);
	        return "suaphong"; // Tên template Thymeleaf cho form sửa phòng
	    }
	    @PostMapping("/phong/sua/{id}")
	    public String updatePhong(@ModelAttribute("phong") Phongmodel phong) {
	        phongService.updatePhong(phong);
	        return "redirect:/admin/phong"; // Chuyển hướng đến danh sách phòng sau khi cập nhật thành công
	    }
	
	    @GetMapping("/delete/{id}")
	    public String deletePhong(@PathVariable(value = "id") int id) {
	        phongService.deletePhongById(id);
	        return "redirect:/admin/phong";
	    }
	}