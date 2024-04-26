package Clasess;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getJob().compareTo(o2.getJob()) == 0
                ? o1.getSurname().compareTo(o2.getSurname()) :
                o1.getJob().compareTo(o2.getJob());
    }
}
