package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Rectangle box1 = new Rectangle(5.0, 4.0);
        Rectangle box2 = new Square(5.0);

        System.out.println("Rectangle");
        System.out.println("The perimeter of the Rectangle is: " + box1.getPerimeter());
        System.out.println("The area of the Rectangle is: " + box1.getArea());
        System.out.println("");
        System.out.println("Square");
        System.out.println("The perimeter of the Square is: " + box2.getPerimeter());
        System.out.println("The area of the Square is: " + box2.getArea());
    }
}
