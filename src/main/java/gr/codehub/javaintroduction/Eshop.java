/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.javaintroduction;

import gr.codehub.javaintroduction.domain.Category;
import gr.codehub.javaintroduction.domain.Customer;
import gr.codehub.javaintroduction.domain.Item;
import gr.codehub.javaintroduction.domain.Order;
import gr.codehub.javaintroduction.domain.OrderItem;
import gr.codehub.javaintroduction.repository.CustomerRepository;
import gr.codehub.javaintroduction.repository.ItemRepository;
import gr.codehub.javaintroduction.repository.impl.CustomerRepositoryImpl;
import gr.codehub.javaintroduction.repository.impl.ItemRepositoryImpl;
import gr.codehub.javaintroduction.service.MarketService;
import gr.codehub.javaintroduction.service.impl.MarketServiceImpl;
import gr.codehub.javaintroduction.utility.GeneralUtility;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author iracl
 */
public class Eshop {

    public static void main(String[] args) throws FileNotFoundException {
        MarketService market = new MarketServiceImpl();
        market.loadInitialCustomerData();
        market.loadInitialItemData();
        market.displayOrders(11);
    }
}
