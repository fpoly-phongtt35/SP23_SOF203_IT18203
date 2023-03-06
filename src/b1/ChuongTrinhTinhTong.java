/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author phongtt
 */
public class ChuongTrinhTinhTong {
    
    public static void main(String[] args) {
        JFrame tinhTongForm = new JFrame("PhongTT35");
        
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        tinhTongForm.setLayout(layout);
        
        tinhTongForm.setSize(300, 70);
        
        JLabel lbX = new JLabel("X");
        tinhTongForm.add(lbX);
        
        JTextField txtX = new JTextField();
        txtX.setColumns(10);
        tinhTongForm.add(txtX);
        
        tinhTongForm.setVisible(true);
    }
    
}
