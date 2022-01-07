package shapes;

public class Rectangle {
    protected Double length;
    protected Double width;

    //Constructor that accepts two numbers for length and width
    public Rectangle(Double length, Double width) {
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
