package gr.codehub.javaintroduction.service.impl;

import java.util.List;
import java.util.Optional;

import gr.codehub.javaintroduction.exception.CustomerException;
import gr.codehub.javaintroduction.model.Customer;
import gr.codehub.javaintroduction.repository.Repository;
import gr.codehub.javaintroduction.service.CustomerService;
import jakarta.persistence.EntityManager;

public class CustomerServiceImpl implements CustomerService{

	private Repository<Customer, Long>  customerRepository;
	public CustomerServiceImpl(Repository<Customer, Long> customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public void addCustomer(Customer customer) throws CustomerException {
		Optional<Customer> customerDb = customerRepository.add(customer);
		if (customerDb.isEmpty())
			throw new CustomerException("The customer has not been saved.");
	}

	@Override
	public List<Customer> displayCustomer() {
		return customerRepository.read(1, 20);
	}

}
