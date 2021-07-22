package day16_StringMethods;

public class String_Methods {
    public static void main(String[] args) {

//replace method: replace(old value, new value) replace all old values to new given values
//replace first method- replaced first old value to given new value

        String email = "Cybertek@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String sentence = "C# is cool, C# is fun";
        sentence= sentence.replace(", C#", ", Java"); //replaces the first matching only
        System.out.println("sentence = " + sentence);

        String s = "Cat Dog Cat Dog Cat";
        s = s.replace("Cat", "Dog");

        s=s.replaceFirst("Cat", "Dog");

        System.out.println(s);

        System.out.println("===========================");

        //indexOf() method returns the index number of first occured character, returns it as int

        // lastIndexOf("character") returns the index of last character;

        String sentence2 ="Java is a cool language";
        int index = sentence2.indexOf("a"); //index number assigned to integer
        int indexOfSecondA = sentence2.indexOf("a ");
        int indexOfThirdA = sentence2.indexOf("a c");
        int indexOfFourthA = sentence2.indexOf("an");
        int indexOfFifthA = sentence2.lastIndexOf("a");

        System.out.println("Index of first A: " +index);
        System.out.println("indexOfSecondA = " + indexOfSecondA);
        System.out.println("indexOfThirdA = " + indexOfThirdA);
        System.out.println("indexOfFourthA = " + indexOfFourthA);
        System.out.println("indexOfFifthA = " + indexOfFifthA);



        System.out.println("--------------------");

        // equals(), checs if the string has the same text, returns boolean
        // DO NOT use == to compare two Strings, use .equal
        // equalIgnoreCase(); checks if two strings are equal without case sensitivity

        String str1 = "Cat"; //string pool
        String str2 = new String("Cat"); //java heap
        String str3 = new String("Cat"); //java heap

        System.out.println(str1==str2);//false- string literal and object
        System.out.println(str1.equals(str2)); //true- just compare words
        System.out.println(str2==str3);  //false- two different objects
        System.out.println(str2.equals(str3));  //true

        System.out.println("-------------------");

        String w1 = "Java";
        String w2 = "java";

        System.out.println(w2==w1); //false
        System.out.println(w1.equals(w2));  //false
        System.out.println(w1.equalsIgnoreCase(w2));  //true



    }

}
