package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Department;
import za.ac.cput.domain.Doctor;
import za.ac.cput.repository.DoctorRepository;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Doctor;
import za.ac.cput.factory.DoctorFactory;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/*
DoctorRepositoryTest.java
DoctorRepositoryTest Class
Author: Ashlyn Jordan January 230577644
Date: 27 March 2025
*/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DoctorRepositoryTest {
 private static IDoctorRepository repository = DoctorRepository.getRepository();
 private static Doctor doctor1;
    private static Doctor doctor2;

@BeforeAll
static void setUp() {
     doctor1= DoctorFactory.createDoctor("231456","Mark","Daniels","Cardiologist",56457812,5, "Fully admitted","markDaniels@cput.ac.za","M","Occupied" );
    doctor2= DoctorFactory.createDoctor("785461","Anna","Clark","Neurologist",75481632,1, "Limited admitting","annaClark@cput.ac.za","F","Available" );

}
    @Test
    @Order(1)
    void create() {
        Doctor created1= repository.create(doctor1);
        Doctor created2= repository.create(doctor2);
        assertNotNull(created1);
        assertNotNull(created2);
        assertEquals("Mark",created1.getFirstName());
        assertEquals("Clark",created2.getLastName());
        System.out.println("Created:\n" + created1 + "\n");


    }

    @Test
    @Order(2)
    void read() {
//    Doctor read=repository.read("Mark");

        Doctor read = repository.read(doctor1.getDoctorID()); // Use doctorID instead of first name
        assertNotNull(read);
        assertEquals("Mark", read.getFirstName());
        assertEquals("Cardiologist", read.getSpecialization()); // Corrected specialization
        System.out.println("Read: " + read);

    }

    @Test
    @Order(3)
    void update() {

        Doctor updated = new Doctor.Builder()
                .setdoctorID(doctor1.getDoctorID()) // Use the existing doctorID
                .setFirstName("Mark")
                .setLastName("Daniels")
                .setSpecialization("Updated Cardiology")
                .setLicenceNumber(56457812)
                .setYearsOfExperience(5)
                .setHospitalAffiliation("Fully admitted")
                .setEmail("markDaniels@cput.ac.za")
                .setGender("M")
                .setAvailability("Occupied")
                .build();

        Doctor result = repository.update(updated);
        assertNotNull(result);
        assertEquals("Updated Cardiology", result.getSpecialization());
        assertEquals(56457812, result.getLicenceNumber());
        assertEquals(5, result.getYearsOfExperience());
        assertEquals("markDaniels@cput.ac.za", result.getEmail());
        assertEquals("Occupied", result.getAvailability());
        System.out.println("Updated: " + result);

    }

    @Test
    @Disabled
    @Order(4)
    void delete() {
    boolean deleted= repository.delete("785461");
    assertTrue(deleted);
        Doctor readAfterDelete = repository.read("Clark");
        assertNull(readAfterDelete);

        System.out.println("Deleted Doctor 785461");
    }

    @Test
    @Order(5)
    void getAll() {
        List<Doctor> doctorList = repository.getAll();
        assertNotNull(doctorList);
        assertFalse(doctorList.isEmpty());

        System.out.println("All Departments: " + doctorList);
    }
}