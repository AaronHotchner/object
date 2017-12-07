package shape;

import static java.lang.Math.PI;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public  Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    @Override
    public String toString(){
        return super.toString() + "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }
}
