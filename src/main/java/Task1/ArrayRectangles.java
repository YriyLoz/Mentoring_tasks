package Task1;

import java.util.Arrays;

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
        return Arrays.asList(rectangleArray).indexOf(Arrays.stream(rectangleArray).min(Rectangle::compareTo).get());
    }

    public int numberMaxArea() {
        return Arrays.asList(rectangleArray).indexOf(
                Arrays.stream(rectangleArray)
                        .max((r1, r2) -> Float.compare(r1.getSideA() * r1.getSideB(), r2.getSideA() * r2.getSideB()))
                        .get());
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
