/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.repository;

import gr.codehub.javaintroduction.domain.Customer;
import java.util.List;

/**
 *
 * @author iracl
 */
public interface CustomerRepository extends Repository<Customer>{

     boolean updateCustomer(long customerId, String newEmail);

}
