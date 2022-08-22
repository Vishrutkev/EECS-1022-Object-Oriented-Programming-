package NestedLoops;


import java.util.Arrays;

public class ListRectangle {

    private final String name;
    private final Rectangle[] listRectangle;
    private int size;

    public ListRectangle(String name, int n) {
        this.name = name;
        this.listRectangle = new Rectangle[n];
    }

    // implement method that can compute the total area of rectangles
    // stores inside the list of rectangle.

    public double totalArea(){
        double total = 0;
        for (int i = 0; i < this.size; i++) {
            total += this.listRectangle[i].getArea();

        }

        return total;

    }

    public void addRectangle(Rectangle a){
        if (size < this.listRectangle.length) {
            this.listRectangle[this.size] = a;
            this.size++;
        }
    }


    @Override
    public String toString() {
        return "ListRectangle{" +
                "name='" + name + '\'' +
                ", listRectangle=" + Arrays.toString(listRectangle) +
                ", size=" + size +
                '}';
    }
}
