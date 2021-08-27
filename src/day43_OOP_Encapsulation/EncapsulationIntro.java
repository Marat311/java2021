package day43_OOP_Encapsulation;

public class EncapsulationIntro {

    private String username = "Cybertek",
    password = "Cybertek123";

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        if(username.length()<5){
            System.out.println("User name needs to bee at least 5 characters");
            return;
        }
        this.username = username;

    }

    public void setPassword(String password){
       this.password = password;
}

}
