package day51_Abstraction.ShapeTask;

public class ShapeObjects  {

    public static void main(String[] args) {

        //Shape shape = new Shape(); cannot create object bc class is abstract, bc it is not concrete

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(5, 4);
        Square square = new Square(5);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);


    }



}
