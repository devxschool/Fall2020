package maps;

import java.util.ArrayList;
import java.util.List;

public class DiffBetweenEquals {

    public static void main(String[] args) {
        //Every non-primitive data type(every class)
        //has equals() method.
        //this equals() method comes from Object class.
        //Object class is the GodFather of all classes
        //which means every class in Java has methods
        //that are created in Object class

        Object o  = new Object();
        o.equals("sdf");
        o.hashCode();
        o.toString();

        String str = "gdf";
        str.equals("sfgd");
        str.hashCode();
        str.toString();

        //original equals() is same as ==;
        //equals method can only be used with non-null objects.
        //we can not use equals(null);

        //Though all of the classes have equals method
        //not all of the classes use the same implementation
        //of equals() method.

        //which tells us that classes have the option to change
        //how their equals work.

        //ex: String has changed how it's equals method work.

        StringBuilder sb  = new StringBuilder("gfd");
        StringBuilder sb1  = new StringBuilder("gfd");




        //String.equals() is different
        //it check if the values are equal.

        String gf = new String("Hello World");
        String fg = new String("Hello World");

        //true => String.equals() checks if the spelling the same
        System.out.println(gf.equals(fg));
        //false
        System.out.println(gf == fg );


        //false =>
        System.out.println(sb1.equals(sb));

        //== checks if two references are pointing
        // to the same Object in the Heap

        //before using equals method you need to make sure
        //if the equals is changed in the class you are using

        List<String> abc = new ArrayList<>();
        abc.add("fgd");
        abc.add("fgd");
        abc.add("fgd");
        abc.add("fgd");


        List<String> abc2 = new ArrayList<>();
        abc2.add("fgd");
        abc2.add("fgd");
        abc2.add("fgd");
        abc2.add("fgd");

        //if equals method was not changed anywhere in the List
        System.out.println(abc.equals(abc2));
    }
}
