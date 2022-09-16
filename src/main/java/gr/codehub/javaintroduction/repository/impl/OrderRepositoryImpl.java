/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.repository.impl;

import gr.codehub.javaintroduction.domain.Order;
import gr.codehub.javaintroduction.domain.Order;
import gr.codehub.javaintroduction.repository.OrderRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iracl
 */
public class OrderRepositoryImpl implements OrderRepository{

    private final List<Order> orders;

    public OrderRepositoryImpl() {
         orders = new ArrayList<>();
    }
    //CR2UD

      // add  remove get  update   CR2UD   create read update delete

    /**
     *
     * @param order
     * @return
     */
    
    @Override
    public boolean addOrder (Order order){
        for (int index = 0; index < orders.size(); index++){
            if (orders.get(index).getId()== order.getId() )
                return false;
        }
        orders.add(order);
        return true;
    }
    
    /**
     *
     * @return
     */
    @Override
    public List<Order> readOrder(){
        return orders;
    }
    
    /**
     *
     * @param id
     * @return
     */
    @Override
    public Order readOrder(long id){
//        for (int index = 0; index < orders.size(); index ++){
//            if (orders.get(index).getId() == id)
//                return orders.get(index);
//        }
//        
        for (Order order:orders){
            if (order.getId() == id){
                   return order;
            }
        }
        return null; 
    }
    
    /**
     *
     * @param orderId
     * @param newPrice
     * @return
     */
    @Override
    public boolean updateOrder(long orderId, BigDecimal newPrice){
        Order order = readOrder(orderId);
        if( order == null) return false;
        
         
        return true;
    }
    
    /**
     *
     * @param orderId
     * @return
     */
    @Override
    public boolean deleteOrder(long orderId){
        Order order = readOrder(orderId);
        if( order == null) return false;
        orders.remove(order);
        return true;
    }
    
    
    
}
