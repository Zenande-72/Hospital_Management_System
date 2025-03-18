package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;

/*Appointment.java
Appointment Model Class
Author: Jamie-Lee Franse (230837484)
Date: 18th March 2025
 */


    public class Appointment {
        private int appointmentID;
        private String appointmentType;
        private String status;
        private LocalDate date;
        private LocalTime time;
        private String appointReason;
        private String paymentStatus;

        public Appointment() {
        }

        public Appointment(AppointmentBuilder builder) {
            this.appointmentID = builder.appointmentID;
            this.appointmentType = builder.appointmentType;
            this.status = builder.status;
            this.date = builder.date;
            this.time = builder.time;
            this.appointReason = builder.appointReason;
            this.paymentStatus = builder.paymentStatus;
        }

        public int getAppointmentID() { return appointmentID; }

        public String getAppointmentType() { return appointmentType; }

        public String getStatus() { return status; }

        public LocalDate getDate() { return date; }

        public LocalTime getTime() { return time; }

        public String getAppointReason() { return appointReason; }

        public String getPaymentStatus() { return paymentStatus; }


        @Override
        public String toString() {
            return "Appointment{" +
                    "appointmentID=" + appointmentID +
                    ", appointmentType='" + appointmentType + '\'' +
                    ", status='" + status + '\'' +
                    ", date=" + date +
                    ", time=" + time +
                    ", appointReason='" + appointReason + '\'' +
                    ", paymentStatus='" + paymentStatus + '\'' +
                    '}';
        }

        public static class AppointmentBuilder{
            private int appointmentID;
            private String appointmentType;
            private String status;
            private LocalDate date;
            private LocalTime time;
            private String appointReason;
            private String paymentStatus;

            public AppointmentBuilder setAppointmentID(int appointmentID) {
                this.appointmentID = appointmentID;
                return this;
            }

            public AppointmentBuilder setAppointmentType(String appointmentType) {
                this.appointmentType = appointmentType;
                return this;
            }

            public AppointmentBuilder setStatus(String status) {
                this.status = status;
                return this;
            }

            public AppointmentBuilder setDate(LocalDate date) {
                this.date = date;
                return this;
            }

            public AppointmentBuilder setTime(LocalTime time) {
                this.time = time;
                return this;
            }

            public AppointmentBuilder setAppointReason(String appointReason) {
                this.appointReason = appointReason;
                return this;
            }

            public AppointmentBuilder setPaymentStatus(String paymentStatus) {
                this.paymentStatus = paymentStatus;
                return this;
            }

            public AppointmentBuilder copy(Appointment appointment) {
                this.appointmentID = appointment.getAppointmentID();
                this.appointmentType = appointment.getAppointmentType();
                this.status = appointment.getStatus();
                this.date = appointment.getDate();
                this.time = appointment.getTime();
                this.appointReason = appointment.getAppointReason();
                this.paymentStatus = appointment.getPaymentStatus();
                return this;
            }

            public Appointment build() {
                return new Appointment(this);
            }
        }



    }

