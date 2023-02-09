package Task2;


public class Employee implements Comparable<Employee> {
    private String lastName;
    private int salary;
    private int bonus;


    public Employee(String lastName, int salary) {
        this.lastName = lastName;
        this.salary = salary;
    }

    public int toPay() {
        return salary + bonus;
    }

    public String getName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int compareTo(Employee employee) {
        int current = this.getBonus() + this.getSalary();
        int second = employee.getSalary() + employee.getBonus();
        return Integer.compare(current, second);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
