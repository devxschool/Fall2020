package lists;

public class WrapperClasses {

    public static void main(String[] args) {

        //int -> Integer
        //this is the traditional way of initializing wrapper
        //classes
        //we can
        Integer num1 = new Integer(12);
        System.out.println(num1);

        System.out.println(num1+2);
        System.out.println(num1/2);

        //autoboxing => when you assign a literal values to
        //corresponding Wrapper classes
        //this process is called unboxing.

        Integer num2 = 12;

        //when assigning a wrapper class value to a
        //primitive data type it's called unboxing.
        int num3 = num2;


        Character ch = 'D';
        System.out.println(Character.isAlphabetic('H'));

        String year = "1233";
        int yearInt = Integer.parseInt(year);
        yearInt/=2;


    }
}
