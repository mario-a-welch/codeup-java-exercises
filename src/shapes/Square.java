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
        System.out.println("Override Rectangle getArea()");
        return this.side * this.side;
        //return super.length * super.length;
        //will not have to use private double side and this.side
        //can also use just length and width variables since they are protected but will not work if they are set to private in initial class
    }

    public double getPerimeter(){
        System.out.println("Override Rectangle getPerimeter()");
        return this.side * 4;
    }
}
