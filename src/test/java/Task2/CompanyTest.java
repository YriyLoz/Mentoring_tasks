package Task2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyTest {
    Company company = new Company(new Employee[]{new Employee("Reg", 100),
            new Employee("Denis", 110)});

    @Test
    public void testGiveEverybodyBonus() {
        company.giveEverybodyBonus(1);
       Assert.assertEquals(company.totalToPay(),212);
    }

    @Test
    public void testTotalToPay() {
        company.giveEverybodyBonus(2);
        int result = company.totalToPay();
        Assert.assertEquals(result, 114);
    }

    @Test
    public void testNameMaxSalary() {
        String result = company.nameMaxSalary();
        Assert.assertEquals(result, "Denis");
    }

}
