package day41CustomClass_Constructor.Circle;

public class Circle {
    public double radius;
    public double diameter;

    public static double PI;

    public Circle(double radius) {
        this.radius = radius;
       diameter = radius*2;
    }
}
