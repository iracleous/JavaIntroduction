/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.repository.impl;


import gr.codehub.javaintroduction.domain.Item;
import gr.codehub.javaintroduction.repository.ItemRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iracl
 */
public class ItemRepositoryImpl extends RepositoryImpl<Item> implements ItemRepository{
 
    

    public ItemRepositoryImpl(List<Item> itemList) {
        super(itemList);
    }
    //CR2UD

      // add  remove get  update   CR2UD   create read update delete

   
    
    /**
     *
     * @param itemId
     * @param newPrice
     * @return
     */
    @Override
    public boolean updateItem(long itemId, BigDecimal newPrice){
        Item item = read(itemId);
        if( item == null) return false;
        
         item.setPrice(newPrice);
        return true;
    }
    
   
    
    
}
