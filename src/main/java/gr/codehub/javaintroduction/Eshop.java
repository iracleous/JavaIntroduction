/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction;

 
import gr.codehub.javaintroduction.domain.Order;
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
        //initialization
        MarketService market = new MarketServiceImpl();
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
