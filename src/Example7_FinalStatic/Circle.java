package Example7_FinalStatic;

import java.util.ArrayList;

public class Circle {
    
    private double radius;
    private int ID;
    
    private final double PI = 3.1415926;
    private static int numCircles = 0;
    
    public Circle(double inputRadius) {
        radius = inputRadius;
        ID = numCircles;
        numCircles++;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return 2*PI*Math.pow(radius,2);
    }
    
    public int getID() {
        return ID;
    }

}
