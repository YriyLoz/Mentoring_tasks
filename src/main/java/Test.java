import Task2.Company;
import Task2.Employee;

public class Test {
    public static void main(String[] args) {
        Company company = new Company(new Employee[]{
                new Employee("Gre", 123 ),
                new Employee("Frd", 5345 ),
                new Employee("Tret", 2453)
        });
        System.out.println(company);
        company.giveEverybodyBonus(1);
        System.out.println(company);
        System.out.println(company.nameMaxSalary());
        System.out.println(company.totalToPay());

    }
}
