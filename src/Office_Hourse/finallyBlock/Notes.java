package Office_Hourse.finallyBlock;

public class Notes {
    /*
    1- CHECKED VS UNCHECKED

    CHECKED : Unwanted event

        - It occurs in Compiler Time
        - We MUST handle
        - Easy To Catch
        - Solution
            - TRY CATCH
            - THROWS

    UNCHECKED : Unexpected event

        - It occurs in Runtime( All unchecked exceptions are RunTime Exception)
        - Code will compile even if we handle OR not
        - Not Easy to Catch
        - Solution
            - TRY CATCH

2- TRY CATCH

        - It can be used for UNCHECK and CHECKED

        MULTIPLE TRY CATCH

        - TRY block will be capable of throwing exception one or more.
        - if we don't exception we should multiple catch to catch it

        RULE : PARENT Exception type can not be placed before CHILD

3- THROWS

        - used for ONLY CHECKED EXCEPTIONS
        - it inform the compile that method can throw one or more Exception
         RULE : When you declare a CHECKED Exception, whoever CALLS this method is resposible to HANDLE(TRY CATCH) OR DECLARE(THROWS)

4- FINALLY

        - Why we need FINALLY?
        - If we want to some code to be always executed we should use finally block

        - The statements finside finally block execute whether an exception occurs or not

Question: Is finally block always gets executed ?
            - System.exit(0);
            - JVM Crash


5- THROW
        - if you want throw an exception manually we can use it
            -  Java Exceptions
            - Custom Exceptions

6-CUSTOM Exceptions

        - We can create Custom Exception  by extending the parent of the exception class or one of its subclasss
     */
}
