/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.musicstore.transaction.repository;

import com.musicstore.transaction.entities.Transaction;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Itzel
 */
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    
    @Query("SELECT t FROM Transaction t WHERE t.cardNumber = ?1")
    public List<Transaction> findByCardNumber(String type);
}
