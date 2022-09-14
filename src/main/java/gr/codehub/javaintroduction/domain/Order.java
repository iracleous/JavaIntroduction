/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iracl
 */
public class Order {
    private Customer customer;
    private LocalDateTime date;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

   public Order(Customer customer, LocalDateTime date) {
        this.customer = customer;
        this.date = date;
    }
 
   


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    
     
//    public String header() {
//        return customer.header()+"," + item.header() + "," + "quantity,itemPrice,discount,date";
//    } 
//   public String toCsv() {
//        return  customer.toCsv() + "," + item.toCsv() + "," + quantity + "," + itemPrice + "," + discount + "," + date ;
//    }
    
    
}
