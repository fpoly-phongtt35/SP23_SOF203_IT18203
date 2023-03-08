/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author phongtt
 */
public class VerticalLayout {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        GridLayout layout = new GridLayout(4, 1); // dòng, cột
        frame.setLayout(layout);
        
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        
        // Câu 1
        JPanel pnCau1 = new JPanel(flowLayout);
        pnCau1.add(new JLabel("Trời làm màn chiếu, đất làm chăn"));
        frame.add(pnCau1);
        
        // Tự căn giữa các câu bên dưới....
        frame.add(new JLabel("Nhật nguyệt cùng ta một giấc nồng"));
        frame.add(new JLabel("Đêm khuya chẳng dám dang chân duỗi"));
        frame.add(new JLabel("Chỉ sợ sơn hà xã tắc nghiêng"));
        
        frame.pack();
        frame.setVisible(true);
    }
}
