package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorPractice {

    //User Iterator if you need to remove/replace an Object in the Set.
    //
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

        //using Iterator print out every single element
        Iterator<String> it = names.iterator();


        //When there is a repeating code
        //how can we optimize?

        //What do I need to do in order to print out all
        //elements in the Set using Iterator?
        //You need to call .next() method as many times as the size of the
        //Set
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(it.next());
//        }

        System.out.println("===============");

        while (it.hasNext()) {
            if (it.next().equals("Joe")) {
                it.remove();
                //While an iterator is being used you can not modify your Set
                //names.add("Rio");
            }
        }

        //You can only modify(add) more stuff to your Set after the iterator
        //has reached the end
        //Or else, Iterator.hasNext() return false.
        names.add("Rio");
        System.out.println(names);






    }
}
