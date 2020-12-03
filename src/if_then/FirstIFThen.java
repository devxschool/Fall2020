package if_then;

public class FirstIFThen {

    public static void main(String[] args) {

        //if the given hour is less than 11
        //print out "Good morning"

        int hour = 12;

        //boolean Expression
        //condition
        //true
        if (hour < 11) {//everything inside the curly braces are one block of code.
            //Good morning will be printed out only when hour is less than 11
            //is not 100% guaranteed to run.
            System.out.println("Good morning");
            System.out.println("Today's is going to be a great and productive day");
        }
        //continue normal processing.
        //since it's not inside any if statement block
        //will run everytime 100%.
        System.out.println("Program finishing");


        //if statements {} are optional.
        //but we have to be very careful with skipping {}.
        //when {} are skipped only one statement is considered to be block of the
        //if statement


        if (hour < 11)
            System.out.println("Good Moring 2");
        System.out.println("Have a productive and fun day");

//     same as
//     if (hour < 11) {
//            System.out.println("Good Moring 2");
  //  }
//        System.out.println("Have a productive and fun day");
    }
}
