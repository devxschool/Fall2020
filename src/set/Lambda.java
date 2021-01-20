package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lambda {

    public static void main(String[] args) {
        //Cache memory -> stores temporary information within one
        //program run. Information stored only during the program run. All info
        //in the cache gets deleted when program stops.
        //Cache memory -> is the fastest memory to access.
        //Collection are usually referred to as Cache Memory.

        Set<String> plateNums = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        //Ask a DMV agent to enter a new plateNum.
        for (int i = 0; i < 5; i++) {
            System.out.println("Add a new Plate Number");
            if (!plateNums.add(sc.nextLine())) {
                System.out.println("The plate number is taken");
            }
        }


        if (plateNums.contains("IL1234")) {
            System.out.println("IL1234");
        }

        //Write a logic which would print out "IL1234" if it exists in the
        //set
        for (String element : plateNums) {
            if (element.equals("IL1234")) {
                System.out.println(element);
            }
        }

        //printing out every single element in a new line;
        //lambda and streams.
        //Collections. List, SET.
        plateNums.forEach(System.out::println);




    }
}
