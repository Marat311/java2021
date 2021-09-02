package Office_Hourse.finallyBlock;

public class FinallyBlock
{
    public static void main(String[] args) {

        readFromDB();
        System.out.println("Line after method");

    }

    public static void readFromDB(){
        Connection connetion = new Connection();
        try {
            connetion.open();
            String str = null; //data from dataBase
            System.out.println(str.length());
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException is handled");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException is handled");
        }finally {
            connetion.close();
        }


    }
}
