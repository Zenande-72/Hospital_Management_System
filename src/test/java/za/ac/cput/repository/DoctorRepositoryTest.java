package za.ac.cput.repository;

/*
DoctorRepositoryTest.java
Doctor Repository Test
Author : Ashlyn Jordan January
Date : 26 March 2025
 */

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Doctor;
import za.ac.cput.repository.DoctorRepository;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Doctor;
import za.ac.cput.factory.DoctorFactory;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DoctorRepositoryTest {
 private static IDoctorRepository repository = DoctorRepository.getRepository();
 private Doctor doctor= DoctorFactory.createDoctor("231456","Mark","Daniels","Cardiologist",56457812,5, "Fully admitted","markDaniels@cput.ac.za","M","Occupied" );


    @Test
    @Order(1)
    void create() {
       Doctor created= repository.create(doctor);
       assertNotNull(created);
       System.out.println(created.toString());


    }

    @Test
    @Order(2)
    void read() {
       Doctor read = repository.read(doctor.getDoctorID());
       assertNotNull(read);
       System.out.println(read.toString());

    }

    @Test
    @Order(3)
    void update() {
       Doctor newDoctor = new Doctor.Builder().copy(doctor).setFirstName("Carlos").build();
       Doctor updated = repository.update(newDoctor);
       assertNotNull(updated);
       assertNotNull(updated.toString());
    }

    @Test
    @Disabled
    @Order(4)
    void delete() {
       assertTrue(repository.delete(doctor.getDoctorID()));
       System.out.println("Doctor has been deleted");
    }

    @Test
    @Order(5)
    void getAll() {
       System.out.println(repository.getAll());
    }
}