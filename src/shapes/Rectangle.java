package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    //Constructor that accepts two numbers for length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //getArea and getPerimeter methods
    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }
}
