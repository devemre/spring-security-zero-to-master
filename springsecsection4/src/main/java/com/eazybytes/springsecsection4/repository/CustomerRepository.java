package com.eazybytes.springsecsection4.repository;

import com.eazybytes.springsecsection4.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByEmail(String email);

}
