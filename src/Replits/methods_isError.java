package Replits;

public class methods_isError {
    /*
    The isError method checks if the given String begins with error

The method will return true if the String starts with error otherwise it will return false
Example:

isError("foo bar")

returns : false
isError("foo bar")

returns : false
isError("error foo bar")

returns : true
isError("error foo bar")

returns : true
isError("error one two")

returns : true
isError("error one two")

returns : true
isError("three four error")

returns : false
     */
    public static void main(String[] args) {
     String r = "error foo bar";
        System.out.println(isError(r));
    }

    public static boolean isError(String line){
   /*     String[] arr = line.split(" ");

            if(arr[0].equals("error")){
                return true;
            }else{
                return false;
            }
*/

        if(line.startsWith("error")){
            return true;
        }else{
            return false;
        }
    }
}
