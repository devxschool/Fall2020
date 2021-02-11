package exceptions;

public class TryCatchFinally {

    public static void main(String[] args) {

        /**
         * Why do we need to finally block?
         *
         */
        try {
            WriteFile.writeToFile("HelloWorld");
            System.out.println("Try Block");
        } catch (Exception e) {
            System.out.println("catch block");
        } finally {
            System.out.println("Finally block");
        }



    }
}
