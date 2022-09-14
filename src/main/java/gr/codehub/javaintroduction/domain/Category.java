/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.domain;

/**
 *
 * @author iracl
 */
public enum Category {
   
    GROCERY("grocery product"), 
    DIARY("diary product"), 
    CANDIES("sugar based products"), 
    SNACKS("small snacks");
    
    private final String name;
    
    private Category(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
    
}
