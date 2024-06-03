package ThiCK.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ThiCK.ntu63135736.model.GiaoVienmodel;
import ThiCK.ntu63135736.service.GiaoVienServiceImpt;

@Controller
@RequestMapping("/giaovien")
public class GiaoVienController {
	@Autowired GiaoVienServiceImpt giaoVienService;
	@GetMapping("/all")
	public String getAll(Model model) {
		List<GiaoVienmodel> dsGV = giaoVienService.findallGiaoVienmodel();
		model.addAttribute("dsGiaoVien", dsGV);
		return "danhsachGV";
	} 
	
	}