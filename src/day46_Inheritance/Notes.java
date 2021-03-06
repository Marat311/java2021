package day46_Inheritance;

public class Notes {
    /*
    08/17/2021
Topics: Inheritance Continue:
				Method Overriding
				Object class

package name: day46_Inheritance

Warmup tasks:
	carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()

		Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()
			2. BMW:
					extra methods:
						breaksDown()
						race()
			3. Tesla:
					extra methods:
						autoPilot();


	shapeTask
		1. create a class called Shape
						vairables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)

						add a constructor that can set all the fields

						methods: calcArea(), calcPerimeter(),
								 toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()

		2. create sub classes of Shape:
						Circle
						Rectangle
						Square
						Triangle
						Cube
						Cylinder
						....

			 give the instance variables that are needed to calculate the Area, perimeter, of those shapes


	AFTER TODAY'S TOPIC: Overriding
		3. override super class' calculateArea(), calculatePerimeter() methods to the sub classes:

		 		Area of the circle:    3.14 * radius * radius
		 		Area of the rectangle:  width * length
		 		Area of the square:    side * side

		 		Perimeter of circle:   3.14 * 2 * radius
		 		Perimeter of rectangle: (width + length) * 2
		 		Perimeter of Square: 4 * side



Inheritance:
		A parent class can have multiple child classes
		A child class can have one parent class

Object class: prsented in "java.lang". parent of all classes, implicitly inherited to all the classes


come back at 11:20 am.
Constrcutors short quiz is due by 11:40 am


Method overloading: multiple method having the same method name in same class
					same emthod name, different parameters
					return type can be same or different



Method Overriding: giving different implementations to the method

					MUST happen in the child class

					return-type, method name, parameter MUST be same

					access modifier need to be same ore more visible
							public > protected > default

					@Override annotation must be applicable

					methods that we cannot override: private, static, final

					ONLY the instance methods (nor ptivate & not final) can be overriden



final keyword: unchangable

	variables: cannot be reassigned
	methods: the method cannot be overriden
	class: class cannot be have any child class (cant be inherited)



---------------------------------------------
Car
	start(): Insert the key, twist it to ignition

Toyota extends Car


Honda extends Car


Audi extends Car:
	start(): push "start" button


Tesla extends Car:
	start(): say "start"


BMW extends Car:
	start(): call mechanic



---------------------------------------
Shape
	name

	area(): 0
	perimeter()


Circle extends Shape
		area(): r* r* PI

Rectangle extends Shape
		area(): l * w

Square extends Shape
		area(): s * s

Triangle extends Shape
		area(): h * b * 0.5

------------------------------------------



BrowserTask
	Create the following custom classes:
	1. Chrome
			methods:
				openBrowser(): prints "opening chrome browser"
				closeBrowser(): prints "closing chrome browser"

	2. FireFox
			methods:
				openBrowser(): prints "opening firefox browser"
				closeBrowser(): prints "closing fire fox browser"

	3. Opera
			methods:
				openBrowser(): prints "opening opera browser"
				closeBrowser(): prints "closing opera browser"

	4. Safari
			methods:
				openBrowser(): prints "opening safari browser"
				closeBrowser(): prints "closing safari browser"










     */
}
