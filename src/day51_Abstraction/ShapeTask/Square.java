package day51_Abstraction.ShapeTask;

import day51_Abstraction.ShapeTask.Shape;

public class Square extends Shape {
    private double side;

    public Square(double side){
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
    if(side<=0){
        throw new RuntimeException("Invalid size: "+side);
    }
        this.side = side;
    }

    public double area(){
        return side*side;
    }
    public double perimeter(){
    return side+side*2;
    }


}
