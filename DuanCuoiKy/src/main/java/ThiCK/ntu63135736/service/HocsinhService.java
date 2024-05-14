package ThiCK.ntu63135736.service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.Hocsinhmodel;


@Service
public interface HocsinhService {
	List<Hocsinhmodel> findallHocsinhmodel();
	Hocsinhmodel findHocsinhmodelByID(int id);
    void addHocsinhmodel(Hocsinhmodel hocsinhmodel);
    void deleteHocsinhmodel(int id);
    void editHocsinhmodel(Hocsinhmodel hocsinhmodel);
    Page<Hocsinhmodel> findAll(Pageable pageable);
	Hocsinhmodel search(String hoc_sinh_id, String ho_dem, String ten, Date ngay_sinh, String lop_id, String gioi_tinh);
}