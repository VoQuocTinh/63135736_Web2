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
	    public List<Usermodel> getAllUsers() { 
	        return userRepository.findAll();
	    }

	 @Override
	    public boolean isValidUser(String tendangnhap, String matkhaunguoidung, String emailnguoidung) {
	        Usermodel user = userRepository.findByTendangnhapAndMatkhaunguoidungAndEmailnguoidung(tendangnhap, matkhaunguoidung, emailnguoidung);
	        return user != null;
	    }


	 @Override
	 public String getUserRole(String tendangnhap) {
	    
	     Usermodel user = userRepository.findByTendangnhap(tendangnhap);
	     if (user != null) {
	         int roleId = user.getMavaitromacdinh();
	        
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
