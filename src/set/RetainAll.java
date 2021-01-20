package set;

import java.util.HashSet;
import java.util.Set;

public class RetainAll {

    public static void main(String[] args) {

        //add matching elements
        //Select players which have been chosen by both players.

        Set<String> player1Selection = new HashSet<>();
        player1Selection.add("Elon");
        player1Selection.add("Bezos");
        player1Selection.add("Marry");
        player1Selection.add("Jane");


        Set<String> player2Selection = new HashSet<>();
        player2Selection.add("Elon");
        player2Selection.add("Steve");
        player2Selection.add("Marry");
        player2Selection.add("Mark");
        player2Selection.add("Bill");

        player1Selection.retainAll(player2Selection);

        System.out.println(player1Selection);
        //Year1 => Subjects taken
        //Year2 => Subjects taken
        //find out which subjects were taken in both years.

        //
        //Person A Traveled Cities
        //Person B Traveled Cities
        //find out common cities traveled


    }
}
