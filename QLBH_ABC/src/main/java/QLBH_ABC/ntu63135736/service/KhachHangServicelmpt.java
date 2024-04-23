package QLBH_ABC.ntu63135736.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import QLBH_ABC.ntu63135736.model.KhachHang;
import QLBH_ABC.ntu63135736.responsitories.KhachHangResponsitories;



@Service
public class KhachHangServicelmpt implements KhachHangService{
	
	@Autowired KhachHangResponsitories khachHangResponsitories;

	@Override
	public List<KhachHang> getAlLKhachHang() {
		return khachHangResponsitories.findAll();
	}

	@Override
	public KhachHang getKhachHangByID(String maKH) {
		return khachHangResponsitories.getById(maKH);
		
	}
	@Override
	public KhachHang createKhachHang(KhachHang khachHang) {
	    return khachHangResponsitories.save(khachHang);
	}

	
	
}
