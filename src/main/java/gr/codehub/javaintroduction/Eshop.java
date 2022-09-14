/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction;

import gr.codehub.javaintroduction.domain.Category;
import gr.codehub.javaintroduction.domain.Customer;
import gr.codehub.javaintroduction.domain.Item;
import gr.codehub.javaintroduction.domain.Order;
import gr.codehub.javaintroduction.repository.CustomerRepository;
import gr.codehub.javaintroduction.repository.ItemRepository;
import gr.codehub.javaintroduction.repository.impl.CustomerRepositoryImpl;
import gr.codehub.javaintroduction.repository.impl.ItemRepositoryImpl;
import gr.codehub.javaintroduction.utility.GeneralUtility;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author iracl
 */
public class Eshop {

    public static void main(String[] args) throws FileNotFoundException {
        
         
        
         CustomerRepository  customerRepository = new CustomerRepositoryImpl();
        
           for (String currentCustomer: GeneralUtility.customers){
             String words[] = currentCustomer.split(",");
             //long id, String firstName, String surname, String tel, String email
             customerRepository.addCustomer( new Customer(
                     Long.parseLong(words[0]), words[1],words[2], words[3], words[4]));
          }
         
          ItemRepository itemRepository = new  ItemRepositoryImpl();
           
            for (String currentItem: GeneralUtility.items){
             String words[] = currentItem.split(",");
             //long id, String name, BigDecimal price, Category category
             itemRepository.addItem( new Item(
                     Long.parseLong(words[0]), words[1], new BigDecimal(words[2]),   Category.valueOf(words[3]) ));
          }
           
         System.out.println(""+ customerRepository.readCustomer(10L));
         
      System.out.println("Number of customers= "+ customerRepository.readCustomer().size());
        
        
        
//        Customer customer = new Customer(10L, "D", "Ir", "21066666",
//                "email@ggg.gr");
//        Item item = new Item(100L, "potatoes", new BigDecimal("1.20"),
//                Category.GROCERY);
//        System.out.println(""
//                + CustomerUtility.isValidEmail(customer.getEmail()));
//        Order order = new Order(customer, item, 1, item.getPrice(),
//                new BigDecimal("0"), LocalDateTime.now());
//        
//        String myOrderAsSting = order.toCsv();
//        String orderHeader = order.header();
//        System.out.println(orderHeader);
//        System.out.println(myOrderAsSting);
//        parseOrder(myOrderAsSting);
//        
//        
//        File file = new File("order.csv");
//        PrintWriter pw = new PrintWriter(file);
//        pw.println(orderHeader);
//        pw.println(myOrderAsSting);
//        pw.close();
        
    }

    /**
     * prints to sout the components of the Order string
     * @param myOrderAsSting
     */
    public static void parseOrder(String myOrderAsSting) {
        String[] words = myOrderAsSting.split(",");
        System.out.println("The details of the order are:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
