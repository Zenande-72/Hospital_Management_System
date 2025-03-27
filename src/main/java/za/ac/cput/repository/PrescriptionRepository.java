package za.ac.cput.repository;
/*
PrescriptionRepository.java
PrescriptionRepository Class
Author: Kyran Gajoo 230971229
Date: 26 March 2025
*/


import za.ac.cput.domain.Prescription;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionRepository implements IPrescriptionRepository {
    private static IPrescriptionRepository repository = null;
    private List<Prescription> prescriptionList;

    private PrescriptionRepository() {
        prescriptionList = new ArrayList<>();
    }

    public static IPrescriptionRepository getRepository() {
        if (repository == null) {
            repository = new PrescriptionRepository();
        }
        return repository;
    }

    @Override
    public Prescription create(Prescription prescription) {
        boolean success = prescriptionList.add(prescription);
        if (success) {
            return prescription;
        }
        return null;
    }

    @Override
    public Prescription read(String id) {
        for (Prescription p : prescriptionList) {
            if (p.getPrescriptionId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Prescription update(Prescription prescription) {
        String id = prescription.getPrescriptionId();
        Prescription oldPrescription = read(id);
        if (oldPrescription == null)
            return null;

        boolean success = delete(id);
        if (success) {
            if (prescriptionList.add(prescription)) {
                return prescription;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Prescription prescriptionToDelete = read(id);
        if (prescriptionToDelete == null)
            return false;
        return prescriptionList.remove(prescriptionToDelete);
    }

    @Override
    public List<Prescription> getAll() {
        return prescriptionList;
    }
}
