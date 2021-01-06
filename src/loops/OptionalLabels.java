package loops;

public class OptionalLabels {

    public static void main(String[] args) {
        //Optional Labels
        int num = 0;
        while (num < 10) {

            if (num == 3) {
                //continue; //continue -> ends the current iteration and go to the next one.
                //break;//stops the while loop when num==3;
            }

            for (int i = 0; i < 15; i++) {//supposed to run 15 times for each num.
                if (num == 3) {
                    //continue;//jum the for loop onto next iteration.
                    break;
                }
                System.out.print("num " + num + " i: " + i + " ");
            }

            System.out.println();
            System.out.println("----------------------------");
            num++;
        }


        //Palindrome -> if a word is read the same both ways.
        //is it case sensitive?
        //do you want to ignore spaces?
        //kayak - yes
        //abba -> palindrome
        //Level -> palindrome


        //print out all numbers between 0 and 10 skip 7
        //optinal labels are just any name we can put before a loop statement.
        abc:
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                continue abc;//which means continue the loop which has this label.
            }
        }


    }


    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        //str= "hello";
        //str.charAt(str.length()
        for (int i = 0; i < str.length(); i += 2) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                return false;//when you have return in the body of the method.
                //it will act as a break statement to the whole method and return the result.
            }
        }
        return true;
    }


    //Optional Labels.

    //check if the string has at 2 oo.
    //Door
    //Doordash
    //loot
    //root
    //good
    //blood
    public static boolean check(String str) {
        return str.contains("oo");
    }

    //Write a function which takes two Strings.
    //str1  and str2.
    //check if you are able to build the str1 using characters from str2?

    //str1 = hello
    //str2 = eohll => true

    //str1 = hello
    //str2 = eohllahee => true

    //str1 = hello
    //str2 = oleh -> false

    //str1 = hello
    //str2 = oleha -> false

    public static boolean ransomChars(String str1, String str2) {
        return false;
    }

}
