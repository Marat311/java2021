package day43_OOP_Encapsulation;

public class Notes {
}
/*
08/12/2021
Topics: Access modifiers
		OOP Encapsulation

Package Name: day43_OOP_Encapsulation

Items Task:
    create a class called Item
            instance variables:
                name, unitPrice, quantity

            add a constructor that can initialize all the fields

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

    create a class called MyCart
            create 5 static variables of Items
            Add a static block to to set all the static variables

    Create a class named CheckOut
            1. Create an ArrayList of Items
            2. add all the 5 items from MyCart to the ArrayList items
            3. calculate the total price of all the items (including the tax)
                        Assume that the sales tax is 8%




Access modifiers: determins if a variable or a method is reachable

			public: ALWAYS reachable

			default: ONLy reachable within the same package
						outside the package it's impossible to reach

			private: ONLY reachable within the same class

OOP: Object Oriented Programming

	1. Encapsulation
	2. Inheritance
	3. Abstraction
	4. Polymorphism

Encapsulation: hiding the fields (instance variables) by gusing private access modifiers

			generate getter & setter to use it (read/write)

			Getter(read ONLY): public instance method.
							   does not pass any parameter
							  return type is not void


			Setter(Write ONLY): public instance method
								passes a parameter (MUST match with the field)
								return type is void

use the data:
		1. read (getetr)
		2. write (setter)


Instance & statics short quiz due by 2:15 pm


Task:
	1. Create a class named Circle
			Private variables:
				radius, diameter, PI

			generate getter & setter for all private fileds
					Make sure that radius & diameter of circle can never be set to negative

			add a constructor that can set all the fields

			Extra methods:
				equal(): accepts a Circle Object and returns true if the given circle is equal to the current circle
				calcArea(): returns the area
				calcPerimeter(): returns the perimeter
				toString()

	2. create a class named BankAccount
			Private variables:
					accountHolder, accountNumber, balance

			encapsulate all the fields

			add a constructor that can set all the instances

			Extra methods:
				deposit()
				withdraw()
				checkbalance()
				toString()

			DO NOT duplicate any code fragments


	3. create a class named Credentials
			variables:
				username, password

			methods:
				isStrongPassWord(): takes an argument of string and verifys if the given string is strong password
							Characteristics of strong passwords are:
					                1. Password MUST be at least have 8 characters long, and should not contain space
					                2. PassWord should at least contain one letter
					                3. Password should at least contain one special characters
					                4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                					the new password MUST be a strong password

				toString()



final keyword: constant

		applicable:
			1. variables: the variable cannot be reassigned
			2. methods
			3. class







 */