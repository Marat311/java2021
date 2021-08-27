package day39_CustomClass_Statics.Restaurant;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {


        Restaurant restaurant = new Restaurant();

        restaurant.Owner = "Kuzzat";
        restaurant.Location = "New York";
        restaurant.numberOfStatus = 5;
        Server [] servers = {new Server(), new Server(), new Server()};
        servers[0].setInfo("Marina", 123, 41.5, true);
        servers[1].setInfo("Elena", 456, 45.5, false);
        servers[2].setInfo("Inna", 789, 38.4, true);

        Chef [] chefs = {new Chef(), new Chef()};
        chefs[0].setInfo("Leo", 5, 50.2, true);
        chefs[1].setInfo("Max", 78, 48, false);

        System.out.println("-------servers----------------");
        Server s1 = new Server();
        s1.setInfo("Kai", 99, 35.5, false);
        System.out.println(s1);
        restaurant.hireServer(s1);
        s1.cleanTable();

        System.out.println("------------chefs-------------");
        Chef ch1 = new Chef();
        ch1.setInfo("Poul", 87, 33.5, true);
        System.out.println(ch1);
        restaurant.hireChef(ch1);
        ch1.makeOrder();


        restaurant.chefs.addAll(Arrays.asList(chefs));
        restaurant.servers.addAll(Arrays.asList(servers));

        System.out.println("-------------restaurant------------");
        System.out.println(restaurant);

        System.out.println("------------------terminate employee ID------");
        restaurant.terminateEmployee("chef",87 );
        System.out.println(restaurant);

        restaurant.terminateEmployee("teacher", 99);





    }

    /*
5. Create a class LocalRestaurant that has a main method with the following:
        	- Make a Restaurant object
        	- Create an array of servers with their information set. Add those initial
        	servers to the ArrayList of Servers in the Restaurant object
            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

            - Print your whole restaurants information

        Extra Tasks:
        	- Find out the cost of all the employees (servers + chefs) by checking all of their hourly rates

     */
}
