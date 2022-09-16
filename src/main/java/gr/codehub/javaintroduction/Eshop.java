/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction;

 
import gr.codehub.javaintroduction.domain.Order;
import gr.codehub.javaintroduction.service.MarketService;
import gr.codehub.javaintroduction.service.impl.MarketServiceImpl;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 *
 * @author iracl
 */
public class Eshop {

    public static void main(String[] args)   {
        MarketService market = new MarketServiceImpl();
        market.loadInitialCustomerData();
        market.loadInitialItemData();
        
        market.displayItems();
        market.displayCustomers();
        
        long customerId = 11;
        long[] itemIds = new long[]{123, 127};
        
        Order order =  market.createOrder(23, customerId, itemIds);
    
        market.displayOrder(order.getId());
        
        
        
        
    }
}
