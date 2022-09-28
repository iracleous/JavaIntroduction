/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.repository.impl;

import java.util.List;

import gr.codehub.javaintroduction.domain.Order;

/**
 *
 * @author iracl
 */
public class OrderRepositoryImpl extends RepositoryImpl<Order>{

   

    public OrderRepositoryImpl(List<Order> listOrder) {
        super(listOrder);
    }
  
    
}
