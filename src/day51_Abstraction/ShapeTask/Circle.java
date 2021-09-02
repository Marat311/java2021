package day51_Abstraction.ShapeTask;

public final class Circle extends Shape {

    private double r;
    public final static double PI=3.14;

    public Circle(double r){
        super("Circle");
        this.r=r;
    }

    public double getR() {
        if(r<=0){
            throw new RuntimeException("Invalid radius: "+r);
        }
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r*r*PI;
    }

    @Override
    public double perimeter() {
        return r*2*PI;
    }
}
