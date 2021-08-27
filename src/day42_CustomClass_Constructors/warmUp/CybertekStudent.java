package day42_CustomClass_Constructors.warmUp;

public class CybertekStudent {
    public String name;
    public int age;
    public char gender;

    public static String schoolNmae, fieldOfStudy, programmingLanguage;

    public CybertekStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static {
        schoolNmae = "Cybertek school";
        fieldOfStudy = "IT";
        programmingLanguage= "Java";
    }

    public void attendClass(){
        System.out.println(name+" is attend the class at "+schoolNmae);
    }

    public void replit(){
        System.out.println(name+ " is working on "+programmingLanguage+ " repl.its");
    }

    public void askForBreak(){
        System.out.println(name+" is asking break");
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
4. create a class named CybertekStudent
            Variables:
                name, gender, age, schoolName, fieldOfStudy, programmingLanguage
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            methods:
                attendClass():
                replit()
                toString()
 */