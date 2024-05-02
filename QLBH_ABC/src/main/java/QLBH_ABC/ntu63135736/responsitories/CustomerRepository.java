package QLBH_ABC.ntu63135736.responsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import QLBH_ABC.ntu63135736.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>  {
}
