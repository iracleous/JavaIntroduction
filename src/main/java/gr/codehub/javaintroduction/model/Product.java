/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.model;

/**
 *
 * @author iracl
 */
public abstract class Product implements Printer {
    
    //attributes or fields
    protected String name = "Product";
    protected double price = 1.;
    protected String code = "C";

    //constructors
    
    public Product(String name,  double price,   String code){
        this.name = name;
        this.code = code;
        this.price = price;
    }
    
     public Product( ){
     }    
     
     public Product( String code){
        this.code = code;
    }
     
    //methodes,  setters-getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", code=" + code + '}';
    }
    
   /// utilities
    public void increasePrice(double rate){
        if (rate>0 && rate<1){
            price *= (1 + rate);
        }
    }
     public void increasePrice(int rate){
        if (rate>0 && rate<100){
            price *= (1 + rate/100);
        }
    }
     
   @Override
    public void print() {
        System.out.println(toString());
    }
     
}
