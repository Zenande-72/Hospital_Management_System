package za.ac.cput.domain;

//Hospital Management System
//Patient Class
//By:Zenande Kalipa - 230012035
//Github : Zenande-72

public class Patient {

    private String firstName;
    private String lastName;
    private String cellNumber;
    private String gender;
    private String dateOfBirth;
    private String age;

    private Patient() {
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

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String cellNumber;
        private String gender;
        private String dateOfBirth;
        private String age;

        public Patient.Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Patient.Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Patient.Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Patient.Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Patient.Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Patient.Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Patient build() {
            return new Patient();
        }


    }
}



