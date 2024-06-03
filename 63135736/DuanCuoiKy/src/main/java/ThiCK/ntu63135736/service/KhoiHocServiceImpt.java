package ThiCK.ntu63135736.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.KhoiHocmodel;
import ThiCK.ntu63135736.responsitory.KhoiHocResponsitory;

@Service
public class KhoiHocServiceImpt implements KhoiHocService{
	@Autowired KhoiHocResponsitory khoiHocResponsitory;
	@Override
	public List<KhoiHocmodel> findallKhoiHocmodel(){
		return khoiHocResponsitory.findAll();
	}
	@Override
	public KhoiHocmodel findKhoiHocmodelByID(int id) {
		Optional<KhoiHocmodel> opt =khoiHocResponsitory.findById( id);
		if (opt.isPresent()) return opt.get();
		else return null;
	}
	@Override
	public void addKhoiHocmodel(KhoiHocmodel khoiHocmodel) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteKhoiHocmodel(int id) {
		// TODO Auto-generated method stub
		
	}

	
	

}
