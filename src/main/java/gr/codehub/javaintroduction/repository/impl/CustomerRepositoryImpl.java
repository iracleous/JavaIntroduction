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
public class CustomerRepositoryImpl extends RepositoryImpl<Customer> 
	implements CustomerRepository{
 
    public CustomerRepositoryImpl(List<Customer> customerList) {
         super(customerList);
    }
   
    // add  remove get  update   CR2UD   create read update delete

   
    /**
     *
     * @param customerId
     * @param newEmail
     * @return
     */
    @Override
    public boolean updateCustomer(long customerId, String newEmail){
        Customer customer = read(customerId);
        if( customer == null) return false;
        
        for (Customer curCustomer:read()){
            if (curCustomer.getEmail()!=null && curCustomer.getEmail().equals(newEmail)){
                   return false;
            }
        }
        
        customer.setEmail(newEmail);
        return true;
    }
    
    
    
}
