package day10_NestedIf;

public class FiledTrip {



    public static void main(String[] args) {
        int grade = 4;
        String location;
        int group;
        String teacher;

        if(grade>=1 && grade<=6) { //if grade number is valid
            if (grade == 1) {
                location = "AppleOrchard";
                group = 3;
                teacher = "Mr. Smith";
            }else if(grade==2){
                location="Zoo";
                group=7;
                teacher="Mr. Lee";
            }else if(grade==3) {
                location = "Aquarium";
                group = 5;
                teacher = "Mr. Wilson";
            }else if(grade==4) {
                location = "Movie theater";
                group = 2;
                teacher = "Mr. Reyes";
            }else if(grade==5) {
                location = "Museum";
                group = 5;
                teacher = "Ms. Lela";
            }else{
                location="Six Flex";
                group=8;
                teacher="Mr.Watt";
            }

        }else{
            location="Unknown";
            group=0;
            teacher="Unknown";
        }

        System.out.println("grade = " + grade);
        System.out.println("location = " + location);
        System.out.println("group = " + group);
        System.out.println("teacher = " + teacher);

    }
}
