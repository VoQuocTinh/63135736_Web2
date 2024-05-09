package ThiCK.ntu63135736.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.Hocsinhmodel;
import ThiCK.ntu63135736.responsitory.HocsinhResponsitory;

import java.util.List;
import java.util.Optional;

@Service
public class HocsinhServiceImpt implements HocsinhService{
	@Autowired HocsinhResponsitory hocsinhRepository;
	@Override
	public List<Hocsinhmodel> findallHocsinhmodel(){
		return hocsinhRepository.findAll();
	}

	@Override
	public Hocsinhmodel findHocsinhmodelByID(int id) {
		Optional<Hocsinhmodel> opt =hocsinhRepository.findById( id);
		if (opt.isPresent()) return opt.get();
		else return null;
	}

	@Override
	public void addHocsinhmodel(Hocsinhmodel hocsinhmodel) {
		hocsinhRepository.save(hocsinhmodel);
	}

	@Override
	public void deleteHocsinhmodel(int id) {
		hocsinhRepository.deleteById(id);
	}
	@Override
	public void editHocsinhmodel(Hocsinhmodel hocsinhmodel) {
		hocsinhRepository.save(hocsinhmodel);
	}


}
