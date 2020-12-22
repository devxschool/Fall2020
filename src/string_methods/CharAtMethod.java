package string_methods;

public class CharAtMethod {

    public static void main(String[] args) {
        //[sad, happy]
        //FirstName LastName -> initials
        //. -> 1 -> 2.

        //print out E;
        //position => index;
        String str = "Elon Musk";
        char firstInitial  = str.charAt(0);
        char secondInitial = str.charAt(5);

        //sum of ASCII table decimal values.
        System.out.println(firstInitial + secondInitial);
        System.out.println((firstInitial) + (secondInitial));
        System.out.println(firstInitial +  "." + secondInitial + ".");

        //find the last character of a String.
        String city = "New York";
        char letter = city.charAt(7);

        int length = city.length();//8
        System.out.println(letter);

        char letterk = city.charAt(length - 1);
        System.out.println(letterk);


        //what happens if we put a negative number to charAt()
//        char negative = city.charAt(-10);  => throws StringIndexOutOfBoundsException
//        System.out.println(negative);
//        char negative = city.charAt(8);
//        char negative = city.charAt(city.length(););

    }

    //create a method which check if the format of initials is right.
    //take a String which will be initials.
    //rules: initials must only have two letter.
    //each letter must be followed by a '.'

    //ex:
    //#1
    //checkInitials("E.M.") => return true
    //checkInitials("SJ.") => return false
    //checkInitials("J.") => return false
    //checkInitials(".J.") => return false
    //checkInitials(".J") => return false
    //checkInitials("SJ") => return false

    //#2
    //checkInitials("") => print out "empty Strings are not allowed", return false

}
