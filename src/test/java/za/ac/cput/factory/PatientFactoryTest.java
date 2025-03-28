package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Patient;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PatientFactoryTest {

    private static Patient patient1 = PatientFactory.createPatient("022341278", "Zandile", "Nxumalo", "0753478922","Female", LocalDate.of(1999, 2, 10));
    private static Patient patient2 = PatientFactory.createPatient("274458930", "Owami", "Khoza", "0674356211", "Female", LocalDate.of(2000, 3, 3));
    private static Patient patient3 = PatientFactory.createPatient("274456389", "87349902", "Vuma", "0812334566", "Female", LocalDate.of(2004, 10, 18));

     @Test
     @Order(1)
    public void testCreatePatient() {
    assertNotNull(patient1);
    System.out.println(patient1.toString());
     }

     @Test
     @Order(2)
     public void testCreatePatientWithAllAttributes() {
         assertNotNull(patient2);
         System.out.println(patient2.toString());

     }

     @Test
     @Order(3)
     public void testCreatePatientThatFails() {
         assertNotNull(patient3);
         System.out.println(patient3.toString());

     }

     @Test
     @Order(4)
    @Disabled
    public void testNotImpementedYet(){

     }

}
