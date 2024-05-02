package ThiCK.ntu63135736.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ThiCK.ntu63135736.model.LopHocmodel;

@Repository
public interface LopHocResponsitory extends JpaRepository<LopHocmodel, Integer> {

}
