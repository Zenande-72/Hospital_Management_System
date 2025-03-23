package za.ac.cput.factory;
import za.ac.cput.domain.Doctor;
import za.ac.cput.util.Helper;

/*
DoctorFactory.java
DoctorFactory Class
Author: Ashlyn Jordan January 230577644
Date: 22 March 2025
*/

public class DoctorFactory {
public static Doctor createDoctor(String firstName, String lastName, String specialization,int licenceNumber,int yearsOfExperience,String hospitalAffiliation, String email, String gender, String availability) {
    if (Helper.isNullOrEmpty(firstName) ||
            Helper.isNullOrEmpty(lastName) ||
            Helper.isNullOrEmpty(specialization) ||
            Helper.isNullOrEmpty(hospitalAffiliation) ||
            Helper.isNullOrEmpty(gender)||
    Helper.isNullOrEmpty(availability))
        return null;

    if(Helper.isNullOrEmpty(email))
        return null;

    return new Doctor.Builder().setFirstName(firstName)
            .setLastName(lastName)
            .setSpecialization(specialization)
            .setHospitalAffiliation(hospitalAffiliation)
            .setGender(gender)
            .setAvailability(availability)
            .setLicenceNumber(licenceNumber)
            .setYearsOfExperience(yearsOfExperience)
            .build();


}
}
