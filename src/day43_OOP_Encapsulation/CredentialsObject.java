package day43_OOP_Encapsulation;

public class CredentialsObject {
    public static void main(String[] args) {

        Credentials c = new Credentials("hey", "hey12");
        c.setUsername("Marina");
        c.setPassword("Marina123!");
        System.out.println(c.getPassword());
        System.out.println(c.getUsername());

        System.out.println("---------------------");

        System.out.println("Username: "+c.getPassword());
        System.out.println("Password = " + c.getUsername());

        System.out.println("---------------------");

        Credentials logIn = new Credentials(null, null);

        logIn.setUsername("gmail.com");
        logIn.setPassword("gmail123456!");

        System.out.println(logIn);


    }
}
