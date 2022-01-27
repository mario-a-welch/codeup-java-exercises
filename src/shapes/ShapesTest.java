package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Measurable myShape = new Rectangle(5.0, 4.0);
        System.out.println("Rectangle");
        System.out.println("The perimeter of the Rectangle is: " + myShape.getPerimeter());
        System.out.println("The area of the Rectangle is: " + myShape.getArea());
        System.out.println("");
        myShape = new Square(5.0);
        System.out.println("Square");
        System.out.println("The perimeter of the Square is: " + myShape.getPerimeter());
        System.out.println("The area of the Square is: " + myShape.getArea());
    }
}
