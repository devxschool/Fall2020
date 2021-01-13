package lists;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {
        //shortcut for import -> alt + enter for windows
        //option + enter for mac

        //<String> -> Generics. are used to force certain data types
        //for all elements in the arrayList.
        //
        ArrayList<String> firstList = new ArrayList<>();

        //how do we add new elements to our list?
        //Adds to the end of the collection.
        firstList.add("BMW");
        firstList.add("Mercedes");
        firstList.add("Lambo");

        System.out.println(firstList);

        firstList.add("Ferrari");
        System.out.println(firstList);

        //it's  flexible method that add the elements at the given index.
        firstList.add(1,"Dodge");
        System.out.println(firstList);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(12);
        nums.add(-10);

        System.out.println(nums);

        //instead of [] lists use .get(int index) method to access
        //specific elements
        System.out.println(firstList.get(2));

        //same as arr.length.
        System.out.println(firstList.size());
    }
}
