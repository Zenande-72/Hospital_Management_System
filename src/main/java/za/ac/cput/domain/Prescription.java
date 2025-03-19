package za.ac.cput.domain;

/*Prescription.java
Prescription Model Class
Author: Kyran Gajoo (230971229)
Date: 18th March 2025
 */

import java.time.LocalDate;

public class Prescription {
    private String prescriptionId;
    private String patientId;
    private String doctorId;
    private String medicineName;
    private String dosage;
    private String duration;
    private LocalDate dateIssued;


    public Prescription() {}


    private Prescription(Builder builder) {
        this.prescriptionId = builder.prescriptionId;
        this.patientId = builder.patientId;
        this.doctorId = builder.doctorId;
        this.medicineName = builder.medicineName;
        this.dosage = builder.dosage;
        this.duration = builder.duration;
        this.dateIssued = builder.dateIssued;
    }


    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(LocalDate dateIssued) {
        this.dateIssued = dateIssued;
    }


    public static class Builder {
        private String prescriptionId;
        private String patientId;
        private String doctorId;
        private String medicineName;
        private String dosage;
        private String duration;
        private LocalDate dateIssued;

        public Builder setPrescriptionId(String prescriptionId) {
            this.prescriptionId = prescriptionId;
            return this;
        }

        public Builder setPatientId(String patientId) {
            this.patientId = patientId;
            return this;
        }

        public Builder setDoctorId(String doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Builder setMedicineName(String medicineName) {
            this.medicineName = medicineName;
            return this;
        }

        public Builder setDosage(String dosage) {
            this.dosage = dosage;
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = duration;
            return this;
        }

        public Builder setDateIssued(LocalDate dateIssued) {
            this.dateIssued = dateIssued;
            return this;
        }

        public Prescription build() {
            return new Prescription(this);
        }
    }


    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId='" + prescriptionId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", medicineName='" + medicineName + '\'' +
                ", dosage='" + dosage + '\'' +
                ", duration='" + duration + '\'' +
                ", dateIssued=" + dateIssued +
                '}';
    }
}