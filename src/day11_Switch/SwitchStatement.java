package day11_Switch;

public class SwitchStatement {

    public static void main(String[] args) {
        String name = "Chrome";

        switch (name){
            case "chrome":
                System.out.println("Chrome Browser is selected");
                break; //case closed

            case "firefox":
                System.out.println("Firefox is selected");
                break; //case closed

            default:
                System.out.println("Invalid browser name");


        }

    }}
