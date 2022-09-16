/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.repository;

import gr.codehub.javaintroduction.domain.Order;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author iracl
 */
 
public interface OrderRepository {
    boolean addOrder(Order order);
    List<Order> readOrder();
    Order readOrder(long orderId);
    boolean updateOrder(long orderId, BigDecimal newPrice);
    boolean deleteOrder(long orderId);
}