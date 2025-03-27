package za.ac.cput.repository;

import za.ac.cput.domain.Doctor;
/*
DoctorRepository.java
DoctorRepository Class
Author: Ashlyn Jordan January 230577644
Date: 25 March 2025
*/
import java.util.ArrayList;
import java.util.List;

public class DoctorRepository implements IDoctorRepository{
    private static IDoctorRepository repository= null;

    private List<Doctor> doctorList;

    private DoctorRepository(){
        doctorList = new ArrayList<Doctor>();
    }


    public static IDoctorRepository getRepository(){
        if(repository==null)
        {
            repository= new DoctorRepository();
        }
        return repository;
    }

    @Override
    public Doctor create(Doctor doctor) {
        boolean success = doctorList.add(doctor);
        if(success){
            return doctor;
        }
        return null;
    }

    @Override
    public Doctor read(String id) {
        for (Doctor d : doctorList) {
            if (d.getDoctorID().equals(id)) {
                return d;
            }
        }
        return null;
    }

    @Override
    public Doctor update(Doctor doctor) {
        String id = doctor.getDoctorID();
        Doctor doctorOld = read(id);
        if (doctorOld == null)
            return null;

        boolean success = delete(id);
        if (success) {
            if (doctorList.add(doctor)) {
                return doctor;


            }

        }
        return null;
    }


    @Override
    public boolean delete(String id) {
        Doctor doctorToDelete = read(id);
        if(doctorToDelete==null)
            return false;
        return(doctorList.remove(doctorToDelete));
    }

    @Override
    public List<Doctor> getAll() {
        return doctorList;
    }
}
