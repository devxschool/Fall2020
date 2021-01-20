package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Marry");
        names.add("Jane");

        names.remove("Jane");
        names.add("Cole");
        System.out.println(names);

        Set<StringBuilder> employees = new HashSet<>();
        //Add lastname to Elon
        employees.add(new StringBuilder("Elon"));
        employees.add(new StringBuilder("Bezos"));
        employees.add(new StringBuilder("Marry"));
        employees.add(new StringBuilder("Jane"));
        employees.add(new StringBuilder("Elona"));

        System.out.println(employees);

        Iterator<StringBuilder> it = employees.iterator();

        while (it.hasNext()) {
            StringBuilder elon = it.next();
            //return true if the value of elon -> "Elon"
            //contains and equals method? =>
            if (elon.toString().equals("Elon")) {
                elon.append(" Musk");
            }
        }

        System.out.println(employees);


    }
}
