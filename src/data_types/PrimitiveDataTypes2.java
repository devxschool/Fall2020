package data_types;

public class PrimitiveDataTypes2 {


    public static void main(String[] args) {
        byte age = 127;
        short miles = 32000;
        int views = 2_000_000_000;
        System.out.println(views);
        //assign values
        long worldPopulation = 7800000000L;
        System.out.println(worldPopulation);

        double itemPrice2 = 12.99;
        double itemPrice3 = 11.50d;//d is optional for double
        //by default decimal pointed numbers are considered to be doubles
        float itemPrice = 12.99f;

        //boolean is a true or false;
        //isOn, isCold, isRed, isLarge, isCat
        //microwave             //yes  //no
        boolean isMicrowaveOn = true; //false
        boolean has4legs = true;
        boolean has2Legs = false;

        System.out.println(isMicrowaveOn);
        System.out.println(has4legs);
        System.out.println(has2Legs);

        //any single character.
        //if we want assign a character we need to wrap it up inside a
        //single quote;

        char gender = 'M';
        System.out.println(gender);

        char excellentGrade = 'A', goodGrade = 'B', okayGrade = 'C';

        System.out.println(excellentGrade);
        System.out.println(goodGrade);
        System.out.println(okayGrade);

        char emailSign = '@';
        System.out.println(emailSign);
        char singleQuote = '\'';

        char letterADecimal = 65;
        System.out.println(letterADecimal);

        char openingPar = 40;
        System.out.println(openingPar);

        char digit = '1';
        System.out.println(digit);

        char emptySpace = 9;
        System.out.println(emptySpace);
        System.out.println("aaaa\raaaabb");

        int num1 = 100;

        //num2 will have the exact same value as num1;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        int num10 = 2000;
        int num11 = 1000;
        int num12 = 90;

        //store the original value of num11
        int temp = num11;//1000
        num11 = num10;// num11 = 2000
        num10 = temp;//num10 = 1000;

        System.out.println(num10);
        System.out.println(num11);
        //kicked 2000 out and 0 is in the container
        num10 = 0;


        //        //num11 will have the value of num10 => 2000
//        num11 = num10;//num11 -> 2000
//
//        //2000
//        num10 = num11;
        //make num10 to print out the value of num11
        //make num11 to print out hte value of num10
        //swap the values


        int a = 11;

       // boolean isTrue = a; cannot assign int to boolean

        long num = a;

        long numLong = 12312312313231l;

       // int smallNum = numLong;//int is a smaller container than long

        short s = 1234;
        int intNum = s;

        System.out.println(s);
        System.out.println(intNum);

        float f = 123.55f;
        double ddd = f;

        System.out.println(f);
        System.out.println(ddd);

        //data type casting
        int i = 112323;
        double price = i;

        System.out.println(price);
    }
}
