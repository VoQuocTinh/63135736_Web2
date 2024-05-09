package ThiCK.ntu63135736.service;

import java.util.List;
import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.Hocsinhmodel;


@Service
public interface HocsinhService {
	List<Hocsinhmodel> findallHocsinhmodel();
	Hocsinhmodel findHocsinhmodelByID(int id);
    void addHocsinhmodel(Hocsinhmodel hocsinhmodel);
    void deleteHocsinhmodel(int id);
    void editHocsinhmodel(Hocsinhmodel hocsinhmodel);

}
