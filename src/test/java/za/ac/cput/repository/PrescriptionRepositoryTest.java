package za.ac.cput.repository;
/*
PrescriptionRepositoryTest.java
PrescriptionRepositoryTest Class
Author: Kyran Gajoo 230971229
Date: 27 March 2025
*/
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Prescription;
import za.ac.cput.factory.PrescriptionFactory;
import za.ac.cput.util.Helper;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PrescriptionRepositoryTest {

    private PrescriptionRepository repository;
    private Prescription prescription;

    @BeforeEach
    void setUp() {
        repository = (PrescriptionRepository) PrescriptionRepository.getRepository();


        prescription = PrescriptionFactory.createPrescription(
                Helper.generateId(),
                "P1001",
                "D2002",
                "Paracetamol",
                "500mg",
                LocalDate.now()
        );

        repository.create(prescription);
    }

    @Test
    void testCreate() {
        assertNotNull(prescription);
        assertEquals("Paracetamol", prescription.getMedicineName());
    }

    @Test
    void testRead() {
        Prescription readPrescription = repository.read(prescription.getPrescriptionId());
        assertNotNull(readPrescription);
        assertEquals(prescription.getPrescriptionId(), readPrescription.getPrescriptionId());
    }

    @Test
    void testUpdate() {
        Prescription updatedPrescription = new Prescription.Builder()
                .setPrescriptionId(prescription.getPrescriptionId())  // Keep the same ID
                .setPatientId(prescription.getPatientId())
                .setDoctorId(prescription.getDoctorId())
                .setMedicineName("Ibuprofen")  // Changing medicine
                .setDosage("200mg")
                .setDuration("7 days")
                .setDateIssued(LocalDate.now())
                .build();

        repository.update(updatedPrescription);
        Prescription readUpdated = repository.read(prescription.getPrescriptionId());

        assertNotNull(readUpdated);
        assertEquals("Ibuprofen", readUpdated.getMedicineName());
    }

    @Test
    void testDelete() {
        boolean deleted = repository.delete(prescription.getPrescriptionId());
        assertTrue(deleted);
        assertNull(repository.read(prescription.getPrescriptionId()));
    }

    @Test
    void testGetAll() {
        List<Prescription> prescriptionList= repository.getAll();
        assertFalse(prescriptionList.isEmpty());
    }
}
