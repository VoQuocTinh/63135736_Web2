package ThiCK.ntu63135736.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ThiCK.ntu63135736.model.Hocsinhmodel;
import ThiCK.ntu63135736.responsitory.HocsinhResponsitory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class HocsinhServiceImpt implements HocsinhService{
	@Autowired HocsinhResponsitory hocsinhRepository;
	 @Autowired EntityManager entityManager;
	@Override
	public List<Hocsinhmodel> findallHocsinhmodel(){
		return hocsinhRepository.findAll();
	}

	@Override
	public Hocsinhmodel findHocsinhmodelByID(int id) {
		Optional<Hocsinhmodel> opt =hocsinhRepository.findById( id);
		if (opt.isPresent()) return opt.get();
		else return null;
	}

	@Override
	public void addHocsinhmodel(Hocsinhmodel hocsinhmodel) {
		hocsinhRepository.save(hocsinhmodel);
	}

	@Override
	public void deleteHocsinhmodel(int id) {
		hocsinhRepository.deleteById(id);
	}
	@Override
	public void editHocsinhmodel(Hocsinhmodel hocsinhmodel) {
		hocsinhRepository.save(hocsinhmodel);
	}

	 @Override
	    public Page<Hocsinhmodel> findAll(Pageable pageable) {
	        return hocsinhRepository.findAll(pageable);
	    }

	 @Override
	 public Hocsinhmodel search(String hoc_sinh_id, String ho_dem, String ten, Date ngay_sinh, String lop_id, String gioi_tinh) {
	     // Tạo câu truy vấn JPQL
	     StringBuilder jpql = new StringBuilder("SELECT h FROM Hocsinhmodel h WHERE 1=1");

	     // Xử lý các tham số tìm kiếm
	     if (hoc_sinh_id != null && !hoc_sinh_id.isEmpty()) {
	         jpql.append(" AND h.hoc_sinh_id = :hoc_sinh_id");
	     }
	     if (ho_dem != null && !ho_dem.isEmpty()) {
	         jpql.append(" AND h.ho_dem LIKE :ho_dem");
	     }
	     if (ten != null && !ten.isEmpty()) {
	         jpql.append(" AND h.ten LIKE :ten");
	     }
	     if (ngay_sinh != null) {
	         jpql.append(" AND h.ngay_sinh = :ngay_sinh");
	     }
	     if (lop_id != null && !lop_id.isEmpty()) {
	         jpql.append(" AND h.lop_id = :lop_id");
	     }
	     if (gioi_tinh != null && !gioi_tinh.isEmpty()) {
	         jpql.append(" AND h.gioi_tinh = :gioi_tinh");
	     }

	     // Tạo và thực thi truy vấn
	     TypedQuery<Hocsinhmodel> query = entityManager.createQuery(jpql.toString(), Hocsinhmodel.class);
	     // Gán giá trị cho các tham số
	     if (hoc_sinh_id != null && !hoc_sinh_id.isEmpty()) {
	         query.setParameter("hoc_sinh_id", hoc_sinh_id);
	     }
	     if (ho_dem != null && !ho_dem.isEmpty()) {
	         query.setParameter("ho_dem", "%" + ho_dem + "%");
	     }
	     if (ten != null && !ten.isEmpty()) {
	         query.setParameter("ten", "%" + ten + "%");
	     }
	     if (ngay_sinh != null) {
	         query.setParameter("ngay_sinh", ngay_sinh);
	     }
	     if (lop_id != null && !lop_id.isEmpty()) {
	         query.setParameter("lop_id", lop_id);
	     }
	     if (gioi_tinh != null && !gioi_tinh.isEmpty()) {
	         query.setParameter("gioi_tinh", gioi_tinh);
	     }

	     // Trả về kết quả tìm kiếm đầu tiên hoặc null nếu không tìm thấy
	     List<Hocsinhmodel> resultList = query.getResultList();
	     return resultList.isEmpty() ? null : resultList.get(0);
	 }



	}


	
	
