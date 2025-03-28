package za.ac.cput.factory;

import za.ac.cput.domain.Appointment;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalTime;

/*
AppointmentFactoryTest.java
AppointmentFactoryTest Class
Author: Jamie-Lee Franse 230837484
Date: 27 March 2025
*/

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AppointmentFactoryTest {
    private static Appointment appointment1 = AppointmentFactory.createAppointment("A112", "P221", "Aneesha", "Fortuin", "Virtual", "Scheduled", LocalDate.now().plusDays(1), LocalTime.of(12,45), "Surgery", "Paid");
    private static Appointment appointment2 = AppointmentFactory.createAppointment("A113", "P222", "Jayden", "Marsh", "In-person", "Completed", LocalDate.now().plusDays(2), LocalTime.of(10,15), "Blurred Vision", "Pending");
    private static Appointment appointment3 = AppointmentFactory.createAppointment("A114", "P223", "Zaid", "Cloete","Virtual", "Cancelled", LocalDate.now().plusDays(3), LocalTime.of(13,45), "Consultation", "Unpaid");

    @Test
    @Order(1)
     public void testCreateAppointment() {
        assertNotNull(appointment1);
        System.out.println(appointment1.toString());
    }

    @Test
    @Order(2)
    public void testCreateAppointmentWithAllAttributes() {
        assertNotNull(appointment2);
        System.out.println(appointment2.toString());
    }

        @Test
        @Order(3)
        public void testCreateAppointmentThatFails() {
           // fail();
            assertNull(appointment3);
            System.out.println(appointment3.toString());
        }

        @Test
    @Order(4)
    @Disabled
    public void testNotImplementedYet() {

    }
}

