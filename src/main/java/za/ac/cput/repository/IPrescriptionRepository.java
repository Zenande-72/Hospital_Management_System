package za.ac.cput.repository;
/*
IPrescriptionRepository.java interface
IPrescriptionRepository Interface
Author: Kyran Gajoo 230971229
Date: 26 March 2025
*/

import za.ac.cput.domain.Prescription;
import java.util.List;

public interface IPrescriptionRepository extends IRepository<Prescription, String> {
    List<Prescription> getAll();
}