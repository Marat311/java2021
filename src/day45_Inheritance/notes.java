package day45_Inheritance;

public class notes {
    /*
  08/16/2021
Topics: OOP Inheritance Intro:
				extends keyword
				IS A vs HAS A Relation
				super keyword (super. & super() )

Package name: day45_Inheritance

Warmup task:
	1. create a class named Square
            private variables:
                side (double)

            Encapsulate All the private fields
                (side can not be set to negative)

            Add a constructor that can set the fields

            Extra methods:
                area(), perimeter(), toString(), equals()



Person
	name, age, gender

	setPersonInfo(name, age, gender)

person1.setPersonInfo("John", 27, 'M');


OOP Inheritance: to build IS A relationshipt between classes (parent & child classes)

				easiest way to get rich ==> extends

		child class (sub class): can inherit all the variables and methods from parent class (only the visible ones)

								constrcutor can not be inherited

		parent class (super class): can not inherit anthing from child class


		advantages:
			less memory
			less codes
			easy to maintain
			improves the reusability


this keyword: refers to the instances. current class
	this. : calls instance variables & methods of current class
	this(): calls constructor of current class


super keyword: refers to the instances
	super. : calls instance variables & methods of parent class class
	super(): calls constructor of parent class

	constructor calls in inheritance:
		1. child class MUST call parent class' constructor
		2. parent class' defult constructor is called by default in child class
		3. if the parent class' constructor is not default, it must be called manually


Is A vs Has A:

	Has A:
		class Engine{

		}

		class Car{ // Car Has An Engine
			Engine
		}


		class Tester{

		}

		class Scrumteam{  // Scrumteam Has A Tester
			Tester
		}


	Is A:

		class Animal{

		}

		class Dog extends Animal { // Dog Is An Animal

		}


		class Car{

		}

		class Toyota extends Car{ // Toyota Is A car

		}




Animal:
	name, breed, gender, size, age, color
	eat(), drink(), sleep(), toString()


Dog extends Animal:

	Actions:
		bark()

Cat extends Animal:

	Actions:
		meow()

Tiger extends Animal:

	Actions:
		roar()


EmployeeTask:
	Person:
		name, gender, age

		eat(), sleep(), drink()

	Employee extends Person:
		name, gender, age, id, job title, salary

		work(), attenMeeting()

	Tester extends Employee:
		name, gender, age, id, job title, salary

		testing()

	Developer extedns Employee:
		name, gender, age, id, job title, salary

		code(), fixBugs()















     */
}
