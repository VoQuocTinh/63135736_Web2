package QLBH_ABC.ntu63135736.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import QLBH_ABC.ntu63135736.model.KhachHang;
import QLBH_ABC.ntu63135736.responsitories.KhachHangResponsitories;

public interface KhachHangService {
	public List<KhachHang> getAlLKhachHang();
	public KhachHang getKhachHangByID(String maKH);
	public KhachHang createKhachHang(KhachHang khachHang);
	
}
