package com.safetynet.emergencysystem.dao;

import com.safetynet.emergencysystem.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> getByAddress(String address);
    List<Person> getByFirstNameAndLastName(String firstName, String lastName);
    List<Person> getByCity(String city);
}
