package day43_OOP_Encapsulation;

public class Test {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        System.out.println(AccessModifiers.protectedVariable);
        System.out.println(AccessModifiers.defaultVariable);
       // System.out.println(AccessModifiers.privateVariable);

      EncapsulationIntro e = new EncapsulationIntro();
      /*  System.out.println(e.username);
        System.out.println(e.password);

*/
        System.out.println(e.getUsername());

        e.setUsername("Marinka");
        System.out.println(e);

        System.out.println(e.getUsername());
        System.out.println(e.getPassword());

    }
}
