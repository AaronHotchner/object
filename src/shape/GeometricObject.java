package shape;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private  boolean filled;
    private Date dateCreated;

    //只能被子类调用
    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected  GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + "\nfilled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();


}
