package shapes;

public class Circle {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return (radius * radius)*Math.PI;
    }
    public double getCircumference(){
        return (Math.PI*2)*radius;
    }

    //accessors
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
