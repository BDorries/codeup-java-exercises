package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        Square square = new Square(5);
        Rectangle rect = new Rectangle(5,4);

        myShape = square;
        System.out.println(myShape.getPerimeter());
        myShape = rect;
        System.out.println(myShape.getArea());

    }
}
