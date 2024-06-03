package QLHomeStay.ntu63135736.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import QLHomeStay.ntu63135736.model.Phongmodel;
import QLHomeStay.ntu63135736.responsitory.Phongresponsitory;

@Service
public class PhongserviceImpt implements Phongservice {

    @Autowired
    private Phongresponsitory phongRepository;

    @Override
    public List<Phongmodel> getAllPhongs() {
        return phongRepository.findAll();
    }

    @Override
    public void savePhong(Phongmodel phong) {
        phongRepository.save(phong);
    }

    @Override
    public Phongmodel getPhongById(int id) {
        return phongRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePhongById(int id) {
        phongRepository.deleteById(id);
    }

	@Override
	public Page<Phongmodel> getAllPhongs(Pageable pageable) {
		 return phongRepository.findAll(pageable);
	}

	@Override
	public void updatePhong(Phongmodel phong) {
		 if (phongRepository.existsById(phong.getMaphong())) {
	            phongRepository.save(phong);
	        }
	}

	
	}
