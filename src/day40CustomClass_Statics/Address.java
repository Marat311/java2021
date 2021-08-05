package day40CustomClass_Statics;

public class Address {

    public String buildNumber, street, city, state;
    public int zipCode;

    public static String country= "USA";

    public void setInfo(String buildNumber, String street, String city, String state, int zipCode) {
        this.buildNumber = buildNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString(){
        return buildNumber+" "+street+"\n"+city+" "+state+", "+zipCode;
    }

    /*
    public static void setInfo(){
        System.out.println(country);
        System.out.println(buildingNUmber); //instance method accepts atatic & non static (objects can share class
    }
    */
}
