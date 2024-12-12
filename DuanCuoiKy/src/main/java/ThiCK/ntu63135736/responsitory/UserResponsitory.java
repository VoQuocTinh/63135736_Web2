package ThiCK.ntu63135736.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ThiCK.ntu63135736.model.Usermodel;

@Repository
public interface UserResponsitory extends JpaRepository<Usermodel, Integer> {

	Usermodel findUserByUsernameAndPassword(String username, String password);


	    
}
