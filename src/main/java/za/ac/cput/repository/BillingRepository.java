package za.ac.cput.repository;

import za.ac.cput.domain.Billing;
import java.util.ArrayList;
import java.util.List;

/* BillingRepository.java
   BillingRepository Class
   Author: Aviwe Jaxa 222208546
   Date: 26 March 2025
 */
public class BillingRepository implements IBillingRepository {
    private static IBillingRepository repository = null;

    private List<Billing> billingList;

    private BillingRepository(){
        billingList = new ArrayList<Billing>();
    }

    public static IBillingRepository getRepository(){
        if (repository == null){
            repository = new BillingRepository();
        }
        return repository;
    }

    @Override
    public Billing create(Billing billing) {
        boolean success = billingList.add(billing);
        if (success){
            return billing;
        }
        return null;
    }

    @Override
    public Billing read(String id) {
        for( Billing b : billingList){
            if (b.getBillId().equals(id))
                return b;
        }
        return null;
    }

    @Override
    public Billing update(Billing billing) {
        String id = billing.getBillId();
        Billing billingOld = read(id);
        if (billingOld == null)
            return null;
        boolean success = delete(id);
        if (success){
            if(billingList.add(billing))
                return billing;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Billing billingtoDelete = read(id);
        if(billingtoDelete == null)
            return false;
        return (billingList.remove(billingtoDelete));
    }
    @Override
    public List<Billing> getAll() {
        return billingList;
    }
}
