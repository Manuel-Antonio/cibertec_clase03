/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.ecommerce.ApiCustomer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ecommerce.ApiCustomer.DAO.CustomerRepository;
import pe.edu.cibertec.ecommerce.ApiCustomer.Entity.Customer;

/**
 *
 * @author SUITE
 */
@Service
public class CustomerServiceImpl implements CustomerService{
// INjeccion de dependencias
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return (List<Customer>)customerRepository.findAll();
    
    }

    @Override
    public Customer findById(Long id) {
        return (Customer)customerRepository.findById(id).orElse(null);
        
    }
    
}
