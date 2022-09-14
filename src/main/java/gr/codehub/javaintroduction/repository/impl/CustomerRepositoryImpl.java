/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.repository.impl;

import gr.codehub.javaintroduction.domain.Customer;
import gr.codehub.javaintroduction.repository.CustomerRepository;
import gr.codehub.javaintroduction.utility.GeneralUtility;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iracl
 */
public class CustomerRepositoryImpl implements CustomerRepository{
    private final List<Customer> customers ;

    public CustomerRepositoryImpl() {
         customers = new ArrayList<>();
    }
   
    // add  remove get  update   CR2UD   create read update delete

    /**
     *
     * @param customer
     * @return
     */
    
    @Override
    public boolean addCustomer (Customer customer){
        
        for (int index = 0; index < customers.size(); index++){
            if (customers.get(index).getId()== customer.getId() )
                return false;
        }
        
       if (! GeneralUtility.isValidcustomer(customer)) 
           return false;
        customers.add(customer);
        return true;
    }
    
    /**
     *
     * @return
     */
    @Override
    public List<Customer> readCustomer(){
        return customers;
    }
    
    /**
     *
     * @param id
     * @return
     */
    @Override
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
    
    /**
     *
     * @param customerId
     * @param newEmail
     * @return
     */
    @Override
    public boolean updateCustomer(long customerId, String newEmail){
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
    
    /**
     *
     * @param customerId
     * @return
     */
    @Override
    public boolean deleteCustomer(long customerId){
        Customer customer = readCustomer(customerId);
        if( customer == null) return false;
        customers.remove(customer);
        return true;
    }
    
}
