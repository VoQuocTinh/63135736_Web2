package ThiCK.ntu63135736.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.Usermodel;
import ThiCK.ntu63135736.responsitory.UserResponsitory;

@Service
public class UserServiceImpt implements UserService{
	@Autowired UserResponsitory userResponsitory;
	@Override
	public List<Usermodel> findallUsermodel(){
		return userResponsitory.findAll();
	}
	@Override
	public Usermodel findUsermodelByID(int id) {
		Optional<Usermodel> opt =userResponsitory.findById( id);
		if (opt.isPresent()) return opt.get();
		else return null;
	}
	@Override
	public void addUsermodel(Usermodel usermodel) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteUsermodel(int id) {
		// TODO Auto-generated method stub
		
	}
	}
