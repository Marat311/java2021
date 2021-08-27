package day45_Inheritance.animalTask;

public class zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("Lucy", "poudel", 'F', "small", 3, "red");
        dog.bark();
        dog.eat("dog food");
        dog.drink("water");
        dog.sleep();
        System.out.println("==================");

        Cat cat = new Cat("Melisa", "scotish fold", 'f', "small", 10, "blue");
        //cat.bark();
        cat.meow();
        cat.eat("cat food");
        cat.sleep();
        cat.drink("milk");
        System.out.println(cat);

        System.out.println("-----------------------");

        Tiger tiger = new Tiger("Loe", "amure", 'm', "big", 4, "orange");
        tiger.roar();
        tiger.sleep();


    }
}
