package Task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArrayRectangles {
    private final Rectangle[] rectangleArray;

    public ArrayRectangles(int n) {
        this.rectangleArray = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle... rectangle) {
        rectangleArray = rectangle;
    }

    public boolean addRectangle(Rectangle rectangle) {
        if (rectangleArray.length == 0) return false;
        for (int iterator = 0; iterator <= rectangleArray.length; iterator++) {
            if (rectangleArray[iterator] == null) {
                rectangleArray[iterator] = rectangle;
                return true;
            }
        }
        return false;
    }

    public int numberMinPerimeter() {
        return Arrays.binarySearch(rectangleArray,Arrays.stream(rectangleArray).filter(rectangle -> !rectangle.іsSquare()).min(Rectangle::compareTo).get());
    }

    public int numberMaxArea() {
        return IntStream.range(0, rectangleArray.length)
                .filter(number -> !rectangleArray[number].іsSquare()).findAny().getAsInt();
    }

    public long numberSquare() {
        return Arrays.stream(rectangleArray)
                .filter(Rectangle::іsSquare)
                .count();
    }

    // Helper for tests
    public Rectangle[] getRectangleArray() {
        return rectangleArray;
    }
}
