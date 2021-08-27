package day38CustomClass.pizzaTask;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public void customOrder(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double startingPrice = (size == 'S')? 10 :(size == 'M') ? 12 : 14;
        double priceOfToppings = 2 * (numberOfCheeseTopping+numberOfPepperoniTopping);
        return (startingPrice + priceOfToppings)* 1.08; // including the tax
    }

    public String toString() {
        return "Pizza{" +
                "size= " + size +
                ", numberOfCheeseTopping= " + numberOfCheeseTopping +
                ", numberOfPepperoniTopping= " + numberOfPepperoniTopping +
                ", total price= $" + calcCost() +
                '}';
    }
}

/*
 Pizza:
    	Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping
		Actions:
			customOrder(): sets all attributes of Pizza
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */