package com.unejsi.springbootecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unejsi.springbootecommerce.controller.ContactRepository;
import com.unejsi.springbootecommerce.entity.Contact;
@Service
public class ContactService {

     @Autowired
    private ContactRepository contactRepository;  // Injection de votre repository

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);  // Utilisez l'instance injectée
    }

}
