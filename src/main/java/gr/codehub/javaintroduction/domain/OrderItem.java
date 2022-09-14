/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.domain;

import java.math.BigDecimal;

/**
 *
 * @author iracl
 */
public class OrderItem {
    private Item item;
    private int quantity;
    private BigDecimal itemPrice;
    private BigDecimal discount;
    private Order order;

    public OrderItem(Item item, int quantity, BigDecimal itemPrice, BigDecimal discount, Order order) {
        this.item = item;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        this.discount = discount;
        this.order = order;
    }

    public OrderItem() {
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    
    
}
