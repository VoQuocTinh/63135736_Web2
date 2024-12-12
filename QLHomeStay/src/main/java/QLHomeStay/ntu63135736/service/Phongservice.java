package QLHomeStay.ntu63135736.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import QLHomeStay.ntu63135736.model.Phongmodel;

@Service
public interface Phongservice {
	 public List<Phongmodel> getAllPhongs();
	    public void savePhong(Phongmodel phong);
	    public Phongmodel getPhongById(int id);
	    public void deletePhongById(int id);
	    public Page<Phongmodel> getAllPhongs(Pageable pageable);
	    void updatePhong(Phongmodel phong);
}
