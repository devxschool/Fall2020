package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetdemo {

    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Marry");
        names.add("Jane");

        Iterator<String> it = names.iterator();
        System.out.println(names);
    }
}
