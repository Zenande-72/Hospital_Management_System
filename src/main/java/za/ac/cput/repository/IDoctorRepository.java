package za.ac.cput.repository;


import za.ac.cput.domain.Doctor;
/*
IDoctorRepository.java interface
IDoctorRepository Interface
Author: Ashlyn Jordan January 230577644
Date: 25 March 2025
*/

import java.util.List;

public interface IDoctorRepository extends IRepository<Doctor, String>{

    List<Doctor> getAll();








}
