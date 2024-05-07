package ThiCK.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ThiCK.ntu63135736.model.LopHocmodel;
import ThiCK.ntu63135736.service.LopHocServiceImpt;

@Controller
@RequestMapping("/lophoc")
public class LopHocController {
	@Autowired LopHocServiceImpt lopHocService;
	@GetMapping("/all")
	public String getAll(Model model) {
		List<LopHocmodel> dsLH = lopHocService.findallLopHocmodel();
		model.addAttribute("dsLopHoc", dsLH);
		return "danhsachLH";
		
		
	}
	 
	}
