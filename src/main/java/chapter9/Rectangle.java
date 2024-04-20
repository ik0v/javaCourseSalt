package chapter9;

public class Rectangle {

    protected double length;
    protected double width;
    protected int sides = 4;

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void print() {
        System.out.println("I am rectangle");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
