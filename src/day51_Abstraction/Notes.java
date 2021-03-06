package day51_Abstraction;

public class Notes {
    /*
    08/31/2021
Topics: OOP Abstraction
				Abstract method
				Abstract class


package name: day51_Abstraction

Topics in Abstraction:
		abstract method
		abstract class
		abstarct class vs regular class

		interface
		implements
		class vs interface
		implements vs extends



OOP Encapsulation: hiding the data

OOP Inheritance: Is A relation (parent/super & child/sub)

		method overriding: one method having multiple implementations
						  MUST happen in subclass
						  Access modifier must be same or more visible

OOP Abstraction: hiding the the implementation and details of the method

				Concentrating on essentials/important things. not worrying about the details

			abstract method: A method without implementation/body
							 meant to be overriden ( cannot be static, final, private)


			2 ways to achieve abstraction:
					1. Abstract class
					2. Interface


		Abstract class: meant to be inherited (cannot be final)
						cannot create an object (Not concrete)

						can have everything the class can have + abstract methods


		Abstract class vs Regular class: both are class
										 can have variables, method, blocks.. etc

					 difference:
					 	 regular class: can have objects
					 	 				cannot have abstract method
					 	 				can be final


					 	 abstract class: can not have objects
					 	 				 can have abstract method
					 	 				 can not be final






methods:

	AM  specifier  returnType methodName(parameter){ statemnts }

	AM: public, protected, default, private
	specifier: static, final, abstract, synchronized
	returnType: void, any dateType




Shape
	Interface Volume:
			volume();

	Abstract Shape:
		area();
		perimeter();


	Circle extends Shape:
		area(): r * r * PI

	Rectangle extends Shape:
		area(): w * l

	Square extends Shape:
		area(): s * s

	Cube extends Shape implements Volume

	Cylinder extends Shape implements Volume


Car
	Car:
		start();

	Toyota extends Car:
		start(): twist the key

	Audi extends Car:
		start(): push start button

	Tesla extends Car:
		start(): voice control

	BMW extends Car:
		start(): jump start


Employee: Encapsulation, Inheritance, Abstraction, overriding, class & object, constructors

	Employee:
		name, gender, jobTitle, salary, id
		work();

	Tester extends Employee


	Developer extends Employee


	SM extends Employee

	Teacher extends Employee

	PO extends Employee



come back at:  2:15 PM US EST


WebDriver
	get();

RemoteDrive implements WebDriver, TakeScreenShot, JavaScriptExecuter

ChromeDriver extends RemoteDrive

FireFoxDriver extends RemoteDrive

OperaDriver extends RemoteDrive

...

	driver = new ChromeDriver();

	driver.get






Tasks:
	Shape
	Animal
	Employee
     */
}
