package ThiCK.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	@GetMapping("/them")
    public String themLopHoc(Model model) {
        // Định nghĩa một đối tượng LopHocmodel mới để truyền vào form
        LopHocmodel lopHoc = new LopHocmodel();
        model.addAttribute("lopHoc", lopHoc);
        return "themLopHoc"; // Trả về view để hiển thị form thêm lớp học
    }

    @PostMapping("/luu")
    public String luuLopHoc(@ModelAttribute("lopHoc") LopHocmodel lopHoc) {
        // Lưu lớp học mới vào cơ sở dữ liệu bằng service
        lopHocService.addLopHocmodel(lopHoc);
        // Sau khi thêm thành công, chuyển hướng về trang danh sách lớp học
        return "redirect:/lophoc/all";
    }
	 
	}
