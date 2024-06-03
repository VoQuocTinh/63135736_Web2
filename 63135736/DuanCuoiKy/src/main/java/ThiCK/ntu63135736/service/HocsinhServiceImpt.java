package ThiCK.ntu63135736.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.Hocsinhmodel;
import ThiCK.ntu63135736.responsitory.HocsinhResponsitory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class HocsinhServiceImpt implements HocsinhService{
	@Autowired HocsinhResponsitory hocsinhRepository;
	 @Autowired EntityManager entityManager;
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

	 @Override
	    public Page<Hocsinhmodel> findAll(Pageable pageable) {
	        return hocsinhRepository.findAll(pageable);
	    }

	 


	}


	
	
