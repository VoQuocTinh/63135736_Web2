package ThiCK.ntu63135736.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.GiaoVienmodel;
import ThiCK.ntu63135736.model.Usermodel;
import ThiCK.ntu63135736.responsitory.GiaoVienResponsitory;

@Service
public class GiaoVienServiceImpt implements GiaoVienService{
	@Autowired GiaoVienResponsitory giaoVienResponsitory;
	
	@Override
	public List<GiaoVienmodel> findallGiaoVienmodel(){
		return giaoVienResponsitory.findAll();
	}
	@Override
	public GiaoVienmodel findGiaoVienmodelByID(int id) {
		Optional<GiaoVienmodel> opt =giaoVienResponsitory.findById( id);
		if (opt.isPresent()) return opt.get();
		else return null;
	}
	@Override
	public void addGiaoVienmodel(GiaoVienmodel giaoVienmodel) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteGiaoVienmodel(int id) {
		// TODO Auto-generated method stub
		
	}

}
	 
