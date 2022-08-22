package Collection;

public class Rectangle implements Shape2D {

    private final int height;
    private final int width;


    public double area(){
        return this.height * this.width;
    }

    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;

    }

    @Override
    public String toString() {
        return "Rectangle --> [" +
                "height=" + height +
                ", width=" + width +
                ']';
    }
}
