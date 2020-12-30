package loops;

public class WhileLoopWithStrings {


    public static void main(String[] args) {
        //Print out every single character from a String
        String str = "DevX School";
        //D
        //e
        //v
        //X
        //
        //S
        int index = 0;

        while (index < str.length()) {
            System.out.println(str.charAt(index));
            index++;
        }


        //write a method that takes a String and returns
        //a reversed String.

        //ex: public static String reverse(String str){
        //}
        //ex: reverse("Hello") -> olleH
        //without using StringBuilder reverse method.
    }
}
