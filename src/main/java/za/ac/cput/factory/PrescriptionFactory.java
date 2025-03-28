package za.ac.cput.factory;

import za.ac.cput.domain.Prescription;
import za.ac.cput.util.Helper;

import java.time.LocalDate;
import java.util.UUID;

/*
PrescriptionFactory.java
Factory class for Prescription
Author: Kyran Gajoo (230971229)
Date: 23 March 2025
*/

public class PrescriptionFactory {
    public static Prescription createPrescription(String patientId, String doctorId, String medicineName,
                                                  String dosage, String duration, LocalDate dateIssued) {

        if (Helper.isNullOrEmpty(patientId) ||
                Helper.isNullOrEmpty(doctorId) ||
                Helper.isNullOrEmpty(medicineName) ||
                Helper.isNullOrEmpty(dosage) ||
                Helper.isNullOrEmpty(duration)) {
            return null;
        }


        String prescriptionId = UUID.randomUUID().toString();


        return new Prescription.Builder()
                .setPrescriptionId(prescriptionId)
                .setPatientId(patientId)
                .setDoctorId(doctorId)
                .setMedicineName(medicineName)
                .setDosage(dosage)
                .setDuration(duration)
                .setDateIssued(LocalDate.now())
                .build();
    }
}