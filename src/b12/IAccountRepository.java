/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package b12;

import java.util.List;

/**
 *
 * @author phongtt
 */
public interface IAccountRepository {
    
    List<Account> findAll();
    
    Account findByUsername(String username);
}
