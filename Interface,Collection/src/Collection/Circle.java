package Collection;

public class Circle implements Shape2D{
    private double radius;

    public Circle(){
         this.radius = 1;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.round(this.radius * this.radius * Math.PI*100)/100.;
    }

    @Override
    public String toString() {
        return "Circle --> [" +
                "radius=" + radius +
                ']';
    }
}
