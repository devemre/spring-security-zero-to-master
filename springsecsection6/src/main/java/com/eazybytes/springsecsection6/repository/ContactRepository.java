package com.eazybytes.springsecsection6.repository;

import com.eazybytes.springsecsection6.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

}