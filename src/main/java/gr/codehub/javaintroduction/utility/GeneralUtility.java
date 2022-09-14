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
public class GeneralUtility {
    
    //long id, String firstName, String surname, String tel, String email
    
  public static String[] customers = { 
      "11,Dimitris,Dimitriou,2107412345,dimitriou@codehub.gr",
      "12,Ertzan,Memet,2107411234,memet@codehub.gr",
      "13,Nikos,Nikolaou,210666665,nikolaou@codehub.gr"
  };
    //long id, String name, BigDecimal price, Category category
    public static String[] items = {
    "123,potatoes,1.30,GROCERY",
    "124,milk,1.20,DIARY"    
    };
    
    
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
        if (! isValidEmail(customer.getEmail())) return false;
        if (customer.getEmail().contains("@gmail.com")) return false;
        
        return true;
      }
      
      /**
     * prints to sout the components of the Order string
     * @param myOrderAsSting
     */
    public static void parseOrder(String myOrderAsSting) {
        String[] words = myOrderAsSting.split(",");
        System.out.println("The details of the order are:");
        for (String word : words) {
            System.out.println(word);
        }
    }
      
      
}
