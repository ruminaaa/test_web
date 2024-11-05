package com.unejsi.springbootecommerce.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unejsi.springbootecommerce.entity.Contact;
import com.unejsi.springbootecommerce.service.ContactService;


@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:4200") // Pour autoriser les requêtes venant d'Angular
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public ResponseEntity<Contact> saveContact(@RequestBody Contact contact) {
        Contact savedContact = contactRepository.save(contact);
        return ResponseEntity.ok(savedContact);
    }
}

