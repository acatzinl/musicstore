/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.musicstore.product.repository;

import org.springframework.data.repository.CrudRepository;
import com.musicstore.product.entities.Product;

/**
 *
 * @author Itzel
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
