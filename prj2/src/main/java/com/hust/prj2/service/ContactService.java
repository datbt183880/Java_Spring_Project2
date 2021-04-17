package com.hust.prj2.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hust.prj2.model.Contact;

import java.util.List;

@Repository
public interface ContactService extends JpaRepository<Contact, Long>{
    //todo
    List<Contact> getContactByAge(int age);
}
