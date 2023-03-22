/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8;

import b7.DbConnector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author phongtt
 */
public class Sql2List {
    
    public static void main(String[] args) throws Exception {
        
        // 1. Kết nối đến CSDL
        Connection connection = DbConnector.getConnection();
        
        // 2. Viết caau truy vấn
        String query = "SELECT ProductId, ProductName FROM Product";
        Statement st = connection.createStatement();
        
        // 3. Thực thi câu lệnh
        ResultSet rs = st.executeQuery(query);
        
        // 4. Lấy kết quả
        ArrayList<Product> products = new ArrayList<Product>();
        while(rs.next()) {
            // Laasy duwx lieeuj tuwf Table
            Integer id = rs.getInt("ProductId");
            String name = rs.getString("ProductName");
            
            // Khowif taoj ddoois tuowjng ddeer theem vaof danh sachs
            Product product = new Product();
            product.setProductId(id);
            product.setProductName(name);
            
            products.add(product);
        }
        
        System.out.println("Số lượng bản ghi = " + products.size());
        
        // 5. Đosng kết nối
        rs.close();
        st.close();
        connection.close();
    }
}
