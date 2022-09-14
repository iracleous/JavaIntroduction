/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.utility;

import gr.codehub.javaintroduction.domain.Customer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author iracl
 */
public class CustomerUtility {
      public static boolean isValidEmail(String email){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
      
      public static boolean isValidcustomer(Customer customer){
        if (customer == null) return false;    
        
  //      if ("administrator".equals(customer.getFirstName())) return false;
        if (customer.getFirstName()!=null && customer.getFirstName().toLowerCase().equals("administrator")) return false;
        if (customer.getEmail().contains("@gmail.com")) return false;
        return true;
      }
}
