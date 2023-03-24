/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b9;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author phongtt
 */
public class Customer {
    
    private Integer id;
    private String name;
    private String email;
    private Date dob;
    private BigDecimal debt;

    public Customer() {
    }

    public Customer(Integer id, String name, String email, Date dob, BigDecimal debt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.debt = debt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }
    
    
    
}
