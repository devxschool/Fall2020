package loops;

public class StringVsStringBuilderInLoops {


    public static void main(String[] args) {

        //Get an input from a user
        //and modify the text with wrapping every word
        //with {}

        //ex: Hello World -> {Hello} {World}
        //if you have a task

        String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
//        StringBuilder str = new StringBuilder("ABC");

//        String str = "ABC";
//        int i = 3;
//
//        while (i < alphabet.length()) {
//            str += alphabet.charAt(i);
//            i++;
//        }
//
//        System.out.println(str);

        StringBuilder str = new StringBuilder("ABC");
        int i = 3;

        while (i < alphabet.length()) {
            str.append(alphabet.charAt(i));
            i++;
        }

        System.out.println(str);




    }
}
