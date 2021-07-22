package Office_Hourse.practice_07_07_2021;

public class SameChars {
    public static void main(String[] args) {
       /*
        Task 3 : Write a program that accepts String array.
        Count how many names have the same first and last letter
		Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"
				Output : 4



        String first=names[i].substring(0,1);
        String last =names[i].substring(names[i].length-1);
*/

        String [] names = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        String longestName = "";
        int countNames = 0;
        for(int i = 0; i<names.length; i++){ //loop to run all names repeated
            String first= names[i].substring(0,1); //assign first character
            String last = names[i].substring(names[i].length()-1); //assign last character
            if(first.equalsIgnoreCase(last) && names[i].length()>longestName.length()){
                //if first character equals to last character and length of the names are bigger then longestName

                longestName=names[i]; //we reassign longest name to name with bigger length
                countNames++; //count names one by one
            }

        }
        System.out.println(countNames); //print numbers of names with same first and last character
        System.out.println("longest = " + longestName); //print longest name


    }
}
