package lab1;

import java.util.Comparator;

public class EmployeeBirthDateComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){return e1.getBirthDate().compareTo(e2.getBirthDate());
    }
}