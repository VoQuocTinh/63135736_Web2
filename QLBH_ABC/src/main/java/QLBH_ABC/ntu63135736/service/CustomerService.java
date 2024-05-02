package QLBH_ABC.ntu63135736.service;

import java.util.List;
import org.springframework.stereotype.Service;

import QLBH_ABC.ntu63135736.model.Customer;
@Service
public interface CustomerService {
	List<Customer> findAllCustomer();
	Customer findCustomerByID(int id);
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
	void themKhachHang(Customer customer);
	void editCustomer(Customer customer);

}