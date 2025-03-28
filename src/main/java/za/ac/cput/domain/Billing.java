package za.ac.cput.domain;

import java.time.LocalDate;
import java.util.Date;
/* Billing.Java
   Billing Class
   Author: Aviwe Jaxa 222208546
   Date: 18 March 2025
 */

public class Billing {
    private String billId;
    private LocalDate billingDate;
    private String patientFirstName;
    private String patientLastName;
    private double medicalCharges;
    private double hospitalCharges;
    private double finalAmount;
    private String paymentStatus;
    private String paymentMethod;
    private String insuranceProvider;
    private String doctorFirstName;
    private String doctorLastName;

public Billing() {

}
    public Billing(Builder builder){
    this.billId = builder.billId;
    this.billingDate = builder.billingDate;
    this.patientFirstName = builder.patientFirstName;
    this.patientLastName = builder.patientLastName;
    this.medicalCharges = builder.medicalCharges;
    this.hospitalCharges = builder.hospitalCharges;
    this.finalAmount = builder.finalAmount;
    this.paymentStatus = builder.paymentStatus;
    this.paymentMethod = builder.paymentMethod;
    this.insuranceProvider = builder.insuranceProvider;
    this.doctorFirstName = builder.doctorFirstName;
    this.doctorLastName = builder.doctorLastName;
    }
    public String getBillId() {
        return billId;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public double getMedicalCharges() {
        return medicalCharges;
    }

    public double getHospitalCharges() {
        return hospitalCharges;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "billId='" + billId + '\'' +
                ", billingDate=" + billingDate +
                ", patientFirstName='" + patientFirstName + '\'' +
                ", patientLastName='" + patientLastName + '\'' +
                ", medicalCharges=" + medicalCharges +
                ", hospitalCharges=" + hospitalCharges +
                ", finalAmount=" + finalAmount +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", insuranceProvider='" + insuranceProvider + '\'' +
                ", doctorFirstName='" + doctorFirstName + '\'' +
                ", doctorLastName='" + doctorLastName + '\'' +
                '}';
    }

    public static class Builder{
        private String billId;
        private LocalDate billingDate;
        private String patientFirstName;
        private String patientLastName;
        private double medicalCharges;
        private double hospitalCharges;
        private double finalAmount;
        private String paymentStatus;
        private String paymentMethod;
        private String insuranceProvider;
        private String doctorFirstName;
        private String doctorLastName;

        public Builder setBillId(String billId) {
            this.billId = billId;
            return this;
        }

        public Builder setBillingDate(LocalDate billingDate) {
            this.billingDate = billingDate;
            return this;
        }

        public Builder setPatientFirstName(String patientFirstName) {
            this.patientFirstName = patientFirstName;
            return this;
        }

        public Builder setPatientLastName(String patientLastName) {
            this.patientLastName = patientLastName;
            return this;
        }

        public Builder setMedicalCharges(double medicalCharges) {
            this.medicalCharges = medicalCharges;
            return this;
        }

        public Builder setHospitalCharges(double hospitalCharges) {
            this.hospitalCharges = hospitalCharges;
            return this;
        }

        public Builder setFinalAmount(double finalAmount) {
            this.finalAmount = finalAmount;
            return this;
        }

        public Builder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setInsuranceProvider(String insuranceProvider) {
            this.insuranceProvider = insuranceProvider;
            return this;
        }

        public Builder setDoctorFirstName(String doctorFirstName) {
            this.doctorFirstName = doctorFirstName;
            return this;
        }

        public Builder setDoctorLastName(String doctorLastName) {
            this.doctorLastName = doctorLastName;
            return this;
        }
        public Builder copy (Billing billing){
            this.billId = billing.getBillId();
            this.billingDate = billing.getBillingDate();
            this.patientFirstName = billing.getPatientFirstName();
            this.patientLastName = billing.getPatientLastName();
            this.medicalCharges = billing.getMedicalCharges();
            this.hospitalCharges = billing.getHospitalCharges();
            this.finalAmount = billing.getFinalAmount();
            this.paymentStatus = billing.getPaymentStatus();
            this.paymentMethod = billing.getPaymentMethod();
            this.insuranceProvider = billing.getInsuranceProvider();
            this.doctorFirstName = billing.getDoctorFirstName();
            this.doctorLastName = billing.getDoctorLastName();
            return this;
        }
        public Billing build() {
            return new Billing(this);
        }
    }
}
