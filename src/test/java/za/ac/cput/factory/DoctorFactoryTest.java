package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Doctor;

import static org.junit.jupiter.api.Assertions.*;
/*
DoctorFactoryTest.java
DoctorFactoryTest Class
Author: Ashlyn Jordan January 230577644
Date: 27 March 2025
*/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DoctorFactoryTest {
    private static Doctor doctor1= DoctorFactory.createDoctor("12578","Luke","Spies","Family Doctor",12345,4,"Fully admitted","spiesL@gmail.com", "M","Occupied");
    private static Doctor doctor2= DoctorFactory.createDoctor("12668","Lara","Flude","Family Medicine",678910,2,"Fully admitted","LaraFlude@gmail.com", "F","Available");
    private static Doctor doctor3= DoctorFactory.createDoctor("12778","Daniel","Spenders","Cardiologist",147852,1,"Not admitted","danielSpenders@gmail.com", "M","Occupied");

    @Test
    @Order(1)
    public void testCreateDoctor(){
        assertNotNull(doctor1);
        System.out.println(doctor1.toString());
    }
  @Test
  @Order(2)
    public void testCreateDoctorWithALlAttributes(){
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
    public void testNotImplementedYet(){

  }
}