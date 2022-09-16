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
import gr.codehub.javaintroduction.dto.OrderList;
import gr.codehub.javaintroduction.exception.CustomerException;
import gr.codehub.javaintroduction.repository.CustomerRepository;
import gr.codehub.javaintroduction.repository.ItemRepository;
import gr.codehub.javaintroduction.repository.OrderRepository;
import gr.codehub.javaintroduction.repository.impl.CustomerRepositoryImpl;
import gr.codehub.javaintroduction.repository.impl.ItemRepositoryImpl;
import gr.codehub.javaintroduction.repository.impl.OrderRepositoryImpl;
import gr.codehub.javaintroduction.service.MarketService;
import gr.codehub.javaintroduction.utility.GeneralUtility;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iracl
 */
public class MarketServiceImpl implements MarketService{

    private final CustomerRepository customerRepository;
    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;
    
    public MarketServiceImpl(){
        customerRepository = new CustomerRepositoryImpl();
        itemRepository = new ItemRepositoryImpl();
        orderRepository = new OrderRepositoryImpl();
    }
    
    @Override
    public void loadInitialCustomerData() {
       for (String currentCustomer: GeneralUtility.customers){
             String words[] = currentCustomer.split(",");
             //long id, String firstName, String surname, String tel, String email
             try{
                Customer customer = new Customer(
                        Long.parseLong(words[0]), words[1],words[2], words[3], words[4]);
                if (GeneralUtility.isValidcustomer(customer))
                      customerRepository.addCustomer(customer );
             }
             catch(CustomerException customerException){
                 System.out.println("The customer has not been added");
             }
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
    public Order createOrder(long orderId, long customerId, long[] itemIds) {
        Order order = new Order();
        order.setId(orderId);
        
        Customer customer = customerRepository.readCustomer(customerId);
        if (customer == null) return null;
        order.setCustomer(customer);
        order.setDate(LocalDateTime.now());
        
        for (long itemId: itemIds){
            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);
            Item item = itemRepository.readItem(itemId);
            if (item == null) continue;
            orderItem.setItem( item);
            orderItem.setItemPrice( item.getPrice());
            orderItem.setDiscount(BigDecimal.ZERO);
            orderItem.setQuantity(1);

            order.getOrderItems().add(orderItem);
        }
        orderRepository.addOrder(order);
        return order;
    }

      @Override
    public String displayOrder(long orderId) {
        Order order = orderRepository.readOrder(orderId);
        StringBuilder returnString = new StringBuilder();
        returnString.append("Order No. ").append(order.getId()).append("\n") 
            .append("Customer: ").append(order.getCustomer()).append("\n") 
            .append("Items in the order").append("\n");
        int index = 0;
        for (OrderItem item: order.getOrderItems()){
            returnString.append("")
                    .append(++index)
                    .append(". ")
                    .append(item)
                    .append("\n");
        }
        return returnString.toString();
   }
    
    
    
    @Override
    public String displayOrders(long customerId) {
        Customer customer = customerRepository.readCustomer(customerId);
        StringBuilder returnValue= new StringBuilder();
        returnValue.append(customer).append("\n");       
        for (Order order: orderRepository.readOrder()){
            if (order.getCustomer().getId() == customerId)
                    returnValue.append(order).append("\n");
        }
        return returnValue.toString();
   }

  
    
    
    @Override
    public String displayItems() {
        StringBuilder returnValue= new StringBuilder();
        returnValue.append("Available items");
        for(Item item: itemRepository.readItem()){
            returnValue.append( item);
        }
        returnValue.append("-------------------------------------------\n");
        return returnValue.toString();
    }

    @Override
    public String displayCustomers() {
        StringBuilder returnValue= new StringBuilder();
        returnValue.append("Available customers");
        for(Customer customer: customerRepository.readCustomer()){
            returnValue.append(customer);
        }
        returnValue.append("-------------------------------------------\n");
        return returnValue.toString();
    }
    
    
    @Override
    public OrderList getOrders(){
        OrderList orderList = new OrderList();
        List<Order> orders = new ArrayList<>();
        orderList.setOrders(orders);
        for(Order order: orderRepository.readOrder())
            orders.add(order);
        return orderList;
    }
}
