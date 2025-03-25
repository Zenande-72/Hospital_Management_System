package za.ac.cput.repository;


import za.ac.cput.domain.Doctor;

import java.util.List;

public interface IDoctorRepository extends IRepository<Doctor, String>{

    List<Doctor> gerAll();








}
