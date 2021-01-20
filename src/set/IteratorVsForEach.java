package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorVsForEach {

    public static void main(String[] args) {


        Set<String> names = new HashSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Marry");
        names.add("Jane");
        names.add("Joe");
        names.add("Cole");
        names.add("Ashley");
        names.add("Frank");
        System.out.println(names);


//        for(String name : names) {
//            if (name.endsWith("e")) {
//                names.remove(name);
//            }
//        }

        //We have to use Iterator
        //if we need to remove multiple elements from our Set based on some
        //condition
        //
        Iterator<String> it = names.iterator();

        // names.removeIf(s -> s.endsWith("e")); // Lambda

        while (it.hasNext()) {
            if (it.next().endsWith("e")) {
                it.remove();
            }
        }

        System.out.println(names);
    }
}
