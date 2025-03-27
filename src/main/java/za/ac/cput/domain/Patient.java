package za.ac.cput.domain;
/*
Patient.Java
Patient Class
Author: Zenande Kalipa 230012035
Date: 18 March 2025
 */

import java.time.LocalDate;

public class Patient {
    private String patientID;
    private String firstName;
    private String lastName;
    private String cellNumber;
    private String gender;
    private LocalDate dateOfBirth;

    public Patient(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.cellNumber = builder.cellNumber;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
    }

    public String getPatientID() {
        return patientID;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID='" + patientID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public static class Builder {
        private String patientID;
        private String firstName;
        private String lastName;
        private String cellNumber;
        private String gender;
        private LocalDate dateOfBirth;

        public Builder setPatientID(String patientID) {
            this.patientID = patientID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Patient.Builder copy(Patient patient) {
            this.patientID = patient.getPatientID();
            this.firstName = patient.getFirstName();
            this.lastName = patient.getLastName();
            this.cellNumber = patient.getCellNumber();
            this.gender = patient.getGender();
            this.dateOfBirth = patient.getDateOfBirth();
            return this;
        }

        public Patient build() { return new Patient (this);}


    }
}
