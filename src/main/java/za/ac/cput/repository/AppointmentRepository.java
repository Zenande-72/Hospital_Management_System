package za.ac.cput.repository;

import za.ac.cput.domain.Appointment;
import java.util.ArrayList;
import java.util.List;

/*
AppointmentRepository.java
AppointmentRepository Class
Author: Jamie-Lee Franse 230837484
Date: 25 March 2025
 */


public class AppointmentRepository implements IAppointmentRepository {
   private static IAppointmentRepository repository = null;

   private List<Appointment> appointmentList;

   private AppointmentRepository() {
       appointmentList = new ArrayList<Appointment>();
   }
   public static IAppointmentRepository getRepository() {
       if (repository == null) {
           repository = new AppointmentRepository();
       }
       return repository;
       }

    @Override
    public Appointment create(Appointment appointment) {
        boolean success = appointmentList.add(appointment);
        if (success) {
            return appointment;
        }
        return null;
    }

    @Override
    public Appointment read(String id) {
        for (Appointment a : appointmentList) {
            if( a.getAppointmentID().equals(id)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public Appointment update(Appointment appointment) {
        String id= appointment.getAppointmentID();
        Appointment appointmentOld = read(id);
        if (appointmentOld == null)
            return null;

        boolean success = delete(id);
        if (success) {
            if (appointmentList.add(appointment)) {
                return appointment;
            }
        }
        return null;
    }


    @Override
    public boolean delete(String id) {
        Appointment appointmentToDelete = read(id);
        if (appointmentToDelete == null)
            return false;
        return (appointmentList.remove(appointmentToDelete));
    }

    @Override
    public List<Appointment> getAll() {
       return appointmentList;
    }


}



