package CLASSPACK;

public class Circle {
 
    private double radius;
 
    public void setRadius(double radius) {
        this.radius = radius;
    }
 
    public double getRadius() {
        return radius;
    }
 
    public double Area() {
        return 3.14 * (radius * radius);
    }
 
    public double Circum() {
        return 2 * 3.14 * radius;
    }
}
