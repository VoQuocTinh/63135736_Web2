package ThiCK.ntu63135736.responsitory;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ThiCK.ntu63135736.model.Hocsinhmodel;


@Repository
public interface HocsinhResponsitory extends JpaRepository<Hocsinhmodel, Integer> {
	
}
