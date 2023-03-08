/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author phongtt
 */
public class ChuongTrinhTinhTuoi {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Chương trình tính tuổi");
        
        // Cấu hình bố cục căn trái
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        frame.setLayout(layout);
        
        // Thêm nhãn
        JLabel lbNamSinh = new JLabel("Năm sinh");
        frame.add(lbNamSinh);
        
        // Thêm ô nhập
        JTextField txtNamSinh = new JTextField();
        txtNamSinh.setColumns(5);
        frame.add(txtNamSinh);
        
        // Thêm nút
        JButton btnTinhTuoi = new JButton("Tính tuổi");
        frame.add(btnTinhTuoi);
        
        // Thêm sự kiện khi ấn nút
        btnTinhTuoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // Lấy chuỗi người dùng nhập
                String namSinhStr = txtNamSinh.getText();
                
                // Convert Chuỗi -> Số
                Integer namSinh = Integer.valueOf(namSinhStr);
                
                // Tính tuổi = Năm hiện tại - Năm sinh
                Integer tuoi = 2023 - namSinh;
                
                JOptionPane.showMessageDialog(null, tuoi + " tuổi");
            }
        });
        
        frame.pack(); // Tự động bố cục, không cần setSize();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Hiển thị
    }
}
