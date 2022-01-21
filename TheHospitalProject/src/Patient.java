public class Patient {
    String dni;
    String socialSecurity;
    String name;
    String lastName;
    int age;
    int phone;
    String disease;

    public Patient(String dni, String socialSecurity, String name, String lastName, int age, int phone, String disease) {
        this.dni = dni;
        this.socialSecurity = socialSecurity;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.disease = disease;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "dni='" + dni + '\'' +
                ", socialSecurity='" + socialSecurity + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", disease='" + disease + '\'' +
                '}';
    }
}
