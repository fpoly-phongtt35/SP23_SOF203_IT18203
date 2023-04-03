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
public class MajorRamRepository {
    
    private static final List<Major> majors = new ArrayList<Major>();
    static {
        majors.add(new Major(1, "Lập trình Java"));
        majors.add(new Major(2, "Ứng dụng phần mềm"));
        majors.add(new Major(3, "Lập trình C#"));
    }
    
    public List<Major> findAll() {
        return majors;
    }
}
