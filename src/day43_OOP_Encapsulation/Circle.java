package day43_OOP_Encapsulation;

public class Circle {
    private double radius, diameter;

    private static double PI = 3.14;
   int count1;

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setRadius(double radius) {
        if(radius<0){
            System.out.println("Radius of the circle can not be negative");
            return;//exist the method
        }
        this.radius = radius;
        diameter = radius*2;
      //  setDiameter(radius*2);

    }

    public void setDiameter(double diameter) {
        if(diameter<0){
            System.out.println("Diameter of the circle cannot be negative");
            return;
        }
        this.diameter = diameter;
        radius=diameter/2;
      //  setRadius(diameter/2);
    }

    public Circle(double radius) {
       setRadius(radius);
    }

    public double area(){
        return radius*radius*PI;
    }

    public double perimeter(){
        return diameter *PI;
    }

    public boolean equals(Circle circle){
        return radius == circle.radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }

    public static void main(String[] args) {

      //  System.out.println(Circle.count1);
    }
}
