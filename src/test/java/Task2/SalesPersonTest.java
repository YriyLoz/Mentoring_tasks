package Task2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SalesPersonTest {
    SalesPerson salesPerson = new SalesPerson("lastName", 400, 201);

    @Test
    public void testSetBonus() {
        salesPerson.setBonus(2);
        Assert.assertEquals(salesPerson.getBonus(),6);
    }
}
