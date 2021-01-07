package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayClass2 {

    public static void main(String[] args) {
        String[] animals = {"Beetle", "Horse", "Cat"};

        //what happens if I print out a variable of the array?
        //System.out.println(animals);//HashCode of a memory location.
        //HashCode is an address of an object in the heap.


        //Arrays -> which is an utility class for array objects.
        //util

        //create a method which takes
        // int[],double[] or String[].
        //and return a String
        //it should return a String which content of the array
        //in the following format
        //String[] animals = {"Beetle", "Horse", "Cat"};
        // <Cat -> Horse -> Beetle>
        //int[] arr = {12,433,556,77}
        //<77 -> 556 -> 433 -> 12>
        System.out.println(Arrays.toString(animals));

        int[] arr1 = {1, 34, 6, 7};
        int[] arr2 = {1, 34, 6, 7};

        //      int[] arr1 = {1,34,6,7};
        //      int[] arr2 = arr1;
        System.out.println(arr1.equals(arr2));

        //How do I really compare the content equality?
        //Compares the content equality
        //values at the same index must be equal.
        System.out.println(Arrays.equals(arr1, arr2));

        //Arrays are mutable objects.
        int[] nums = {12, 434, 5656, 1, 3234, 664, 32, 21};
        //sorting -> ascending(asc) from small to bigger, descending(desc) - from bigger to smaller
        Arrays.sort(nums);
        System.out.println(nums);//Hashcode
        System.out.println(Arrays.toString(nums));


        String[] students = {"Elon Musk", "Melanie Perkins", "Steve Jobs", "Jane Doe", "Steve Jobs"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        //HOW DO I SORT IN DESCENDING ORDER OR(REVERSE ORDER)
        //we can not use Collections.reverseOrder() with primitives. we need use wrapper
        //class arrays if we need to sort in descending order
        Double[] nikeVaporMaxSizesBlue = {10.0, 8.5, 7.0, 8.0, 8.0, 10.0, 6.0};
        Arrays.sort(nikeVaporMaxSizesBlue, Collections.reverseOrder());


        System.out.println(Arrays.toString(nikeVaporMaxSizesBlue));

        Arrays.sort(students, Collections.reverseOrder());
        System.out.println(Arrays.toString(students));


        //HW: write a function which takes int, double or String array.
        //as a first param, and takes an int for defining a starting point
        //and another int for defining end point.

        //(int[] arr, int start, int end)

        //in order to avoid IndexOutOfBound exception
        //printout("Invalid start or invalid end) if start or end are out of index range

        //task to return a String of elements from start until end(exclusive)

        //ex: int[] numsArr = {12,43,654,56723,12,1,0,-12,-324};
        //method(numsArr,3,6) => [56723,12,1];

        int[] numsArr = {12,43,654,56723,12,1,0,-12,-324};

        Arrays.sort(numsArr,3, 6);
        System.out.println(Arrays.toString(numsArr));


    }
}
