/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.cibertec.ecommerce.ApiCustomer.service;

import java.util.List;
import pe.edu.cibertec.ecommerce.ApiCustomer.Entity.Customer;


public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(Long id);

}
