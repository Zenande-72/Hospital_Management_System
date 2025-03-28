package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Billing;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

/* BillingRepository.java
   BillingRepository Class
   Author: Aviwe Jaxa 222208546
   Date: 26 March 2025
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BillingFactoryTest {

    private Billing b1 = BillingFactory.createBilling("485726", LocalDate.of(2025,03,27),
            "Zandile", "Nxumalo",1000,5000,6000,
            "Paid","Debit Card","MediCare","Lara","Flude");

    private Billing b2 = BillingFactory.createBilling("485737", LocalDate.of(2025,03,27),
            "Nakedi","Jonas","Luke","Spies");

    private Billing b3 = BillingFactory.createBilling("485748", LocalDate.of(2025,03,27),
            "Samuel","lawrence","Daniel","Spenders");
    private Billing b4;
    @Test
    @Order(1)
    public void testBillingFactory() {
        assertNotNull(b1);
        System.out.println(b1.toString());
    }
    @Test
    @Order(2)
    public void testcreateBillingwithallattributes(){
        assertNotNull(b2);
        System.out.println(b2.toString());
    }
    @Test
    @Order(3)
    public void testcreateBillingthatfails(){
         fail();
        assertNotNull(b3);
        System.out.println(b3.toString());
    }
    @Test
    @Disabled
    @Order(4)
    public void testisnotImplementedyet(){
        assertNotNull(b4);
        System.out.println(b4.toString());
    }
}