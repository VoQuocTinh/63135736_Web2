package QLBH_ABC.ntu63135736.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/khachHang/{id}")
    public KhachHang getKhachHangById(@PathVariable String id) {
        return khachHangService.getKhachHangByID(id);
    }
    
    @PostMapping("/khachHang")
    public KhachHang createKhachHang(@RequestBody KhachHang khachHang) {
        return khachHangService.createKhachHang(khachHang);
    }

}

