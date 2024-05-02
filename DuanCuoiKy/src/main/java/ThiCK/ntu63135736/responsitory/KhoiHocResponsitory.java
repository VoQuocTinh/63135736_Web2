package ThiCK.ntu63135736.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ThiCK.ntu63135736.model.KhoiHocmodel;

@Repository
public interface KhoiHocResponsitory extends JpaRepository<KhoiHocmodel, Integer> {
}
