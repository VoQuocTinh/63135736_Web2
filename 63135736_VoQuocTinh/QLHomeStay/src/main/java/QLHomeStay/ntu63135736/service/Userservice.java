package QLHomeStay.ntu63135736.service;

import java.util.List;

import org.springframework.stereotype.Service;

import QLHomeStay.ntu63135736.model.Usermodel;
@Service
public interface Userservice {

	Usermodel findByUsername(String tendangnhap);
	boolean authenticate(String tendangnhap, String matkhaunguoidung);
    List<Usermodel> getAllUsers(); // Thêm phương thức này
	boolean isValidUser(String tendangnhap, String matkhaunguoidung, String emailnguoidung);
	void addUser(Usermodel user);
	String getUserRole(String mavaitromacdinh);


}
