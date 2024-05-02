package QLBH_ABC.ntu63135736.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import QLBH_ABC.ntu63135736.model.Customer;
import QLBH_ABC.ntu63135736.responsitories.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerRepository customerRepository;
	@Override
	public List<Customer> findAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findCustomerByID(int id) {
		Optional<Customer> opt =customerRepository.findById( id);
		if (opt.isPresent()) return opt.get();
		else return null;
	}

	@Override
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	@Override
	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}
	 @Override
	    public void themKhachHang(Customer customer) {
	        customerRepository.save(customer);
	    }
	 @Override
	 public void editCustomer(Customer customer) {
		 customerRepository.save(customer);
	 }
 }
