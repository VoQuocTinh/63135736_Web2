package ThiCK.ntu63135736.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.GiaoVienmodel;

	@Service
	public interface GiaoVienService {
		List<GiaoVienmodel> findallGiaoVienmodel();
		GiaoVienmodel findGiaoVienmodelByID(int id);
	    void addGiaoVienmodel(GiaoVienmodel giaoVienmodel);
	    void deleteGiaoVienmodel(int id);
	}
