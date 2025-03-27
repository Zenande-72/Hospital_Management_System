package za.ac.cput.factory;
import za.ac.cput.domain.Appointment;
import java.time.LocalDate;
import java.time.LocalTime;
import za.ac.cput.util.Helper;

/*
AppointmentFactory.java
AppointmentFactory Class
Author: Jamie-Lee Franse 230837484
Date: 22 March 2025

 */

public class AppointmentFactory {


    public static Appointment createAppointment(String appointmentID, String patientID, String patientFirstName,
                                                String patientLastName, String appointmentType,
                                                String AppointmentStatus, LocalDate AppointmentDate,
                                                LocalTime AppointmentTime, String appointReason, String paymentStatus) {

        if ( Helper.isNullOrEmpty(appointmentID) ||
                Helper.isNullOrEmpty(patientID) ||
                Helper.isNullOrEmpty(patientFirstName) ||
                Helper.isNullOrEmpty(patientLastName) ||
                Helper.isNullOrEmpty(appointmentType) ||
                Helper.isNullOrEmpty(AppointmentStatus) ||
                Helper.isNullOrEmpty(appointReason) ||
                Helper.isNullOrEmpty(paymentStatus)) {
            return null;
        }

        return new Appointment.AppointmentBuilder().setAppointmentID(appointmentID)
                .setPatientID(patientID)
                .setPatientFirstName(patientFirstName)
                .setPatientLastName(patientLastName)
                .setAppointmentType(appointmentType)
                .setAppointmentStatus(AppointmentStatus)
                .setAppointmentDate(AppointmentDate)
                .setAppointmentTime(AppointmentTime)
                .setAppointReason(appointReason)
                .setPaymentStatus(paymentStatus)
                .build();



        }
    }

