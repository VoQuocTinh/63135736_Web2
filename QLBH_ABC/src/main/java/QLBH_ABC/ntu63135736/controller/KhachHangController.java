package QLBH_ABC.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import QLBH_ABC.ntu63135736.model.KhachHang;
import QLBH_ABC.ntu63135736.service.KhachHangService;

@RestController
public class KhachHangController {
	@Autowired KhachHangService khachHangService;
	@GetMapping("/dsKhachHang")
	public List<KhachHang> getAllKhachHang()
	{
		return khachHangService.getAlLKhachHang();
	}
}
