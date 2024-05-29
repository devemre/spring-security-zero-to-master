package com.eazybytes.springsecsection9.repository;

import com.eazybytes.springsecsection9.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

}