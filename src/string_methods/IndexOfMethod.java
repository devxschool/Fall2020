package string_methods;

public class IndexOfMethod {

    public static void main(String[] args) {

        String str = "The beautiful mind";
        //find the index of a 'b'

        int indexOfB = str.indexOf("b");
        System.out.println(indexOfB);

        int indexOfFirstSpace = str.indexOf(" ");
        System.out.println(indexOfFirstSpace);

        //what is the guarantee of ind returning 15?
        //there is only one occurrence of ind in the String
        int indexOfLastI = str.indexOf("ind");
        System.out.println(indexOfLastI);


//        int indIndex = str.indexOf("mind".indexOf("i"));
//        System.out.println(indIndex);


        String str1 = "The kind of beautiful mind";
        int indexofLastIndex = str1.indexOf("mind") + 1;

        System.out.println(indexofLastIndex);

        int indexOfSecondSpace = str1.indexOf(" of");
        System.out.println(indexOfSecondSpace);


        String str10 = "Mega Mega Megafon";
        System.out.println(str10.indexOf("e", 3));

        System.out.println(str10.indexOf("ga", 4));

        System.out.println(str10.indexOf(" Me"));

        System.out.println(indexOfSecondSpace("Hello 2021 New Year. Be better!"));
    }

    //write a method than takes a String and return the index of the second space.
    public static int indexOfSecondSpace(String str) {
        return 1;
    }
}
