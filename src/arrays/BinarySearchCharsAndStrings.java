package arrays;

import java.util.Arrays;

public class BinarySearchCharsAndStrings {

    public static void main(String[] args) {
        //W -> 3
        //D -> 1
        //L -> 0
        char[] chicagoBullsStats = {'W','W','L','D','D','W','W','W','W'};

        Arrays.sort(chicagoBullsStats);
        System.out.println(Arrays.binarySearch(chicagoBullsStats,'L'));



        String[] companies = {"Amazon", "Apple", "Facebook", "Google", "Tesla Motors", "Toyota"};

    }
}
