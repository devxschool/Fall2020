package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    //Build an SDET Dictionary
    //The program should take a word and return a definition of the word
    public static void main(String[] args) {
        //jdk
        //Java Development Kit is a bundle of JVM, and some libraries which
        //comes with installation of Java.

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("jdk", "Java Development Kit is a bundle of JVM, and some libraries which comes with installation of Java.");
        dictionary.put("==", "Difference between equals() and == is that == compares if two references are poiting to the same object in the Heap. and equals() compares the values of two different objects");
        dictionary.put("== and .equals()", "Difference between equals() and == is that == compares if two references are poiting to the same object in the Heap. and equals() compares the values of two different objects");
        dictionary.put("lists", "Lists are collection of objects of same data type. it cannot store primitives.");


//        System.out.println("Enter a word");
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();

        //show all of the word definitions that has a key that contains
        //given word;
       // System.out.println(dictionary.get(word.trim().toLowerCase()));

        if(dictionary.containsKey("==")){
            System.out.println(dictionary.get("=="));
        }

        System.out.println(dictionary.containsValue("Java"));
        System.out.println(dictionary.containsValue("Java Development Kit is a bundle of JVM, and some libraries which comes with installation of Java."));

        String result = dictionary.remove("lists");
        System.out.println("deleted " + result);

        String oldValue = dictionary.replace("jdk", "java development KIT");
        System.out.println(oldValue);
        System.out.println(dictionary.get("jdk"));

        dictionary.replace("jvm", "Java Virtual Machine");
        System.out.println(dictionary.get("jvm"));
    }
}
