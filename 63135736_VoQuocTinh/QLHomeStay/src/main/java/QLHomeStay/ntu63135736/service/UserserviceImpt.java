package QLHomeStay.ntu63135736.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import QLHomeStay.ntu63135736.model.Usermodel;
import QLHomeStay.ntu63135736.responsitory.Userresponsitory;


@Service
public class UserserviceImpt implements Userservice {
    @Autowired
    private Userresponsitory userRepository;
    
	@Override
	public Usermodel findByUsername(String tendangnhap) {
		return userRepository.findByTendangnhap(tendangnhap);
	}

	 @Override
	    public boolean authenticate(String tendangnhap, String matkhaunguoidung) {
	        Usermodel user = userRepository.findByTendangnhap(tendangnhap);
	        if (user != null && user.getMatkhaunguoidung().equals(matkhaunguoidung)) {
	            return true;
	        }
	        return false;
	    }
	 @Override
	    public List<Usermodel> getAllUsers() { // Thêm phương thức này
	        return userRepository.findAll();
	    }

	 @Override
	    public boolean isValidUser(String tendangnhap, String matkhaunguoidung, String emailnguoidung) {
	        // Kiểm tra xem người dùng có tồn tại và có mật khẩu khớp không
	        Usermodel user = userRepository.findByTendangnhapAndMatkhaunguoidungAndEmailnguoidung(tendangnhap, matkhaunguoidung, emailnguoidung);
	        return user != null;
	    }

	 @Override
	 public void addUser(Usermodel user) {
	     // Kiểm tra xem trường emailnguoidung đã được thiết lập giá trị chưa
	     if (user.getEmailnguoidung() != null) {
	         // Nếu trường emailnguoidung đã được thiết lập giá trị, thêm người dùng vào cơ sở dữ liệu
	         userRepository.save(user);
	     } else {
	         // Nếu trường emailnguoidung chưa được thiết lập giá trị, xử lý theo ý của bạn
	         // Ví dụ: Ném ra một ngoại lệ, ghi log, hoặc thông báo lỗi
	     }
	 }

	 @Override
	 public String getUserRole(String tendangnhap) {
	     // Lấy vai trò của người dùng dựa trên tên đăng nhập
	     Usermodel user = userRepository.findByTendangnhap(tendangnhap);
	     if (user != null) {
	         int roleId = user.getMavaitromacdinh();
	         // Giả sử bạn có một phương thức khác để lấy tên vai trò từ mã vai trò
	         String roleName = getRoleNameById(roleId);
	         return roleName;
	     }
	     return null;
	 }

	 private String getRoleNameById(int roleId) {
	   
	     Map<Integer, String> roleMap = new HashMap<>();
	     roleMap.put(1, "Admin");
	     roleMap.put(2, "Customer");
	     return roleMap.get(roleId);
	 }
}
