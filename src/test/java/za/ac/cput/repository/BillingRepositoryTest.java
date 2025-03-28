package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Billing;
import za.ac.cput.factory.BillingFactory;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

/* BillingRepository.java
   BillingRepository Class
   Author: Aviwe Jaxa 222208546
   Date: 26 March 2025
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class BillingRepositoryTest {
    private static IBillingRepository repository = BillingRepository.getRepository();

    private Billing b1 = BillingFactory.createBilling("485726", LocalDate.of(2025,03,27),
            "Nakedi","Jonas",1000,5000,6000,
            "Paid","Debit Card","MediCare","Luke","Spies");

    private Billing b2 = BillingFactory.createBilling("485726", LocalDate.of(2025,03,27),
            "Zandile","Nxumalo","Daniel","Spenders");
    @Test
    @Order(1)
    void create() {
        Billing created = repository.create(b1);
        assertNotNull(created);
        System.out.println(created.toString());

        Billing create2 = repository.create(b2);
        assertNotNull(create2);
        System.out.println(create2.toString());
    }

    @Test
    @Order(2)
    void read() {
        Billing read = repository.read(b1.getBillId());
        assertNotNull(read);
        System.out.println(read.toString());

        Billing read2 = repository.read(b2.getPatientFirstName());
        assertNotNull(read2);
        System.out.println(read2.toString());
    }

    @Test
    @Order(3)
    void update() {
        Billing newBilling = new Billing.Builder().copy(b2).setDoctorFirstName("Dr Isles")
                .build();
        Billing updated = repository.update(newBilling);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    @Order(4)
    @Disabled
    void delete() {
        assertTrue(repository.delete(b1.getDoctorFirstName()));
        System.out.println("Deleted DoctorFirstName: " + b1.getDoctorFirstName());
    }

    @Test
    @Order(5)
    void getAll() {
        System.out.println(repository.getAll());
    }
}