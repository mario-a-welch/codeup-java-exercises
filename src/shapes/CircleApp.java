package shapes;

import util.Input;

public class CircleApp{
    public static Input userIn = new Input();

    public static void main(String[] args){
        //Prompt the user for the radius of the circle using the Input class
        double radius = userIn.getDouble("Enter a radius:");

        Circle newCircle = new Circle(radius);
        System.out.println("Area: " + newCircle.getArea());
        System.out.println("Circumference: " + newCircle.getCircumference());
    }
}
