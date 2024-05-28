package com.eazybytes.springsecsection7.repository;

import com.eazybytes.springsecsection7.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

}