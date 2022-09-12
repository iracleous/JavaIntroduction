/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction.model;

/**
 *
 * @author iracl
 */
public class Customer {
    
    private String name;
    private String address;
    private int age;
    private double balance;
    private boolean registered;

    public Customer() {
    }

    public Customer(String name, String address, int age, double balance, boolean registered) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.balance = balance;
        this.registered = registered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address + ", age=" + age + ", balance=" + balance + ", registered=" + registered + '}';
    }
    
    
    
}
