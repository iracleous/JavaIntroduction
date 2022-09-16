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
    private long id;
    private Customer customer;
    private LocalDateTime date;
    private final List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

   public Order(long id, Customer customer, LocalDateTime date) {
        this.id = id;
        this.customer = customer;
        this.date = date;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Order{" + "customer=" + customer + ", date=" + date + ", orderItems=" + orderItems + '}';
    }
    
    
}
