package methods;

public class Calc {

    public static void main(String[] args) {
        System.out.println(multiply(12, 10));

        System.out.println(multiply(12.3, 10.5));

        System.out.println(multiply(12.3, 10));

        System.out.println(multiply(12.3, "10.5"));

//        System.out.println(multiply("12.3",10.5));
//

    }
    //multiply two integers
    public static double multiply(double num1, double num2) {
        System.out.println("multiplying doubles");
        return num1 * num2;
    }

    public static double multiply(double num1, int num2) {
        System.out.println("multiplying double and integer");
        return num1 * num2;
    }

    public static int multiply(int num1, int num2) {
        System.out.println("multiplying integers");
        return num1 * num2;
    }


    public static double multiply(String num1, String num2) {
        System.out.println("multiplying Doubles as Strings");
        return Double.parseDouble(num1) * Double.parseDouble(num2);
    }

    public static double multiply(double num1, String num2) {
        System.out.println("multiplying Double and  String");
        return num1 * Double.parseDouble(num2);
    }
}
