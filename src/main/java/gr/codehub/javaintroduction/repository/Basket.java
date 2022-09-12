/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.repository;

import gr.codehub.javaintroduction.model.Product;

/**
 *
 * @author iracl
 */
public class Basket {
    private static final int BASKET_SIZE = 4;
    
    private Product[] products = new Product[BASKET_SIZE];
    private int currentIndex;
    
    public boolean add(Product product){
        if (currentIndex < BASKET_SIZE){
            products[currentIndex] = product;
            currentIndex++;
            return true;
        }
        return false;
    }
    
    public void printAll(){
        for (int index = 0; index < currentIndex ;index++)
                products[index].print();
    }
    
}
