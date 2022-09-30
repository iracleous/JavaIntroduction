package gr.codehub.javaintroduction.repository.impl;

import gr.codehub.javaintroduction.model.Customer;
import gr.codehub.javaintroduction.repository.CustomerRepository;
import jakarta.persistence.EntityManager;

public class DBCustomerRepositoryImpl extends DbRepositoryImpl<Customer, Long> implements CustomerRepository{

	public DBCustomerRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
	@Override
	public String getEntityClassName() {
		return Customer.class.getName();
	}

	@Override
	public Class<Customer> getEntityClass() {
		return Customer.class;
	}

}
