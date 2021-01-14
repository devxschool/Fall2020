package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List2 {

    public static void main(String[] args) {
        int[] arr = {1,34,56,3};

        //Lists can not store primitive data types.
        //there is absolutely no difference in the functionality
        //between
        //ArrayList<Integer> nums = new ArrayList<>();

        //and
        //List<Integer> nums = new ArrayList<>();


        //option + enter to import packages
        List<Integer> nums = new ArrayList<>();
        nums.add(402);
        nums.add(123);
        nums.add(312);
        nums.add(402);

        System.out.println(nums);

        //remove(Object o) -> would take any value which you want to delete.
        //deletes the first match.
        //for Wrapper classes you need to pass in a new Integer(402)/Double(12.4)
        nums.remove(new Integer(402));
        System.out.println(nums);

        //remove(int index) -> remove an element at the given index.
        nums.remove(1);
        System.out.println(nums);


        //populating - adding  values to arrays, lists. sets, maps.
        List<String> birds = new ArrayList<>();

        birds.add("Hawk");
        birds.add("Cardinal");
        birds.add("Eagle");
        birds.add("Parrot");
        birds.add("Sparrow");

        System.out.println(birds);
        //update Sparrow to Jack Sparrow
        birds.set(4,"Jack Sparrow");
        System.out.println(birds);

        //Talking Parrot
        //return -1
        int indexOfParrot = birds.indexOf("Parrot");

        birds.set(indexOfParrot, "Talking Parrot");
        System.out.println(birds);

        birds.set(birds.indexOf("Hawk"), "Blackhawks");
        System.out.println(birds);

        //Case sensitive
        System.out.println(birds.indexOf("Pigeon"));


        System.out.println(birds.isEmpty());

        //arr.length
        //number of element in the List
        System.out.println(birds.size());

        birds.clear();
        System.out.println(birds);
        System.out.println(birds.size());
        System.out.println(birds.isEmpty());

        birds.add("Hawk");
        birds.add("Cardinal");
        birds.add("Eagle");
        birds.add("Parrot");
        birds.add("Sparrow");

        System.out.println(birds);

        //case sensitive 100% match
        System.out.println(birds.contains("Hawk"));
        System.out.println(birds.contains("Sparrow"));

        //imagine a scenario where you have collection.
        System.out.println(birds.contains("Pigeon"));
        System.out.println(birds.indexOf("Hawk"));

        //List -> interface
        //ArrayList is implementation of List interface
        //Interfaces enable polymorphism.
        //polymorphism means an ability to take multiple forms.
        //List data type has an ability to take 2 forms
        //1. ArrayList
        //2. LinkedList.
        List<StringBuilder> sbList = new ArrayList<>();

        //what does array.equals do?
        //compares the reference to the objects.


        //List.equals -> compares values and orders.


        List<String> birds2 = new ArrayList<>(birds);
        System.out.println(birds2);

        List<String> birds3 = new ArrayList<>();

        birds3.add("Hawk");
        birds3.add("Cardinal");
        birds3.add("Eagle");
        birds3.add("Parrot");
        birds3.add("Sparrow");

        System.out.println(birds3);

        System.out.println(birds.equals(birds2));
        System.out.println(birds.equals(birds3));
        System.out.println(birds2.equals(birds3));











    }
}
