package Office_Hourse.finallyBlock;

public class ThrowException {
    public static void main(String[] args) {
        String name = "";
        if(name.isEmpty()){
         /*   System.out.println("Name can not be empty");
            System.err.println("Name can not be empty");

          */
            throw new RuntimeException("Name can not be empty");
        }
    }
}
