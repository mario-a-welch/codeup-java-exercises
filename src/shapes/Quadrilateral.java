package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    //Constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral(){
    }

    //Method
    public double getLength() {
        return length;
    }

    //Abstract Method
    public abstract void setLength(double length);

    //Method
    public double getWidth() {
        return width;
    }

    //Abstract Method
    public abstract void setWidth(double width);
}
