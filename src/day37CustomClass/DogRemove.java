package day37CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogRemove {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Kora", "rottweiler", 4, "medium", "black", "female");
        Dog dog1 = new Dog();
        dog1.setInfo("Axe", "Dog", 5, "Large", "Whate", "male");
        Dog dog2 = new Dog();
                dog2.setInfo("Oscar", "poodle", 1, "medium", "orange", "male");
        Dog dog3 = new Dog();
                dog3.setInfo("Yanik", "chihuahua", 2, "small", "white", "male");
        Dog dog4 = new Dog();
                dog4.setInfo("Goodzon", "husky", 8, "medium", "black", "male");
        Dog dog5 = new Dog();
                dog5.setInfo("Lolita", "spitz", 3, "small", "brown", "female");
        Dog dog6 = new Dog();
                dog6.setInfo("Lego", "malinos", 1, "medium", "orange-black", "male");
        Dog dog7 = new Dog();
                dog7.setInfo("Mario", "bulldog", 3, "medium", "orange-white", "male");
        Dog dog8 = new Dog();
                dog8.setInfo("Luidgi", "bulldog", 4, "medium", "orange-white", "male");
        Dog dog9 = new Dog();
                dog9.setInfo("Trent", "rotweiler", 4, "medium", "black", "male");


        ArrayList<Dog> dogs = new ArrayList<>();
        Dog [] d = {dog, dog1, dog2, dog3, dog4, dog5, dog6, dog7, dog8, dog9};
        dogs.addAll(Arrays.asList(d));


            dogs.removeIf(p -> !p.breed.equals("husky"));
        for(Dog each:dogs){
            each.getInfo();
        }


    }
}
