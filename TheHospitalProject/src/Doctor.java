public class Doctor {
    String dni;
    String name;
    String lasName;
    int age;
    String speciality;
    double salary;

    public Doctor(String dni, String name, String lasName, int age, String speciality, double salary) {
        
        this.dni = dni;
        this.name = name;
        this.lasName = lasName;
        this.age = age;
        this.speciality = speciality;
        this.salary = salary;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", lasName='" + lasName + '\'' +
                ", age=" + age +
                ", speciality='" + speciality + '\'' +
                ", salary=" + salary +
                '}';
    }
}