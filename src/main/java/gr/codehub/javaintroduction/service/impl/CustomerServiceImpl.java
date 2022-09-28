package gr.codehub.javaintroduction.service.impl;

import java.util.List;

import gr.codehub.javaintroduction.exception.CustomerException;
import gr.codehub.javaintroduction.model.Customer;
import gr.codehub.javaintroduction.service.CustomerService;
import jakarta.persistence.EntityManager;

public class CustomerServiceImpl implements CustomerService{

	private EntityManager entityManager;
	
	
	public CustomerServiceImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void addCustomer(Customer customer) throws CustomerException {
		// convention error
		// to be moved to the repository
		try {
			entityManager.getTransaction().begin();
            entityManager.persist(customer);
            entityManager.getTransaction().commit();
		}
		catch(Exception e) {
			throw new CustomerException("The customer has not been saved. Reason "+ e.getMessage());
		}
	}

	@Override
	public List<Customer> displayCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
