package Task1;

import java.util.Objects;

public class Rectangle implements Comparable<Rectangle> {
    private int sideA, sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(int sideA) {
        this.sideA = sideA;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    public float getSideB() {
        return sideB;
    }

    public float getSideA() {
        return sideA;
    }

    public int perimeter() {
        return (sideA + sideB) * 2;
    }

    public boolean іsSquare() {
        return sideA == sideB;
    }

    public void replaceSides() {
        int replaceValue = sideA;
        sideA = sideB;
        sideB = replaceValue;
    }
    //helpers

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getSideA() == rectangle.getSideA() && getSideB() == rectangle.getSideB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB());
    }


    @Override
    public int compareTo(Rectangle o) {
        return Integer.compare(this.perimeter(), o.perimeter());
    }
}
