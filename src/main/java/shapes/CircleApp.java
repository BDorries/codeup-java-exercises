package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();

        double radius = in.getDouble("Please enter a radius for the circle");
        Circle circle = new Circle(radius);

        System.out.println("The area of your circle is " +circle.getArea());
        System.out.println("The circumference of your circle is " +circle.getCircumference());
    }
}
