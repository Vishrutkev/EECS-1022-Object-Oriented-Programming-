package Collection;

import java.util.Arrays;

public class w9Ex01 {

    public static double areaTotal(Circle[] a){
        double sum = 0;

        for (Circle c: a) {
            sum += c.area();
        }
        return sum;

    }

    public static double areaofshape2D(Shape2D[] s){
        double sum = 0;

        for (Shape2D c: s) {
            sum += c.area();
        }
        return sum;

    }

    public static double areaTotal(Rectangle[] r){

        double sum = 0;
        for (int i = 0; i < r.length; i++) {
            sum += r[i].area();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape2D[] shape = new Shape2D[6];



        Rectangle r1 = new Rectangle(1,2);
        Rectangle r2 = new Rectangle(3,2);
        Shape2D s = new Rectangle(4,5);
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        System.out.println("Area of a Rectangle: " + s.area());
        System.out.println(r1);
        System.out.println(c1);
        System.out.println("Area of a circle: " + c2.area());


        // Rectangle[]
        Rectangle[] rect = new Rectangle[3];
        rect[0] = r1;
        rect[1] = r2;
        rect[2] = new Rectangle();
        System.out.println(Arrays.toString(rect));
        System.out.println(areaTotal(rect));

        // Circle[]
        Circle[] cir = new Circle[3];
        cir[0] =  c1;
        cir[1] = c2;
        cir[2] = new Circle();
        System.out.println(areaTotal(cir));

        //Shape[]
        shape[0] = r1;
        shape[1] = r2;
        shape[2] = new Rectangle();
        shape[3] = c1;
        shape[4] = c2;
        shape[5] = new Circle();
        System.out.println(Arrays.toString(shape));
        System.out.println(areaofshape2D(shape));


    }
}
