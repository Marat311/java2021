package Utilities;

public class AccessModifiers_Inheritance extends Data2{

    public void method(){
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
      //  System.out.println(privateVariable);

        publicMethod();
        protectedMethod();
        defaultMethod();
        //privateMethod();
    }
}
