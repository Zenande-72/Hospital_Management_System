package za.ac.cput.domain;

    import java.time.LocalDate;
    import java.time.LocalTime;

/*
Appointment.java
Appointment Class
Author: Jamie-Lee Franse 230837484
Date: 18 March 2025
 */

    public class Appointment {
        private String appointmentID;
        private String patientID;
        private String patientFirstName;
        private String patientLastName;
        private String appointmentType;
        private String AppointmentStatus;
        public LocalDate AppointmentDate;
        private LocalTime AppointmentTime;
        private String appointReason;
        private String paymentStatus;

        public Appointment() {
        }

        public Appointment(AppointmentBuilder builder) {
            this.appointmentID = builder.appointmentID;
            this.patientID = builder.patientID;
            this.patientFirstName = builder.patientFirstName;
            this.patientLastName = builder.patientLastName;
            this.appointmentType = builder.appointmentType;
            this.AppointmentStatus = builder.AppointmentStatus;
            this.AppointmentDate = builder.AppointmentDate;
            this.AppointmentTime = builder.AppointmentTime;
            this.appointReason = builder.appointReason;
            this.paymentStatus = builder.paymentStatus;
        }


        public String getAppointmentID() { return appointmentID; }

        public String getPatientID() { return patientID; }

        public String getPatientFirstName() { return patientFirstName; }

        public String getPatientLastName() { return patientLastName; }

        public String getAppointmentType() { return appointmentType; }

        public String getAppointmentStatus() { return AppointmentStatus; }

        public LocalDate getAppointmentDate() { return AppointmentDate; }

        public LocalTime getAppointmentTime() { return AppointmentTime; }

        public String getAppointReason() { return appointReason; }

        public String getPaymentStatus() { return paymentStatus; }

        @Override
        public String toString() {
            return "Appointment{" +
                    "appointmentID='" + appointmentID + '\'' +
                    ", patientID='" + patientID + '\'' +
                    ", patientFirstName='" + patientFirstName + '\'' +
                    ", patientLastName='" + patientLastName + '\'' +
                    ", appointmentType='" + appointmentType + '\'' +
                    ", AppointmentStatus='" + AppointmentStatus + '\'' +
                    ", AppointmentDate=" + AppointmentDate +
                    ", AppointmentTime=" + AppointmentTime +
                    ", appointReason='" + appointReason + '\'' +
                    ", paymentStatus='" + paymentStatus + '\'' +
                    '}';
        }

        public static class AppointmentBuilder{
            private String appointmentID;
            private String patientID;
            private String patientFirstName;
            private String patientLastName;
            private String appointmentType;
            public String AppointmentStatus;
            public LocalDate AppointmentDate;
            private LocalTime AppointmentTime;
            private String appointReason;
            private String paymentStatus;

            public AppointmentBuilder setAppointmentID(String appointmentID) {
                this.appointmentID = appointmentID;
                return this;
            }

            public AppointmentBuilder setPatientID(String patientID) {
                this.patientID = patientID;
                return this;
            }

            public AppointmentBuilder setPatientFirstName(String patientFirstName) {
                this.patientFirstName = patientFirstName;
                return this;
            }

            public AppointmentBuilder setPatientLastName(String patientLastName) {
                this.patientLastName = patientLastName;
                return this;
            }

            public AppointmentBuilder setAppointmentType(String appointmentType) {
                this.appointmentType = appointmentType;
                return this;
            }

            public AppointmentBuilder setAppointmentStatus(String appointmentStatus) {
                AppointmentStatus = appointmentStatus;
                return this;
            }

            public AppointmentBuilder setAppointmentDate(LocalDate appointmentDate) {
                AppointmentDate = appointmentDate;
                return this;
            }

            public AppointmentBuilder setAppointmentTime(LocalTime appointmentTime) {
                AppointmentTime = appointmentTime;
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
                this.patientID = appointment.getPatientID();
                this.patientFirstName = appointment.getPatientFirstName();
                this.patientLastName = appointment.getPatientLastName();
                this.appointmentType = appointment.getAppointmentType();
                this.AppointmentStatus = appointment.getAppointmentStatus();
                this.AppointmentDate = appointment.getAppointmentDate();
                this.AppointmentTime = appointment.getAppointmentTime();
                this.appointReason = appointment.getAppointReason();
                this.paymentStatus = appointment.getPaymentStatus();
                return this;
            }

            public Appointment build() { return new Appointment(this); }


        }



    }



