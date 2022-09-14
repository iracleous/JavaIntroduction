/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.repository;

import gr.codehub.javaintroduction.domain.Customer;
import gr.codehub.javaintroduction.utility.CustomerUtility;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iracl
 */
public class CustomerRepository {
    private final List<Customer> customers ;

    public CustomerRepository() {
         customers = new ArrayList<>();
    }
   
    // add  remove get  update   CR2UD   create read update delete
    
    public boolean addCustomer (Customer customer){
        
        for (int index = 0; index < customers.size(); index++){
            if (customers.get(index).getId()== customer.getId() )
                return false;
        }
        
       if (! CustomerUtility.isValidcustomer(customer)) 
           return false;
        customers.add(customer);
        return true;
    }
    
    public List<Customer> readCustomer(){
        return customers;
    }
    
    public Customer readCustomer(long id){
//        for (int index = 0; index < customers.size(); index ++){
//            if (customers.get(index).getId() == id)
//                return customers.get(index);
//        }
//        
        for (Customer customer:customers){
            if (customer.getId() == id){
                   return customer;
            }
        }
        return null; 
    }
    
    public boolean updateEmail(long customerId, String newEmail){
        Customer customer = readCustomer(customerId);
        if( customer == null) return false;
        
        for (Customer curCustomer:customers){
            if (curCustomer.getEmail()!=null && curCustomer.getEmail().equals(newEmail)){
                   return false;
            }
        }
        
        customer.setEmail(newEmail);
        return true;
    }
    
    public boolean deleteCustomer(long customerId){
        Customer customer = readCustomer(customerId);
        if( customer == null) return false;
        customers.remove(customer);
        return true;
    }
    
}
