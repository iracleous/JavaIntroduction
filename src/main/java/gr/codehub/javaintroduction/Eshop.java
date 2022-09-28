/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction;

 
import java.util.ArrayList;
import java.util.List;

import gr.codehub.javaintroduction.domain.Customer;
import gr.codehub.javaintroduction.domain.Item;
import gr.codehub.javaintroduction.domain.Order;
import gr.codehub.javaintroduction.repository.CustomerRepository;
import gr.codehub.javaintroduction.repository.ItemRepository;
import gr.codehub.javaintroduction.repository.Repository;
import gr.codehub.javaintroduction.repository.impl.CustomerRepositoryImpl;
import gr.codehub.javaintroduction.repository.impl.ItemRepositoryImpl;
import gr.codehub.javaintroduction.repository.impl.OrderRepositoryImpl;
import gr.codehub.javaintroduction.service.MarketService;
import gr.codehub.javaintroduction.service.impl.MarketServiceImpl;

 
/**
 *
 * @author iracl
 */
public class Eshop {

    /**
     *
     * @param args
     */
    public static void main(String[] args)   {
    	
    	List<Customer> customers = new ArrayList<>();
    	List<Item> items = new ArrayList<>();
    	List<Order> orders = new ArrayList<>();
    	
    	CustomerRepository customerRepository = new CustomerRepositoryImpl(customers);
       	ItemRepository itemRepository = new ItemRepositoryImpl(items);
       	Repository<Order>  orderRepository = new OrderRepositoryImpl(orders);
          	
    	
    	
    	
        //initialization
        MarketService market = new MarketServiceImpl(customerRepository, 
        		itemRepository, orderRepository);
        market.loadInitialCustomerData();
        market.loadInitialItemData();
       
        //display of options
        System.out.println( market.displayItems());
        System.out.println(market.displayCustomers());
        
        //define data transfer objects
        long customerId = 11;
        long[] itemIds = new long[]{123, 127};
        long orderId = 23;
        
        //actions
        market.createOrder(orderId, customerId, itemIds);
        System.out.println(market.displayOrder(orderId)); 
    }
}
