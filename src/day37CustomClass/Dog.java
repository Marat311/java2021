package day37CustomClass;

public class Dog {

     public String name ;
     public String breed ;
     public int age; ;
     public String size ;
     public String color ;
     public String gender ;

     public void eat(String food){
          System.out.println(name + " is eating "+food);
     }

     public void drink(String drink){
          System.out.println(name + " is drinking "+drink);
     }

     public void bark(){
          System.out.println(name + " is barking");
     }

     public void play(){
          System.out.println(name + " is playing");
     }

     public void setInfo(String dogName, String dogBreed, int dogAge, String dogSize, String dogColor, String dogGender){
          name = dogName;
          breed = dogBreed;
          age=dogAge;
          size = dogSize;
          color= dogColor;
          gender = dogGender;


     }


     public void getInfo(){
          System.out.println("name = " + name);
          System.out.println("breed = " + breed);
          System.out.println("color = " + color);
          System.out.println("size = " + size);
          System.out.println("age = " + age);
          System.out.println("gender = " + gender);
     }


}
