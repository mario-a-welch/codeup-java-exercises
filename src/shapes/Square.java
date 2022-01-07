package shapes;

//Square class extends Rectangle
public class Square extends Rectangle{
    private double side;

    //Constructor that accepts one argument, side
    public Square(Double side) {
        super(side, side); //calls the parent's constructor to set both the length and width to the value of side
        this.side = side;
    }
    //Overrides previous getArea and getPerimeter methods
    public double getArea(){
        return this.side * this.side;
    }

    public double getPerimeter(){
        return this.side * 4;
    }
}
