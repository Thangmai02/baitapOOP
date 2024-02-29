package model;

public class Cylinder extends Circle{
    private float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Cylinder(){

    }
    public Cylinder(float radius,String color, float height ){
        super(radius,color);
        this.height=height;
    }
    public double volume(){
        return  dientich()*height;
    }
    public String toString() {
        return "Cylinder : radius = " + getRadius() + ", color = " + getColor() + ", height = " + height;
    }
}


