package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListProblemSolving {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        list.add(name);
    }

    //Create a method which will take a List of Strings for products
    //and second String param for newProduct.
    //add this newProduct to the list of the product doesnt already exist
    //in the list.
    public static void addIFNotPresent(List<String> products, String newProduct) {

    }


    //1, 2, 3, 4, 5
    //Elon, Steve, Franklin.


    //write a method which takes an List<Integer>
    //and returns an int which is the sum of two biggest values(elements) can be duplicates
    //ex: [145,4,-10,13,44,3,0]
    //189
    //145+44 = 189;

    //ex: [50,4,50,13,44,3,0]
    //100
    //50+50 = 100;

    //1. solve using sort.
    //2. solve without using sort.

    //#2
    //write a method which takes an List<Integer>
    //and returns an int which is the sum of two biggest values(elements) can not be duplicates
    //ex: [145,4,-10,13,44,3,0]
    //189
    //145+44 = 189;

    //ex: [50,4,50,13,44,3,0]
    //94
    //50+44 = 94;

    //public int doSomething(List<String> arr);


}
