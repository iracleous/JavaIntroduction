package gr.codehub.javaintroduction;

import java.sql.Date;

import gr.codehub.javaintroduction.exception.CustomerException;
import gr.codehub.javaintroduction.jpautil.JpaUtil;
import gr.codehub.javaintroduction.model.Customer;
import gr.codehub.javaintroduction.model.Orders;
import gr.codehub.javaintroduction.repository.CustomerRepository;
import gr.codehub.javaintroduction.repository.OrdersRepository;
import gr.codehub.javaintroduction.repository.impl.DBCustomerRepositoryImpl;
import gr.codehub.javaintroduction.repository.impl.DbOrdersRepositoryImpl;
import gr.codehub.javaintroduction.service.CustomerService;
import gr.codehub.javaintroduction.service.impl.CustomerServiceImpl;
import jakarta.persistence.EntityManager;

public class JpaTest {
	public static void main(String [] args) throws CustomerException {
		
		EntityManager entityManager = JpaUtil.getEntityManager();
		
		CustomerRepository customerRepository = new DBCustomerRepositoryImpl(entityManager);
		
		CustomerService customerService = new CustomerServiceImpl(customerRepository);
		
		OrdersRepository ordersRepository = new DbOrdersRepositoryImpl(entityManager);
		
		Customer customer = new Customer();
		customer.setFirstName("Dimitris");
		customer.setEmail("maria@mail.com");
 		customer.setTel("4444");
		customer.setSurname("Ioannou");
		customerService.addCustomer(customer);
		
		System.out.println("Customer id "+ customer.getId());
		
		
		Orders order = new Orders();
		order.setCreationDate(new Date(122, 8,30));
		order.setCustomer(customer);
		ordersRepository.add(order);
		
		
		
		Customer customer2 = new Customer();
		customer2.setFirstName("Nikos");
		customer2.setEmail("maria@mail.com");
 		customer2.setTel("4444");
		customer2.setSurname("Ioannou");
		customerService.addCustomer(customer2);
		
		
		
		
		JpaUtil.shutdown();
	}
}
