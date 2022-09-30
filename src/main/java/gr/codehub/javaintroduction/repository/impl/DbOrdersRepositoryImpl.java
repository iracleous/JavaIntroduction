package gr.codehub.javaintroduction.repository.impl;

import gr.codehub.javaintroduction.model.Orders;
import gr.codehub.javaintroduction.repository.OrdersRepository;
import jakarta.persistence.EntityManager;

public class DbOrdersRepositoryImpl extends DbRepositoryImpl<Orders, Long> 
			implements OrdersRepository{

	 public DbOrdersRepositoryImpl(EntityManager entityManager) {
		 super(entityManager);
	 }

	@Override
	public String getEntityClassName() {
		return Orders.class.getName();
	}

	@Override
	public Class<Orders> getEntityClass() {
		return Orders.class;
	}

}
