package ThiCK.ntu63135736.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ThiCK.ntu63135736.model.Hocsinhmodel;
import ThiCK.ntu63135736.service.HocsinhServiceImpt;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HocsinhController {
	@Autowired HocsinhServiceImpt hocsinhService;
	@GetMapping("/all")
	public String getAll(Model model) {
		List<Hocsinhmodel> dsHS = hocsinhService.findallHocsinhmodel();
		model.addAttribute("dsHocSinh", dsHS);
		return "danhsachHS";
	}
	@GetMapping("/them")
    public String addHocsinhmodel() {
        return "themHocSinh"; // Trả về trang để thêm học sinh mới
    }
	
	 @GetMapping("/home/sua/{id}")
	    public String suaHocsinhmodel(@PathVariable int id, Model model) {
	        Hocsinhmodel student = hocsinhService.findHocsinhmodelByID(id);
	        model.addAttribute("student", student);
	        return "suaHocsinh";
	    }
    @PostMapping("/them")
    public String addHocsinhmodel(@ModelAttribute Hocsinhmodel hocsinhmodel) {
        hocsinhService.addHocsinhmodel(hocsinhmodel);
        return "redirect:/hocsinh/all"; // Sau khi thêm thành công, chuyển hướng về danh sách học sinh
    }
	}
