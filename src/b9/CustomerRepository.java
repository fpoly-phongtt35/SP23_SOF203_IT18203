/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b9;

import b7.DbConnector;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author phongtt
 */
public class CustomerRepository {
    
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList();
        
        try {
            Connection connection = DbConnector.getConnection();
            String query = """
                           SELECT customer_id AS Id,
                                  first_name + ' ' + last_name  AS Name,
                                  email,
                                  date_of_birth AS DOB,
                                  debt AS Debt
                           FROM Customer
                           """;
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()) {
                Integer id = rs.getInt("Id");
                String name = rs.getString("Name");
                String email = rs.getString("email");
                Date dob = rs.getDate("DOB");
                BigDecimal debt = rs.getBigDecimal("Debt");
                
                Customer customer = new Customer();
                customer.setId(id);
                customer.setName(name);
                customer.setEmail(email);
                customer.setDob(dob);
                customer.setDebt(debt);
                
                customers.add(customer);
            }
            
        } catch (Exception ex) {
            System.out.println("Lỗi");
        }
        
        return customers;
    }
    
    public List<Customer> findByName(String searchName) {
        List<Customer> customers = new ArrayList();
        
        searchName = "'%" + searchName + "%'";
        try {
            Connection connection = DbConnector.getConnection();
            String query = """
                           SELECT customer_id AS Id,
                                  first_name + ' ' + last_name  AS Name,
                                  email,
                                  date_of_birth AS DOB,
                                  debt AS Debt
                           FROM Customer
                           WHERE Name LIKE 
                           """ + searchName;
            System.out.println(query);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()) {
                Integer id = rs.getInt("Id");
                String name = rs.getString("Name");
                String email = rs.getString("email");
                Date dob = rs.getDate("DOB");
                BigDecimal debt = rs.getBigDecimal("Debt");
                
                Customer customer = new Customer();
                customer.setId(id);
                customer.setName(name);
                customer.setEmail(email);
                customer.setDob(dob);
                customer.setDebt(debt);
                
                customers.add(customer);
            }
            
        } catch (Exception ex) {
            System.out.println("Lỗi");
        }
        
        return customers;
    }
    
    public int deleteById(Integer id) {
        int result = -1;
        try {
            Connection connection = DbConnector.getConnection();
            String query = """
                           DELETE FROM Customer WHERE customer_id = 
                           """ + id;
            System.out.println(query);
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(query);
            
        } catch (Exception ex) {
            System.out.println("Lỗi");
        }
        
        return result;
    }
}
