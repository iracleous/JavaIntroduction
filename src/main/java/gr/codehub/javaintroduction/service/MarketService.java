/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.service;

import gr.codehub.javaintroduction.domain.Order;

/**
 *
 * @author iracl
 */
public interface MarketService {
    void loadInitialCustomerData();
    void loadInitialItemData();
    Order createOrder(long orderId, long customerId, long[] itemIds);
    
    void displayOrders(long customerId);
    void displayOrder(long orderId);
    
    void displayItems();
    void displayCustomers();
    
     
    
    
}
