package za.ac.cput.factory;

import za.ac.cput.domain.Billing;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

/* Billing.Java
   Billing Class
   Author: Aviwe Jaxa 222208546
   Date: 18 March 2025
 */

public class BillingFactory {
    public static Billing createBilling(String billId, LocalDate billingDate, String patientFirstName,
                                        String patientLastName, double medicalCharges, double hospitalCharges, double finalAmount,
                                        String paymentStatus, String paymentMethod, String insuranceProvider, String doctorFirstName,
                                        String doctorLastName) {
        if (Helper.isNullOrEmpty(billId) ||
                Helper.isNullOrEmpty(patientFirstName) ||
                Helper.isNullOrEmpty(String.valueOf(medicalCharges)) ||
                Helper.isNullOrEmpty(String.valueOf(hospitalCharges)) ||
                Helper.isNullOrEmpty(String.valueOf(finalAmount)) ||
                Helper.isNullOrEmpty(insuranceProvider) ||
                Helper.isNullOrEmpty(doctorFirstName))

            return null;

        return new Billing.Builder().setBillId(billId)
                .setBillingDate(billingDate)
                .setPatientFirstName(patientFirstName)
                .setPatientLastName(patientLastName)
                .setMedicalCharges(medicalCharges)
                .setHospitalCharges(hospitalCharges)
                .setFinalAmount(finalAmount)
                .setPaymentStatus(paymentStatus)
                .setPaymentMethod(paymentMethod)
                .setInsuranceProvider(insuranceProvider)
                .setDoctorFirstName(doctorFirstName)
                .setDoctorLastName(doctorLastName)
                .build();
    }

    public static Billing createBilling(String billId, LocalDate billingDate, String patientFirstName,
                                        String patientLastName, String doctorFirstName, String doctorLastName) {
        if (Helper.isNullOrEmpty(billId) ||
                Helper.isNullOrEmpty(String.valueOf(billingDate)) ||
                Helper.isNullOrEmpty(patientFirstName) ||
                Helper.isNullOrEmpty(patientLastName) ||
                Helper.isNullOrEmpty(doctorFirstName) ||
                Helper.isNullOrEmpty(doctorLastName))
            return null;
        return new Billing.Builder().setBillId(billId)
                .setBillingDate(billingDate)
                .setPatientFirstName(patientFirstName)
                .setPatientLastName(patientLastName)
                .setDoctorFirstName(doctorFirstName)
                .setDoctorLastName(doctorLastName)
                .build();

    }
}
