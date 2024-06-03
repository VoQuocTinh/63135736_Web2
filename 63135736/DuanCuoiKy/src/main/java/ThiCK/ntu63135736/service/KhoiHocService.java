package ThiCK.ntu63135736.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.KhoiHocmodel;

	@Service
	public interface KhoiHocService {
		List<KhoiHocmodel> findallKhoiHocmodel();
		KhoiHocmodel findKhoiHocmodelByID(int id);
	    void addKhoiHocmodel(KhoiHocmodel khoiHocmodel);
	    void deleteKhoiHocmodel(int id);

	}