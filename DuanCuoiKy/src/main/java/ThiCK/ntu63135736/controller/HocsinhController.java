package ThiCK.ntu63135736.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ThiCK.ntu63135736.model.Hocsinhmodel;
import ThiCK.ntu63135736.model.LopHocmodel;
import ThiCK.ntu63135736.model.Usermodel;
import ThiCK.ntu63135736.service.HocsinhServiceImpt;
import ThiCK.ntu63135736.service.LopHocServiceImpt;
import ThiCK.ntu63135736.service.UserServiceImpt;
import jakarta.persistence.criteria.CriteriaBuilder.In;
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
	    public String getAll(Model model, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size) {
	        // Kiểm tra xem người dùng đã đăng nhập hay chưa
	        if (session.getAttribute("user") == null) {
	            // Nếu chưa đăng nhập, chuyển hướng đến trang đăng nhập
	            return "redirect:/User/login";
	        }
	        Page<Hocsinhmodel> hocsinhPage = hocsinhService.findAll(PageRequest.of(page, size));

	        model.addAttribute("dsHocSinh", hocsinhPage);
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
	                             @RequestParam String gioi_tinh,
	                             @RequestParam String lop_id) {
	    // Tạo một đối tượng Hocsinhmodel mới
	    Hocsinhmodel hocSinh = new Hocsinhmodel(ho_dem, ten, ngay_sinh, dia_chi, dan_toc, noi_sinh, gioi_tinh, lop_id);
	    
	    // Thêm học sinh mới vào cơ sở dữ liệu bằng service
	    hocsinhService.addHocsinhmodel(hocSinh);
	    
	    // Sau khi thêm thành công, chuyển hướng về trang danh sách học sinh
	    return "redirect:/home/all";
	}

	
	 @GetMapping("/editHocsinh")
	    public String showEditForm(@RequestParam("id") int id, Model model) {
	        Hocsinhmodel hocsinh = hocsinhService.findHocsinhmodelByID(id);
	        model.addAttribute("hocsinh", hocsinh);
	        return "suaHocsinh"; // Trả về tên của view
	    }
	 @PostMapping("/update")
	 public String updateHocsinh(@RequestParam("id") int id, @RequestParam("ho_dem") String hoDem,@RequestParam("noi_sinh") String noisinh,@RequestParam("gioi_tinh") String gioi_tinh,@RequestParam("ngay_sinh") Date ngaysinh, @RequestParam("ten") String ten, @RequestParam("lop_id") String lopid,@RequestParam("dan_toc") String dantoc, @RequestParam("dia_chi") String diaChi) {
	     Hocsinhmodel hocsinh = hocsinhService.findHocsinhmodelByID(id);
	     if (hocsinh != null) {
	    	 hocsinh.setHoc_sinh_id(id);
	         hocsinh.setHo_dem(hoDem);
	         hocsinh.setTen(ten);
	         hocsinh.setNgay_sinh(ngaysinh);
	         hocsinh.setDia_chi(diaChi);
	         hocsinh.setDan_toc(dantoc);
	         hocsinh.setNoi_sinh(noisinh);
	         hocsinh.setGioi_tinh(gioi_tinh);
	         hocsinh.setLop_id(lopid);
	         
	         hocsinhService.editHocsinhmodel(hocsinh);
	     }	
	     return "redirect:/home/all"; // Chuyển hướng về danh sách học sinh sau khi cập nhật
	 }
	 @PostMapping("/delete/{id}")
	    public String deleteHocsinh(@PathVariable("id") int id) {
	        hocsinhService.deleteHocsinhmodel(id);
	        return "redirect:/home/all"; // Chuyển hướng về danh sách học sinh sau khi xóa
	 }
	 
	 @GetMapping("/thongtinhocsinh/{id}")
	    public String thongTinHocSinh(@PathVariable("id") Integer id, Model model) {
	        Hocsinhmodel hocSinh = hocsinhService.findHocsinhmodelByID(id);
	        if (hocSinh == null) {
	            return "redirect:/home/all"; 
	        }
	        model.addAttribute("hocSinh", hocSinh);
	        return "thongtinHS";
	    }
	}

