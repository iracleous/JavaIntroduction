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
public class Item implements Entity{
    private long id;
    private String name;
    private BigDecimal price;
    private Category category;

    public Item(long id, String name, BigDecimal price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
 

    public Item() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + '}';
    }
    
    public String header() {
        return "id,name,price,category";
    } 
   public String toCsv() {
        return  id + "," + name + "," + price + "," + category  ;
    }


@Override
public boolean isValid() {
	// TODO Auto-generated method stub
	return true;
}
    
}
