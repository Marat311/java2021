package day42_CustomClass_Constructors;

public class Notes {
    /*
    08/10/2021
Topics: Constructor Call ( this() )
		Garbage Collection
		Review

Package name: day42_CustomClass_Constructors

warmup tasks:
	1. Create a class called Item
			Variables:
				name, untiPrice, quantity

			Add a constructor to initialize all the fields

			Methods:
				calcCost(): returns the total price of the Item
				toString()

	2. Create a class called Dog
			Variables:
				instance: breed, size, gender, age, color
				static: numberOfLegs, numberOfEyes, numberOfWings

			Add a constructor to initialized all the fields
			Add a static block to initialize all the statics

			Methods:
				toString()

	3. create a class named CybertekStudent
			Variables:
				instance: name, age, gender,
				static: schoolName,fieldOfStudy, programmingLanguage

			Add a constructor to initialize all the fields
			Add a static block to initialize all the statics

			methods:
				attendClass():
				replit()
				toString()


Constructor: special method

this: refers to the object instances
	this. : to call instance variable & instane method
	this(): used for calling the constructor


constructor call:
			1. constructor cannot be called by its name (this() need to be used)
			2. only a constructor can call another constructor
			3. Constructor call MUST be at the first step
			4. one constructor cannot call more than one constructor
			5. Constructor cannot call itself or contain itself


Task:
	1. Class Name: Employee
			instance variables:
					name, jobTitle, id, salary

			1st constructor: initializes the name ONLY

			2nd constructor: initializes name & jobTitle
						(MUST use constructor call to set the name)

			3rd Constructor: initializes name, jobTitle and id
						(MUST use constructor call to set the name & jobTitle)

			4th Constructor: initializes all the instances
						(MUST use constructor call to set the name, jobTitle, and id)

			isntance methods: toString()

	2. class name: Car
		 instance variables:
		 		make, model, year, price, color

 		1st constructor: initializes the make ONLY

 		2nd constructor: initializes make & model
 				(MUST use constructor call to set the make)

		3rd constructor: initializes make, model, year
				(MUST use constructor call to set the make, model)

		4th constructor: initializes make, mode, year, price
				(MUST use constructor call to set the make, model, year)

		5th Constructor: intializes all the instances
				(MUST use constructor call to set the make, mode, year, price, color)

		instance methods: toString

Come back at 2:15pm and work on the tasks above, class will start at 2:30 pm





class & Objects:
	instances:
		instance variables, methods
		toString
		this keyword
		constructor

	static:
		static variables
		static methods
		static block
		static import



OOP: Encapsulation
Access modifiers: public, private, default



Garbage Collection: Collection of garbage objects (unreferenced object)

	unreferenced object:
			1. re-assigning
					 		String str= "Java";
					 				str	="Python" // object "Java" becomes unreferenced

					 				sout(str);

			2. assigninng null:
						String str = "Java";
								str = null;


Garbage collector: responsible for collecting unreferenced object from java heap. and destroys it ( finalize() )















     */
}
