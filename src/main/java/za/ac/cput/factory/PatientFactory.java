package za.ac.cput.factory;
/*
PatientFactory.java
PatientFactory Class
Author: Zenande Kalipa 230012035
Date: 22 March 2025
 */

import za.ac.cput.domain.Patient;

import java.time.LocalDate;

public class PatientFactory {

    public static Patient createPatient(String patientID, String firstName, String lastName, String cellNumber, String gender, LocalDate dateOfBirth) {
        if (firstName.isEmpty() || firstName == null)
            return null;

        if (lastName.isEmpty() || lastName == null)
            return null;

        if (cellNumber.isEmpty() || cellNumber == null)
            return null;

        if (gender.isEmpty() || gender == null)
            return null;

        if (patientID.isEmpty() || patientID == null)
            return null;

        return new Patient.Builder().setPatientID(patientID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setCellNumber(cellNumber)
                .setGender(gender)
                .setDateOfBirth(dateOfBirth)
                .build();



    }
}
