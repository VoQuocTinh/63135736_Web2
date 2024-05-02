package ThiCK.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ThiCK.ntu63135736.model.KhoiHocmodel;
import ThiCK.ntu63135736.service.KhoiHocServiceImpt;

@Controller
@RequestMapping("/khoihoc")
public class KhoiHocController {
	@Autowired KhoiHocServiceImpt khoiHocService;
	@GetMapping("/all")
	public String getAll(Model model) {
		List<KhoiHocmodel> dsKH = khoiHocService.findallKhoiHocmodel();
		model.addAttribute("dsKhoiHoc", dsKH);
		return "danhsachKH";
	}
	}