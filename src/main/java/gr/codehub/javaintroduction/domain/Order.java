/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author iracl
 */
public class Order {
    private Customer customer;
    private Item  item;
    private int quantity;
    private BigDecimal itemPrice;
    private BigDecimal discount;
    private LocalDateTime date;

    public Order(Customer customer, Item item, int quantity, BigDecimal itemPrice, BigDecimal discount, LocalDateTime date) {
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        this.discount = discount;
        this.date = date;
    }

    public Order() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" + "customer=" + customer + ", item=" + item + ", quantity=" + quantity + ", itemPrice=" + itemPrice + ", discount=" + discount + ", date=" + date + '}';
    }
	
 
    public String header() {
        return customer.header()+"," + item.header() + "," + "quantity,itemPrice,discount,date";
    } 
   public String toCsv() {
        return  customer.toCsv() + "," + item.toCsv() + "," + quantity + "," + itemPrice + "," + discount + "," + date ;
    }
    
    
    
}
