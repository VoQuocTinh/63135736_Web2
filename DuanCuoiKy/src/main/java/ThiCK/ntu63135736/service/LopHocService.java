package ThiCK.ntu63135736.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.LopHocmodel;

@Service
public interface LopHocService {
	List<LopHocmodel> findallLopHocmodel();
	LopHocmodel findLopHocmodelByID(int id);
    void addLopHocmodel(LopHocmodel lopHocmodel);
    void deleteLopHocmodel(int id);
    List<LopHocmodel> getallLopHocmodels();

}
