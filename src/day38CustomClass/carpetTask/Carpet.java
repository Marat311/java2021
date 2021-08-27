package day38CustomClass.carpetTask;

public class Carpet {
    public double width, length, unitPrice;
    public boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
      if(isPersian) {
        return ((width * length) * unitPrice)+200;
      }else{
          return (width * length) * unitPrice;
   }
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                "', price="+calcCost()+"}'";
    }
}
/*
Carpet Task:
    	create a custom class for the Carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                instance methods:
                        customOrder(): sets the Carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the Carpet and return it as double
                        toString(): should be able to display all the info of the Carpet including the total cost of the Carpet as calculated by calcCost()

            total price of Carpet = (width*length)*unitprice

            if the Carpet is persian  Carpet that's came from Turkey, add 200$ to the totalPrice

        create a class called carpetObjects, and create an array of the Carpet that contains 5 Carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
        write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets
 */