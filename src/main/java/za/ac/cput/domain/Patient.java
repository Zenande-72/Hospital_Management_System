package za.ac.cput.domain;
/*
Patient.Java
Patient Class
Author: Zenande Kalipa 230012035
Date: 18 March 2025
 */

public class Patient {

    private String firstName;
    private String lastName;
    private String cellNumber;
    private String gender;
    private String dateOfBirth;

    public Patient(Builder builder) {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private String cellNumber;
        private String gender;
        private String dateOfBirth;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Patient build() { return new Patient (this);}
    }
}
