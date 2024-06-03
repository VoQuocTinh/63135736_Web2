package QLHomeStay.ntu63135736.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import QLHomeStay.ntu63135736.model.Usermodel;

@Repository
public interface Userresponsitory extends JpaRepository<Usermodel, Integer> {

	Usermodel findByTendangnhap(String tendangnhap);

	Usermodel findByTendangnhapAndMatkhaunguoidungAndEmailnguoidung(String tendangnhap, String matkhaunguoidung,
			String emailnguoidung);



}
