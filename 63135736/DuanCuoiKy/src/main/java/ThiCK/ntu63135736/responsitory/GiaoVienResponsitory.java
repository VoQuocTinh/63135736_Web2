package ThiCK.ntu63135736.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ThiCK.ntu63135736.model.GiaoVienmodel;

@Repository
public interface GiaoVienResponsitory extends JpaRepository<GiaoVienmodel, Integer> {

}
