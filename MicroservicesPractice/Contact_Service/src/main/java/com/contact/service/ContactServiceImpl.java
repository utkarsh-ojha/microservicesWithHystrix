package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {


    //Fake list of contacts

    List <Contact> list = List.of(
            new Contact(1L,"Utk@gmail.com", "Utkarsh Ojha", 1311L),
            new Contact(2L,"kri@gmail.com", "Kritika Ojha", 1312L),
            new Contact(2L,"urm@gmail.com", "Urmila Ojha", 1313L)
    );

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
