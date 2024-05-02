package ThiCK.ntu63135736.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.Hocsinhmodel;
import ThiCK.ntu63135736.model.LopHocmodel;
import ThiCK.ntu63135736.responsitory.LopHocResponsitory;

@Service
public class LopHocServiceImpt implements LopHocService{
	@Autowired LopHocResponsitory lopHocResponsitory;
	@Override
	public List<LopHocmodel> findallLopHocmodel(){
		return lopHocResponsitory.findAll();
	}
	@Override
	public LopHocmodel findLopHocmodelByID(int id) {
		Optional<LopHocmodel> opt =lopHocResponsitory.findById( id);
		if (opt.isPresent()) return opt.get();
		else return null;
	}
	@Override
	public void addLopHocmodel(LopHocmodel lopHocmodel) {
		lopHocResponsitory.save(lopHocmodel);
	}
	@Override
	public void deleteLopHocmodel(int id) {
		lopHocResponsitory.deleteById(id);
	}

	


}
