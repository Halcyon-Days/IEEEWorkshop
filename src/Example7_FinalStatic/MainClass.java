package Example7_FinalStatic;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        ArrayList<Circle> circleList = new ArrayList<Circle>();
        
        for(int i = 0; i < 50; i++) {
            circleList.add( new Circle(i));
        }
        
        for(Circle c: circleList) {
            System.out.println("Circle with Id: " + c.getID() + " has radius " + c.getArea());
        }

    }
}
