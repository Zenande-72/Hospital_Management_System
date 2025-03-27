package za.ac.cput.repository;

import za.ac.cput.domain.Billing;

import java.util.List;
/* IBillingRepository.java interface
   IBillingRepository Interface
   Author: Aviwe Jaxa 222208546
   Date: 26 March 2025
 */

public interface IBillingRepository extends IRepository<Billing, String>{

    List<Billing> getAll();
}
