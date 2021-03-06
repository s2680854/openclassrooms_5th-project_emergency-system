package com.safetynet.emergencysystem.service.person;

import com.safetynet.emergencysystem.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonDeletionService {

    @Autowired
    private PersonRepository personRepository;

    public void deletePersonById(Long id) {

        if (personRepository.existsById(id)) {
            personRepository.deleteById(id);
        }
    }
}
