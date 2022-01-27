package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setLength(double length) {
    }

    @Override
    public void setWidth(double width) {
    }
    //Inheritance and Polymorphism Exercise
//    protected double length;
//    protected double width;
//
//    //Constructor that accepts two numbers for length and width
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    //getArea and getPerimeter methods
//    public double getArea(){
//        return this.length * this.width;
//    }
//
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }
}
