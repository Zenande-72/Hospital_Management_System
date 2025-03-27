package za.ac.cput.repository;

import za.ac.cput.domain.Appointment;
import java.util.List;

/*
IAppointmentRepository.java interface
IAppointmentRepository Interface
Author: Jamie-Lee Franse 230837484
Date: 25 March 2025
 */

public interface IAppointmentRepository extends IRepository<Appointment, String> {
    List<Appointment> getAll();
}


