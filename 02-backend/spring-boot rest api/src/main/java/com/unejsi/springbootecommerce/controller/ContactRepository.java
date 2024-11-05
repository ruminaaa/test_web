package com.unejsi.springbootecommerce.controller;
import org.springframework.data.jpa.repository.JpaRepository;

import com.unejsi.springbootecommerce.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}