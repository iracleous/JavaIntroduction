/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.repository;

import gr.codehub.javaintroduction.domain.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author iracl
 */
public interface ItemRepository extends Repository<Item>{
 
    boolean updateItem(long itemId, BigDecimal newPrice);
 
}
