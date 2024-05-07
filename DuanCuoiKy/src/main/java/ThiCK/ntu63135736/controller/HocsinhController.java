package ThiCK.ntu63135736.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import ThiCK.ntu63135736.model.Hocsinhmodel;
import ThiCK.ntu63135736.model.LopHocmodel;
import ThiCK.ntu63135736.model.Usermodel;
import ThiCK.ntu63135736.service.HocsinhServiceImpt;
import ThiCK.ntu63135736.service.LopHocServiceImpt;
import ThiCK.ntu63135736.service.UserServiceImpt;
import jakarta.servlet.http.HttpSession;

import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HocsinhController {
	@Autowired HocsinhServiceImpt hocsinhService;
	@Autowired LopHocServiceImpt lopHocService;
	@Autowired UserServiceImpt userService;
	@Autowired  HttpSession session;

	 @GetMapping("/all")
	    public String getAll(Model model) {
	        // Kiểm tra xem người dùng đã đăng nhập hay chưa
	        if (session.getAttribute("user") == null) {
	            // Nếu chưa đăng nhập, chuyển hướng đến trang đăng nhập
	            return "redirect:/User/login";
	        }

	        // Nếu đã đăng nhập, tiếp tục xử lý request
	        List<Hocsinhmodel> dsHS = hocsinhService.findallHocsinhmodel();
	        model.addAttribute("dsHocSinh", dsHS);
	        return "danhsachHS";
	        
	    }
	 @PostMapping("/login")
	 public String login(@RequestParam String username, @RequestParam String password, Model model, HttpSession session) {
	     Usermodel user = userService.findUserByUsernameAndPassword(username, password);
	     if (user != null) {
	         session.setAttribute("user", user);
	         return "redirect:/home/all"; // Chuyển hướng đến trang chính nếu đăng nhập thành công
	     } else {
	         model.addAttribute("error", "Invalid username or password");
	         return "login"; // Trả về trang đăng nhập với thông báo lỗi
	     }
	 }
	 @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        // Xóa thông tin phiên đăng nhập
	        session.invalidate();
	        // Chuyển hướng người dùng đến trang đăng nhập
	        return "redirect:/User/login";
	    }	
	@GetMapping("/them")
	public String themHocSinh(Model model) {
        // Lấy danh sách các lớp học từ cơ sở dữ liệu
        List<LopHocmodel> listLopHoc =lopHocService.getallLopHocmodels();
        // Gửi danh sách lớp học đến view để hiển thị trong dropdown
        model.addAttribute("danhsachLH", listLopHoc);
        return "themHocSinh"; // Trả về tên view để hiển thị form thêm học sinh
    }
	@PostMapping("/them")
	public String luuHocSinhMoi(@RequestParam String ho_dem,
	                             @RequestParam String ten,
	                             @RequestParam Date ngay_sinh,
	                             @RequestParam String dia_chi,
	                             @RequestParam String dan_toc,
	                             @RequestParam String noi_sinh,
	                             @RequestParam String lop_id) {
	    // Tạo một đối tượng Hocsinhmodel mới
	    Hocsinhmodel hocSinh = new Hocsinhmodel(ho_dem, ten, ngay_sinh, dia_chi, dan_toc, noi_sinh, lop_id);
	    
	    // Thêm học sinh mới vào cơ sở dữ liệu bằng service
	    hocsinhService.addHocsinhmodel(hocSinh);
	    
	    // Sau khi thêm thành công, chuyển hướng về trang danh sách học sinh
	    return "redirect:/home/all";
	}

	
	 @GetMapping("/home/sua/{id}")
	    public String suaHocsinhmodel(@PathVariable int id, Model model) {
	        Hocsinhmodel student = hocsinhService.findHocsinhmodelByID(id);
	        model.addAttribute("student", student);
	        return "suaHocsinh";
	    }
	 
	}

