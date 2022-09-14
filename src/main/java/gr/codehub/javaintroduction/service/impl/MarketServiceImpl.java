/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.service.impl;

import gr.codehub.javaintroduction.domain.Category;
import gr.codehub.javaintroduction.domain.Customer;
import gr.codehub.javaintroduction.domain.Item;
import gr.codehub.javaintroduction.domain.Order;
import gr.codehub.javaintroduction.domain.OrderItem;
import gr.codehub.javaintroduction.repository.CustomerRepository;
import gr.codehub.javaintroduction.repository.ItemRepository;
import gr.codehub.javaintroduction.repository.impl.CustomerRepositoryImpl;
import gr.codehub.javaintroduction.repository.impl.ItemRepositoryImpl;
import gr.codehub.javaintroduction.service.MarketService;
import gr.codehub.javaintroduction.utility.GeneralUtility;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author iracl
 */
public class MarketServiceImpl implements MarketService{

    private final CustomerRepository customerRepository;
    private final ItemRepository itemRepository;
    
    public MarketServiceImpl(){
        customerRepository = new CustomerRepositoryImpl();
        itemRepository = new ItemRepositoryImpl();
    }
    
    @Override
    public void loadInitialCustomerData() {
       for (String currentCustomer: GeneralUtility.customers){
             String words[] = currentCustomer.split(",");
             //long id, String firstName, String surname, String tel, String email
             
             Customer customer = new Customer(
                     Long.parseLong(words[0]), words[1],words[2], words[3], words[4]);
             if (GeneralUtility.isValidcustomer(customer))
                   customerRepository.addCustomer(customer );
          }
    }

    @Override
    public void loadInitialItemData() {
          for (String currentItem: GeneralUtility.items){
             String words[] = currentItem.split(",");
             //long id, String name, BigDecimal price, Category category
             itemRepository.addItem( new Item(
                     Long.parseLong(words[0]), words[1], new BigDecimal(words[2]), Category.valueOf(words[3]) ));
          }   
    }

    @Override
    public Order createOrder(long customerId, long[] itemIds) {
        Order order = new Order();
        Customer customer = customerRepository.readCustomer(customerId);
        if (customer == null) return null;
        order.setCustomer(customer);
        order.setDate(LocalDateTime.now());
        
        for (long itemId: itemIds){
            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);
            orderItem.setItem(itemRepository.readItem(itemId));
            orderItem.setItemPrice( itemRepository.readItem(itemId).getPrice());
            orderItem.setDiscount(BigDecimal.ZERO);
            orderItem.setQuantity(1);

            order.getOrderItems().add(orderItem);
        }
        return order;
    }

    @Override
    public void displayOrders(long customerId) {
        System.out.println("Order for customer 11" + createOrder(11, new long[]{123,124}));
   }
    
}
