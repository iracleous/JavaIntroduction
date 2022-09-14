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
public class ItemRepositoryImpl implements ItemRepository{
    
    private final List<Item> items;

    public ItemRepositoryImpl() {
         items = new ArrayList<>();
    }
    //CR2UD

      // add  remove get  update   CR2UD   create read update delete

    /**
     *
     * @param item
     * @return
     */
    
    @Override
    public boolean addItem (Item item){
        for (int index = 0; index < items.size(); index++){
            if (items.get(index).getId()== item.getId() )
                return false;
        }
        items.add(item);
        return true;
    }
    
    /**
     *
     * @return
     */
    @Override
    public List<Item> readItem(){
        return items;
    }
    
    /**
     *
     * @param id
     * @return
     */
    @Override
    public Item readItem(long id){
//        for (int index = 0; index < items.size(); index ++){
//            if (items.get(index).getId() == id)
//                return items.get(index);
//        }
//        
        for (Item item:items){
            if (item.getId() == id){
                   return item;
            }
        }
        return null; 
    }
    
    /**
     *
     * @param itemId
     * @param newPrice
     * @return
     */
    @Override
    public boolean updateItem(long itemId, BigDecimal newPrice){
        Item item = readItem(itemId);
        if( item == null) return false;
        
         item.setPrice(newPrice);
        return true;
    }
    
    /**
     *
     * @param itemId
     * @return
     */
    @Override
    public boolean deleteItem(long itemId){
        Item item = readItem(itemId);
        if( item == null) return false;
        items.remove(item);
        return true;
    }
    
    
}
