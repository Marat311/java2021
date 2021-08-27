package day37CustomClass;

public class Rectangle {
    public double length;
    public double width;

    public void setInfo(double length, double width){
        this.length = length;
        this.width=width;
    }

    double calculateArea(){
        return length*width;
    }

    double calculatePerimeter(){
        return (length+width)*2;
    }



    public String toString() {
        return "Rectangle{" +
                "length= " + length +
                ", width= " + width +
                ", area= "+calculateArea() +
                ", perimeter= "+calculatePerimeter()+
                '}';
    }
}

