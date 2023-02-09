package Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    private final Employee[] arrayEmployees;

    public Company(Employee[] arrayEmployees) {
        this.arrayEmployees = arrayEmployees;
    }

    public void giveEverybodyBonus(int companyBonus) {
        Arrays.stream(arrayEmployees).forEach(employee -> employee.setBonus(companyBonus));
    }

    public int totalToPay() {
        return Arrays.stream(arrayEmployees).mapToInt(employee -> employee.getBonus() + employee.getSalary()).sum();
    }

    public String nameMaxSalary() {
        List<Employee> listEmployees = Arrays.stream(arrayEmployees).sorted(Employee::compareTo).collect(Collectors.toList());
        return listEmployees.get(listEmployees.size()-1).getName();
    }

    @Override
    public String toString() {
        return "Company{" +
                "arrayEmployees=" + Arrays.toString(arrayEmployees) +
                '}';
    }
}
