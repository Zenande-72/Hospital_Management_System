package za.ac.cput.factory;

/*
PrescriptionFactoryTest.java
PrescriptionFactoryTest Class
Author: Kyran Gajoo 230971229
Date: 27 March 2025
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Prescription;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PrescriptionFactoryTest {

    @Test
    void testCreatePrescription_Success() {
        Prescription prescription = PrescriptionFactory.createPrescription(
                Helper.generateId(),
                "P1001",
                "D2002",
                "Paracetamol",
                "500mg",
                 LocalDate.now()
        );

        assertNotNull(prescription);
        assertNotNull(prescription.getPrescriptionId());
        assertEquals("Paracetamol", prescription.getMedicineName());
    }

    @Test
    void testCreatePrescription_Failure_NullValues() {
        Prescription prescription = PrescriptionFactory.createPrescription(
                null,
                "P1001",
                "D2002",
                "Paracetamol",
                "500mg",
                LocalDate.now()
        );

        assertNull(prescription, "Prescription should be null when ID is missing");
    }

    @Test
    void testCreatePrescription_Failure_EmptyFields() {
        Prescription prescription = PrescriptionFactory.createPrescription(
                "",
                "P1001",
                "D2002",
                "",
                "500mg",
                LocalDate.now()
        );

        assertNull(prescription, "Prescription should be null when required fields are empty");
    }
}

