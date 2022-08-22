package NestedLoops;

public class w7ex {
    public static void doSomething(int[] a){
        a[0] += a[1];
        a[1] += a[0] + a[2];
        a[2] += a[1];
    }

    public static void main(String[] args) {
        int[] a = {2,3,4};
        doSomething(a);
        System.out.println("a[0]: " + a[0]);
        System.out.println("a[1]: " + a[1]);
        System.out.println("a[2]: " + a[2]);
    }
}
