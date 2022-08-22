package NestedLoops;

public class ListRectangleApp {
    public static void main(String[] args) {
        ListRectangle alist = new ListRectangle("AAA",8);
        System.out.println(alist);
        for (int i = 0; i < 9; i++) {
            alist.addRectangle(new Rectangle(i+1,2));
        }

        System.out.println(alist);
        System.out.println(alist.totalArea());
    }
}
