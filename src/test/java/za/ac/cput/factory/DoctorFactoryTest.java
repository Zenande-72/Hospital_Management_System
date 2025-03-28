package za.ac.cput.factory;

import org.junit.jupiter.api.*;

import za.ac.cput.domain.Department;
import za.ac.cput.domain.Doctor;

import za.ac.cput.repository.DoctorRepository;

import static org.junit.jupiter.api.Assertions.*;
/*
DoctorFactoryTest.java
DoctorFactoryTest Class
Author: Ashlyn Jordan January 230577644
Date: 27 March 2025

*/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DoctorFactoryTest {
    private static DoctorRepository repository = DoctorRepository.getRepository();
    private static Doctor doctor1= DoctorFactory.createDoctor("12578","Luke","Spies","Family Doctor",12345,4,"Fully admitted","spiesL@gmail.com", "M","Occupied");
    private static Doctor doctor2= DoctorFactory.createDoctor("12668","Lara","Flude","Family Medicine",678910,2,"Fully admitted","LaraFlude@gmail.com", "F","Available");
    private static Doctor doctor3= DoctorFactory.createDoctor("12778","Daniel","Spenders","Cardiologist",147852,1,"Not admitted","danielSpenders@gmail.com", "M","Occupied");

    @Test
    @Order(1)
    public void testCreateDoctor(){
        Doctor created = repository.create(doctor1);
        assertNotNull(created);
        assertEquals(doctor1.getDoctorID(), created.getDoctorID());

        System.out.println(created.toString());

    }
  @Test
  @Order(2)
    public void testReadDoctor(){
      assertNotNull(doctor2);
      System.out.println(doctor2.toString());


  }

  @Test
  @Order(3)
    public void testCreateDoctorthatFails(){
//        fail();
      assertNotNull(doctor3);
      System.out.println(doctor3.toString());
  }

    @Test
    @Order(4)
    @Disabled
    void delete() {
        boolean deleted = repository.delete(doctor3.getDoctorID());
        assertTrue(deleted);
        System.out.println("Deleted: " + doctor3.getDoctorID());
    }
  @Test
  @Order(5)
  @Disabled
    public void testNotImplementedYet(){

  }
    @Test
    @Order(6)
    void getAll() {
        assertNotNull(repository.getAll());
        System.out.println("All Doctors in the hospital: " + repository.getAll());
    }
}