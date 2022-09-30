package gr.codehub.javaintroduction;

import gr.codehub.javaintroduction.exception.CustomerException;
import gr.codehub.javaintroduction.jpautil.JpaUtil;
import gr.codehub.javaintroduction.model.Customer;
import gr.codehub.javaintroduction.repository.CustomerRepository;
import gr.codehub.javaintroduction.repository.impl.DBCustomerRepositoryImpl;
import gr.codehub.javaintroduction.service.CustomerService;
import gr.codehub.javaintroduction.service.impl.CustomerServiceImpl;
import jakarta.persistence.EntityManager;

public class JpaTest {
	public static void main(String [] args) throws CustomerException {
		
		EntityManager entityManager = JpaUtil.getEntityManager();
		
		CustomerRepository customerRepository = new DBCustomerRepositoryImpl(entityManager);
		
		CustomerService customerService = new CustomerServiceImpl(customerRepository);
		
		Customer customer = new Customer();
		customer.setFirstName("Dimitris");
		customer.setEmail("maria@mail.com");
 		customer.setTel("4444");
		customer.setSurname("Ioannou");
		customerService.addCustomer(customer);
		
		System.out.println("Customer id "+ customer.getId());
		
		
		JpaUtil.shutdown();
	}
}
