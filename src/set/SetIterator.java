package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
    //Problem:
    //Since Sets can not be accessed via index
    //and since Collections can not be modified
    //inside a for each loop.
    //we dont have a way of modifying Set Objects.

    //As a workaround this problem We can use Iterators.


    //Iterator is an interface
    //which is a collection of same objects.
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Marry");
        names.add("Jane");

        System.out.println(names);
        //Usually Iterators are initialized from a method of Lists, Sets.
        //iterator method is going to initialize an iterator
        //with the values the SET contains.

        Iterator<String> iterator = names.iterator();
        String name1 = iterator.next();
        System.out.println(name1);
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //There is direct connection between Set and Iterator.
        //BC Iterator stores the refernces to the objects which are in
        //in the Set.
        iterator.remove();

        System.out.println(names);




    }
}
