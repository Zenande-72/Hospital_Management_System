package za.ac.cput.repository;

/*
DepartmentRepository.java
Department Repository
Author: Dean Jantjies 222644702
Date: 26 March 2025
*/

import za.ac.cput.domain.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository implements IDepartmentRepository{
    private static DepartmentRepository repository = null;
    private List<Department> departmentDB;

    private DepartmentRepository() {
        this.departmentDB = new ArrayList<>();
    }

    public static DepartmentRepository getRepository() {
        if (repository == null) {
            repository = new DepartmentRepository();
        }
        return repository;
    }

    @Override
    public Department create(Department department) {
        this.departmentDB.add(department);
        return department;
    }

    @Override
    public Department read(String departmentIdentity) {
        return this.departmentDB.stream()
                .filter(d -> d.getDepartmentIdentity().equals(departmentIdentity))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Department update(Department department) {
        Department oldDepartment = read(department.getDepartmentIdentity());
        if (oldDepartment != null) {
            departmentDB.remove(oldDepartment);
            departmentDB.add(department);
            return department;
        }
        return null;
    }

    @Override
    public boolean delete(String departmentIdentity) {
        Department departmentToDelete = read(departmentIdentity);
        if (departmentToDelete != null) {
            departmentDB.remove(departmentToDelete);
            return true;
        }
        return false;
    }

    @Override
    public List<Department> getAll() {
        return departmentDB;
    }
}
