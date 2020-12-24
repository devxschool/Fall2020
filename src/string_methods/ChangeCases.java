package string_methods;

public class ChangeCases {

    public static void main(String[] args) {
        String str = "DevX school";

       String result =  change(str,"school");
       System.out.println(result);
    }

    //write a method
    //which will take a string and you will change the first letter of it to upperCase
    //
    //w == 'W' ->
    //s == 'S' ->

    public static String change(String strOrignal,String subString) {
        //find the index of the first letter of subString.
        int indexOfFirstLetter = strOrignal.indexOf(subString);

        //using the indexOfFirstLetter call toUpperCase();
        String firstLetterUpperCased =
                strOrignal.substring(indexOfFirstLetter, indexOfFirstLetter + 1).toUpperCase();

        String firstPart = strOrignal.substring(0, indexOfFirstLetter);
        String lastPart = strOrignal.substring(indexOfFirstLetter + 1);

        return firstPart + firstLetterUpperCased + lastPart;
    }
}
