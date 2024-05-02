package QLBH_ABC.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import QLBH_ABC.ntu63135736.model.Customer;
import QLBH_ABC.ntu63135736.service.CustomerService;
import jakarta.persistence.Id;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired CustomerService customerService;
	@GetMapping("/all")
	public String getAll(Model model) {
		List<Customer> dsKH = customerService.findAllCustomer();
		model.addAttribute("dsKhachHang", dsKH);
		return "danhsachKH";
	}
	@Controller
	public class ThemKhachHangController {

	    @GetMapping("/themKhachHang")
	    public String hienThiTrangThemKhachHang() {
	        return "themKhachHang"; // Trả về tên của view để hiển thị giao diện tạo khách hàng mới
	    }
	    @PostMapping("themKhachHang")
	    public String luuKhachHangMoi(@RequestParam String name, @RequestParam String address) {
	        Customer khachHang = new Customer();
	        khachHang.setName(name);
	        khachHang.setAddress(address);
	        // Thêm khách hàng mới vào cơ sở dữ liệu bằng service
	        customerService.themKhachHang(khachHang);
	        // Sau khi thêm thành công, chuyển hướng về trang danh sách khách hàng
	        return "redirect:/customer/all";
	    }
	 // Đường dẫn để hiển thị trang sửa khách hàng
	    @GetMapping("/editCustomer")
	    public String showEditForm(@RequestParam("id") int id, Model model) {
	        Customer customer = customerService.findCustomerByID(id);
	        model.addAttribute("customer", customer);
	        return "editCustomer"; // Trả về tên của view
	    }
	    @PostMapping("/customer/all")
	    public String updateCustomer(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("address") String address) {
	        Customer customer = customerService.findCustomerByID(id);
	        if (customer != null) {
	            customer.setName(name);
	            customer.setAddress(address);
	            customerService.editCustomer(customer);
	        }
	        return "redirect:/customer/all"; // Chuyển hướng về danh sách khách hàng sau khi cập nhật
	    }


}
	
	
	}
