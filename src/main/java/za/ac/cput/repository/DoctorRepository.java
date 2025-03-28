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
    private static DoctorRepository repository= null;

    private List<Doctor> doctorList;

    private DoctorRepository(){
        doctorList = new ArrayList<Doctor>();
    }


    public static DoctorRepository getRepository(){
        if(repository==null)
        {
            repository= new DoctorRepository();
        }
        return repository;
    }

    @Override
    public Doctor create(Doctor doctor) {
        this.doctorList.add(doctor);
        return doctor;
    }

    @Override
    public Doctor read(String doctorId) {

        return this.doctorList.stream()
                .filter(d -> d.getDoctorID().equals(doctorId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Doctor update(Doctor doctor) {
        String id = doctor.getDoctorID();
        Doctor doctorOld = read(doctor.getDoctorID());
        if (doctorOld != null) {
            doctorList.remove(doctorOld);
            doctorList.add(doctor);
            return doctor;
        }
        return null;

    }


    @Override
    public boolean delete(String doctorId) {
        Doctor doctorToDelete = read(doctorId);
        if(doctorToDelete!=null) {
            doctorList.remove(doctorToDelete);
            return true;
        }
        return false;
    }

    @Override
    public List<Doctor> getAll() {
        return doctorList;
    }
}
