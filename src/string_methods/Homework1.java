package string_methods;

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
//checkInitials("S,J.") => return false

//#2
//checkInitials("") => print out "empty Strings are not allowed", return false
public class Homework1 {

    public static void main(String[] args) {
        System.out.println(isLetter("A!K,"));
        System.out.println(checkInitials("a.f."));
        System.out.println(checkInitials("S.J"));
        System.out.println(checkInitials("!..@"));
        System.out.println(checkInitials("!.$."));
        System.out.println(checkInitials(""));
    }

    public static boolean checkInitials(String initials) {

        if (initials.isEmpty()) {
            System.err.println("empty Strings are not allowed");
            return false; //return exists the method.
        }

        if (initials.length() == 4 && isLetter(initials)
                && initials.charAt(1) == '.'
                && initials.charAt(3) == '.') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * method definition -> creating a method
     *
     *
     */
    public static boolean isLetter(String str) {
        if ((str.charAt(0) >= 65 && str.charAt(0) <= 90)
                ||
                (str.charAt(0) >= 97 && str.charAt(0) <= 122)

                        &&

                        str.charAt(2) >= 65 && str.charAt(2) <= 90
                ||

                str.charAt(2) >= 97 && str.charAt(2) <= 122) {
            return true;
        } else {
            return false;
        }
    }
}
