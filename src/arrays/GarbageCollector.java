package arrays;

import java.util.Scanner;

public class GarbageCollector {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");


        Scanner sc = new Scanner(System.in);

        System.out.println(sb.length());

        sb = null;
        sc=null;

        System.gc();//checks if any objects in the heap dont have
        //references

        System.out.println("SDET");
        //you should not be using a variable that is
        //pointing to null;
        System.out.println(sb.length());
        System.out.println("JAva");
        System.out.println("JAva");
    }
}
