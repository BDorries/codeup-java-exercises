package shapes;

public class Rectangle extends Quadrilateral {
    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        super(length,width);
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return (length*2)+(width*2);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    //accessors
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
