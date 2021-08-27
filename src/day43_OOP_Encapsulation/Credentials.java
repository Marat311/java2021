package day43_OOP_Encapsulation;

public class Credentials {

    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        boolean startsWithLetter = Character.isLetter(username.charAt(0));
        if(!startsWithLetter || username.length()<5) {
        return;
        }
        this.username = username;


    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       if (!isStrongPassword(password)) {
       return;
       }

        this.password = password;
    }

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ") && !password.contains(",");
        boolean r2 = false,
                r3 = false,
                r4= false;

        for (char each : password.toCharArray()) {
            if(Character.isLetter(each)){ // if the character is letter
                r2 = true;
            }else if(!Character.isLetterOrDigit(each)){ // if the character is special character
                r3 = true;
            }else{
                r4 = true;
            }
        }

        return r1 && r2 && r3 && r4;
    }
  /*
       1. Password MUST be at least have 8 characters long, and should not contain space
	   2. PassWord should at least contain one letter
	   3. Password should at least contain one special characters
	   4. Password should at least contain a digit
     */





}
/*
requirements:
    username:
            1. MUST start with a letter
            2. Must have 5 character at least
    password:
            1. MUST be a Strong password
 */


