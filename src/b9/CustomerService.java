/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b9;

import java.util.List;

/**
 *
 * @author phongtt
 */
public class CustomerService {
    
    private CustomerRepository repository = new CustomerRepository(); 
    
    public List<Customer> getAll() {
        return repository.findAll();
    }
    
    public List<Customer> findByName(String searchName) {
        return repository.findByName(searchName);
    }
    
    public int delete(Integer deletedId) {
        return repository.deleteById(deletedId);
    }
}
