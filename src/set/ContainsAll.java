package set;

import java.util.HashSet;
import java.util.Set;

public class ContainsAll {

    //Given a listOfSpeakers.
    //And a list of Registrants
    //make sure all registrants are present in the list of speakers.

    public static void main(String[] args) {
        Set<String> listOfSpeakers = new HashSet<>();
        listOfSpeakers.add("Elon");
        listOfSpeakers.add("Bezos");
        listOfSpeakers.add("Marry");
        listOfSpeakers.add("Jane");

        Set<String> listOfRegistrants = new HashSet<>();
        listOfRegistrants.add("Elon");
        listOfRegistrants.add("Jane");

        if (listOfSpeakers.containsAll(listOfRegistrants)) {
            System.out.println("Let them all in");
        } else {
            System.out.println("Someone is trying break in");
        }
    }
}
