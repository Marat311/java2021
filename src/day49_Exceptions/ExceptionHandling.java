package day49_Exceptions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day43_OOP_Encapsulation.Circle;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        String str = "Cybertek";

        try {
            System.out.println(str.charAt(200));
        }catch (IndexOutOfBoundsException c ){
            System.out.println("String index Out of bound occured");
        }
         str+="School";
        System.out.println(str);

        System.out.println("----------------------");

   /*     try{
            System.out.println(9/0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
*/

        try{
            System.out.println(9/0);
        }catch (IllegalArgumentException e){
           e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("test completed");

        System.out.println("----------------");

        try {
            System.out.println(new Scanner(System.in).nextInt());
        } catch (NumberFormatException e){
            e.printStackTrace();
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (RuntimeException e ){
            e.printStackTrace();
        }

        System.out.println("test completed 2");

     /*   try{
            break time;
        }catch (Akbar){
            Gives break early;
        }catch(Asya){
            Gives break on time;
        }catch(Muhtar){
                When students start crying;
        }

      */
        Circle circle1 = null;
        try{
            circle1.getRadius();
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}
