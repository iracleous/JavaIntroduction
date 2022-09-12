/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author iracl
 */
public class Customer {
    private long id;
    private String firstName;
    private String surname;
    private String tel;
    private String email;

    public Customer(long id, String firstName, String surname, String tel, String email) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.tel = tel;
        this.email = email;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstName=" + firstName + ", surname=" + surname + ", tel=" + tel + ", email=" + email + '}';
    }
    
   public String header() {
        return "id,firstName,surname,tel,email";
    } 
   public String toCsv() {
        return  id + "," + firstName + "," + surname + "," + tel + "," + email ;
    }
    
}
