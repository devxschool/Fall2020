package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingListToArray {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(123);
        nums.add(34);
        nums.add(43);
        nums.add(43);

        System.out.println(nums);


        //convert List to Array.
        //the size of an array in the params is ignored if the size is smaller than
        //the size of the list
        //default number to use is 0.
        Integer[] numsArr = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(numsArr));

        System.out.println(numsArr[1]);
        //get(int index) -> same thing as arr[int index];
        System.out.println(nums.get(1));



        String[] names = {"Elon Musk", "Steve Jobs", "B Franklin"};

        //convert names to List.
        //now namesList and names are storing the same references.
        //ex: names[0] and namesList.get(0) -> are pointing to the exact same object
        //in the heap.

        List<String> namesList = Arrays.asList(names);
        System.out.println(Arrays.toString(names));
        System.out.println(namesList);

        names[2] = "Bill Gates";
        System.out.println(Arrays.toString(names));
        System.out.println(namesList);

        //another constraint of creating list using Arrays.asList()
        //the list is fixed size
//        namesList.add("Jeff Bezos");

        System.out.println(namesList);

        List<String> namesListDynamic = new ArrayList<>(namesList);
        System.out.println(namesListDynamic);
        namesListDynamic.add(1,"Jeff Bezos");
        System.out.println(namesListDynamic);

        //method add is overloading
        //method add is an overloaded method.
        //so it has a version with two params
        //int and the data type of the Elements.
        //int repsents the index where you want to add the method to.
        //add(int index, String element)



    }
}
