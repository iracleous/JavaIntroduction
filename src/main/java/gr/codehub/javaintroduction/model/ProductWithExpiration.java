/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.model;

import java.util.Date;

 

/**
 *
 * @author iracl
 */
public class ProductWithExpiration extends Product  {
        //attributes or fields
   
    private Date expirationDate;

    public ProductWithExpiration() {
    }

    public ProductWithExpiration(Date expirationDate, String name, double price, String code) {
        super(name, price, code);
        this.expirationDate = expirationDate;
    }
  

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    public void decreasePrice(double rate){
           if (rate>0 && rate<1){
               // setPrice(getPrice()*  (1 - rate));
               price *= (1-rate);
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "ProductWithExpiration{" + "expirationDate=" + expirationDate + '}';
    }

  

}
