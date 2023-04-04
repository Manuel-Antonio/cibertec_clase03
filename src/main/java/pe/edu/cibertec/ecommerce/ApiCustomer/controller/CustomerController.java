/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.ecommerce.ApiCustomer.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.ecommerce.ApiCustomer.Entity.Customer;
import pe.edu.cibertec.ecommerce.ApiCustomer.service.CustomerService;

// RestFull
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/findAll")
    public List<Customer> findAll() {
        return customerService.findAll();

    }

    @GetMapping("/findById/{id}")
    public Customer findById(@PathVariable Long id) {
        return customerService.findById(id);

    }

}
