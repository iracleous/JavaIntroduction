package gr.codehub.javaintroduction.service;

import java.util.List;

import gr.codehub.javaintroduction.exception.CustomerException;
import gr.codehub.javaintroduction.model.Customer;

public interface CustomerService {

	void addCustomer(Customer customer) throws CustomerException;
	List<Customer> displayCustomer();
	
}
