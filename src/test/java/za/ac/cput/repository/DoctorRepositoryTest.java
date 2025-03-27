package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Doctor;
import za.ac.cput.repository.DoctorRepository;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Doctor;
import za.ac.cput.factory.DoctorFactory;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/*
DoctorRepository.java
DoctorRepository Class
Author: Ashlyn Jordan January 230577644
Date: 25 March 2025
*/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DoctorRepositoryTest {
 private static IDoctorRepository repository = DoctorRepository.getRepository();
 private Doctor doctor= DoctorFactory.createDoctor("231456","Mark","Daniels","Cardiologist","56457812",5, "Fully admitted","markDaniels@cput.ac.za","M","Occupied" );


    @Test
    @Order(1)
    void create() {


    }

    @Test
    @Order(2)
    void read() {
    }

    @Test
    @Order(3)
    void update() {
    }

    @Test
    @Order(4)
    void delete() {
    }

    @Test
    @Order(5)
    void getAll() {
    }
}