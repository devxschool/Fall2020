package arithmetic_operators;

public class Math2 {

    public static void main(String[] args) {
        int km = 10;

        double mile  = km/1.6;

        System.out.println(km + " kilometers are " + mile + " miles");


        int num1 = 10;
        int num2 = 99;

        //(num1 + num2) = 109;
        System.out.println("(num1 + num2) = " + (num1 + num2)); //if you want to add two numbers together
        // before adding(multiply, divide etc.) it to the text(String) use ()
        System.out.println("(num1 + num2) = " + num1 + num2);
        //10 + (10-5) => 15


        //modulo modulus
        //% -> modulo operator
        //reminder of a division
        int i = 100 % 7;
        System.out.println(i);

        //real life use cases of modulo
        int num = 25;
        int result = num%2;
        System.out.println(result);

        int num3  = 99;
        int num4 = 50;

        System.out.println(num + num3 + num4 + " result");//first we are working with two integers so we add them
        //then we add the sum(which is also an integer) to text


        System.out.println(" my " + num + num3 + num4 + " result");
        System.out.println(" my " + num + num3 + num4 + " result");
        System.out.println(num + num3 +""+ num4 + " result");//12450 result
    }
}
