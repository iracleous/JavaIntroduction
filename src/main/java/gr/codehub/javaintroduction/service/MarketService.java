/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.service;

import gr.codehub.javaintroduction.domain.Order;
import gr.codehub.javaintroduction.dto.OrderList;

/**
 *
 * @author iracl
 */
public interface MarketService {
    void loadInitialCustomerData();
    void loadInitialItemData();
    Order createOrder(long orderId, long customerId, long[] itemIds);
    
    String displayOrders(long customerId);
    String displayOrder(long orderId);
    
    String displayItems();
    String displayCustomers();
    
    OrderList getOrders(); 
    
    
}
