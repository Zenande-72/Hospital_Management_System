package za.ac.cput.repository;

import za.ac.cput.domain.Doctor;

public interface IRepository {

    void create(Doctor doctor);

    void read(String firstName, String lastName, String specialization);

    void  update(Doctor doctor);

    void delete(String doctor);
}
