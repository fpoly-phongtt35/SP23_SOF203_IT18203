/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phongtt
 */
public class StudentRamRepository {
    
    private static final List<Student> students = new ArrayList<Student>();
    static {
        students.add(new Student(1, "TienNH21", 1));
        students.add(new Student(2, "NguyenVV4", 1));
        students.add(new Student(3, "HangNT169", 1));
        students.add(new Student(4, "LinhTD15", 2));
        students.add(new Student(5, "KhanhPG", 3));
        students.add(new Student(6, "HuyenNK6", 3));
    }
    
    public List<Student> findByMajorId(Integer majorId) {
        return students.stream()
                .filter(s -> s.getMajorId() == majorId)
                .toList();
    }
}
