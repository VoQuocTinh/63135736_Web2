package ThiCK.ntu63135736.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.GiaoVienmodel;
import ThiCK.ntu63135736.model.Usermodel;

@Service
public interface UserService {
	List<Usermodel> findallUsermodel();
	Usermodel findUsermodelByID(int id);
    void addUsermodel(Usermodel usermodel);
    void deleteUsermodel(int id);

}

