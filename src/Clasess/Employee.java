package Clasess;

public class Employee {
   private String name, surname, job;

    public Employee(String name, String surname, String job) {
        this.name = name;
        this.surname = surname;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getJob() {
        return job;
    }
}
