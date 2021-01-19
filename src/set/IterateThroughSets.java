package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IterateThroughSets {

    public static void main(String[] args) {
        Set<String> uniqueSSNs = new HashSet<>();
        uniqueSSNs.add("000-00-0000");
        uniqueSSNs.add("123-33-4444");
        uniqueSSNs.add("222-a3-2457");
        uniqueSSNs.add("988-00-6788");
        uniqueSSNs.add("123-33-4444");

        //How can I modify second element? Since Set values are unordered it doesnt make sense
        //to modify an element that you dont know of.


//        if(uniqueSSNs.contains("123-33-4444")){
//            uniqueSSNs.remove("123-33-4444");
//            uniqueSSNs.add("123-33-4445");
//        }


        //Not Thread Safe
        //For each loop cannot be used to actually modify the SET.
//        //You can only use for each loop to play with the Elements.
//        for (String var : uniqueSSNs) {
//            if (var.equals("123-33-4444")) {
//                uniqueSSNs.remove("123-33-4444");
//                uniqueSSNs.add("123-33-4445");
//            }
//        }
//


        System.out.println("End");

        System.out.println(uniqueSSNs);



        List<String> list = new ArrayList<>();
        list.add("000-00-0000");
        list.add("123-33-4444");
        list.add("222-a3-2457");
        list.add("988-00-6788");
        list.add("123-33-4444");


        //For each loop can not be used to actually modify
        //the collection.
        for (String var : list) {
            if (var.equals("123-33-4444")) {
                list.remove("123-33-4444");
                list.add("123-33-4445");
            }
        }


        System.out.println(list);







    }
}
