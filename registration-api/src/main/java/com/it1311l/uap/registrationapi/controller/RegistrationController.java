package com.it1311l.uap.registrationapi.controller;

import com.it1311l.uap.registrationapi.model.Attendee;
import com.it1311l.uap.registrationapi.repository.RegistrationMybatisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@RestController
public class RegistrationController {

	 @Autowired
	    RegistrationMybatisRepository registrationRepo;
	
    @PostMapping("/event/register")
    public Attendee register(@RequestBody Attendee student) {
    	registrationRepo.insert(student);
        return student;
    }
    
    @GetMapping("/attendees")
    public List<Attendee> getAttendees() {
        return registrationRepo.findAll();
    }
}
