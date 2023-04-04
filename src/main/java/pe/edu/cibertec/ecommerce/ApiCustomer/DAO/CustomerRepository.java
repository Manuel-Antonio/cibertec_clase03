/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.cibertec.ecommerce.ApiCustomer.DAO;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.ecommerce.ApiCustomer.Entity.Customer;

/**
 *
 * @author SUITE
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{
    
}
