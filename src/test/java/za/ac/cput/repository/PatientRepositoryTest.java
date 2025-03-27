package za.ac.cput.repository;

/*
PatientRepositoryTest.java
Patient Repository Test
Author: Zenande Kalipa
Date: 26 March 2025
 */

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Patient;
import za.ac.cput.factory.PatientFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PatientRepositoryTest {

    private static IPatientRepository repository = PatientRepository.getRepository();

    private Patient patient = PatientFactory.createPatient("022341278", "Zandile", "Nxumalo", "0753478922", "Female", LocalDate.of(1999, 2, 10));



    @Test

    void a_create() {
        Patient created = repository.create(patient);
        assertNotNull(created);
        System.out.println(created.toString());

    }

    @Test
    void b_read() {
        Patient read = repository.read(patient.getPatientID());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        Patient newPatient = new Patient.Builder().copy(patient).setFirstName("Bukhosi").build();
        Patient updated = repository.update(newPatient);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(patient.getPatientID()));
        System.out.println("Done: patient deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}
