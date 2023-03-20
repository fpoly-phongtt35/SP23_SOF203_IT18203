/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b7;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author phongtt
 */
public class ReadAllProgram {
    
    public static void main(String[] args) throws Exception {
        // 1. Khởi tạo kết nối
        Connection connection = DbConnector.getConnection();
        
        // 2. Viết câu truy vấn
        String query = "SELECT ProductId, ProductName FROM Product";
        Statement statement = connection.createStatement();
        
        // 3. Thực thi và nhận kết quả
        ResultSet rs = statement.executeQuery(query);
        
        // 4. In kết quả
        while(rs.next()) {
            Integer id = rs.getInt("ProductId");
            String name = rs.getString("ProductName");
            
            System.out.println(id + " - " + name);
        }
    }
}
