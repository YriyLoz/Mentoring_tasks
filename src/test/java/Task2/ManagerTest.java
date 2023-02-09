package Task2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagerTest {
    Manager manager = new Manager("name", 300, 101);

    @Test
    public void testSetBonus() {
        manager.setBonus(1);
        Assert.assertEquals(manager.getBonus(), 501);
    }


}
