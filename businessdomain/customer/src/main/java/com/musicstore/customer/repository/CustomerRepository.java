/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.musicstore.customer.repository;

import com.musicstore.customer.entities.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Itzel
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
      @Query("SELECT c FROM Customer c WHERE c.firstName = ?1")
      public Customer findByFirstName(String firstName);
    
}
