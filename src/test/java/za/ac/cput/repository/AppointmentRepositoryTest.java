package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Appointment;
import za.ac.cput.factory.AppointmentFactory;
import za.ac.cput.repository.AppointmentRepository;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/*
AppointmentRepository.java
AppointmentRepository Class
Author: Jamie-Lee Franse 230837484
Date: 25 March 2025
*/

@TestMethodOrder(MethodOrderer.MethodName.class)
class AppointmentRepositoryTest {

    private static IAppointmentRepository repository = AppointmentRepository.getRepository();
    private Appointment appointment = AppointmentFactory.createAppointment("A514", "P100", "Jayden", "McKnight", "In-Person", "Scheduled", LocalDate.now().plusDays(1),LocalTime.of(10,30), "Consultation", "Paid");

    @Test
    @Order(1)
    void create() {
        Appointment created = repository.create(appointment);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    @Order(2)
    void read() {
        Appointment read = repository.read(appointment.getAppointmentID());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    @Order(3)
    void update() {
        Appointment newAppointment = new Appointment.AppointmentBuilder().copy(appointment).setAppointmentStatus("Cpmpleted").build();
        Appointment updated = repository.update(newAppointment);
        assertNotNull(updated);
        System.out.println(updated.toString());

    }

    @Test
    @Disabled
    @Order(4)
    void delete() {
        assertTrue(repository.delete(appointment.getAppointmentID()));
        System.out.println("appointment has been deleted");
    }

    @Test
    @Order(5)
    void getAll() {
        System.out.println(repository.getAll());
    }
}
