/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8;

import b7.DbConnector;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author phongtt
 */
public class CudProduct {
    
    public static void main(String[] args) throws Exception {
        //delete(499);
        Product product = new Product();
        product.setProductName("Ahihi");
        product.setPrice(BigDecimal.valueOf(1000));
        product.setQuantity(999);
        create(product);
    }
    
    public static void create(Product product) throws Exception {
        // 1. Kết nối đến CSDL
        Connection connection = DbConnector.getConnection();
        
        // 2. Viết caau truy vấn
        String query = "INSERT INTO Product VALUES("
                + "'"+ product.getProductName() + "'" 
                + ","
                + product.getPrice()
                + ","
                + product.getQuantity()
                +")";
        System.out.println(query);
        Statement st = connection.createStatement();
        
        // 3. Thực thi câu lệnh
        int affectedRow = st.executeUpdate(query);
        System.out.println(affectedRow);
        
        st.close();
        connection.close();
    }
    
    public static void delete(Integer id) throws Exception {
        // 1. Kết nối đến CSDL
        Connection connection = DbConnector.getConnection();
        
        // 2. Viết caau truy vấn
        String query = "DELETE FROM Product WHERE ProductId = " + id;
        System.out.println(query);
        Statement st = connection.createStatement();
        
        // 3. Thực thi câu lệnh
        int affectedRow = st.executeUpdate(query);
        System.out.println(affectedRow);
        
        st.close();
        connection.close();
    }
    
    public static void update(Integer id, Product product) {
        
    }
}
