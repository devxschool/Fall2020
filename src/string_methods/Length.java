package string_methods;

public class Length {

    public static void main(String[] args) {

        String str = "John Doe";
        int numberOfCharactersInMyName = str.length();
        //including the white space.
        System.out.println(numberOfCharactersInMyName);

        String str1 = "Mercedes";
        System.out.println(str1.length());


        //get me the number of Letters only in my full name
        //if my full name is "Steve Jobs"
        String steve = "Steve Jobs";
        int nameWithoutOneSpace = steve.length() - 1;
        System.out.println(nameWithoutOneSpace);
    }
}
