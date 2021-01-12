package arrays;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] messiGoalsInLastDecadePerYear = {47, 41, 53, 73, 41, 60,  53, 41, 58, 41, 54, 45, 41, 51, 30};

        Arrays.sort(messiGoalsInLastDecadePerYear);
        //[12, 30, 41, 41, 45, 47, 51, 53, 54, 58, 60, 73,78]
        //0-1
        //-15-1
        System.out.println(Arrays.toString(messiGoalsInLastDecadePerYear));

        //binarySearch we can compare to indexOf()
        //return an int which represents the index of a found element.
        int index = Arrays.binarySearch(messiGoalsInLastDecadePerYear, 30);
        int index2 = Arrays.binarySearch(messiGoalsInLastDecadePerYear, 54);
        System.out.println(index);

        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear,47));
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear,53));

        //When the value not present
        //binarySearch method is going to return a negated index where the element would be placed
        //in a sorted array -1.

        //so that when the element that's not found in the array would be placed at index 0 would not be
        //confusing.
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear,12));
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear,78));
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear,37));
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear,48));
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear,79));
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear,79));


        int[] arr = {12,34,56,33,11,22,33,22,121,34,1,2,3,5,6,3,2,1,0,-12};
        //when you use binary search without sorting the array
        //you get unpredictable value.
        System.out.println(Arrays.binarySearch(arr,12));


    }

    //write a method which find the index of a given element.
    //method takes an int array and it takes a int value
    //your method should return an int which is the index of the given value.
    //if the value doesnt exist return 0;


    //try to create a method which accepts an int array
    //and returns a sorted int array.
}
