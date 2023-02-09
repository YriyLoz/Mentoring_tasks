package Task1;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrayRectanglesTest {
    ArrayRectangles arrayRectangles = new ArrayRectangles(5);

    @BeforeTest
    private void beforeTest() {
        arrayRectangles.addRectangle(new Rectangle(7, 7));
        arrayRectangles.addRectangle(new Rectangle(7, 9));
        arrayRectangles.addRectangle(new Rectangle(12, 1));
        arrayRectangles.addRectangle(new Rectangle(13, 13));
    }

    @Test
    public void testAddRectangle() {
        Rectangle testRectangle = new Rectangle(5, 5);
        Assert.assertTrue(arrayRectangles.addRectangle(testRectangle));
        Assert.assertEquals(arrayRectangles.getRectangleArray()[4], testRectangle);
    }

    @Test
    public void testNumberMinPerimeter() {
        int result = arrayRectangles.numberMinPerimeter();
        Assert.assertEquals(result, 4);
    }

    @Test
    public void testNumberMaxArea() {
        Assert.assertEquals(3, arrayRectangles.numberMaxArea());
    }

    @Test
    public void testNumberSquare() {
        long result = arrayRectangles.numberSquare();
        Assert.assertEquals(result, 3L);
    }
}
