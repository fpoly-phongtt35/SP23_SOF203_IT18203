/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b13;

/**
 *
 * @author phongtt
 */
public class Student {
    
    private Integer studentId;
    private String studentName;
    
    private Integer majorId; 

    public Student() {}
    
    public Student(Integer studentId, String studentName, Integer majorId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorId = majorId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + '}';
    }
}
