package NestedLoops;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;

    }

    @Override
    public String toString() {
        return "{" + "Length: = " + length +", "+ "Width: " + width + "}";
    }

    public static void main(String[] args) {

    }
}
