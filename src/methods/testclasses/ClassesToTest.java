package methods.testclasses;

import java.text.DecimalFormat;
import java.util.List;

public class ClassesToTest {

    /**
     * Years of service under 5 get 5% of their salary as an annual bonus;
     */
    public static double calculateBonus(int yearsOfService, double salary) {
        if (yearsOfService < 5) {
            return salary * 5 / 100;
        } else if (yearsOfService == 7) {
            return salary;
        } else {
            return salary * 10 / 100;
        }
    }

    public static double convertFtoC(double f){
        DecimalFormat dc = new DecimalFormat(".00");
        return Double.parseDouble(dc.format((f - 32.0) * 5.0/9.0));
    }


    /**
     * given an array return reversed array with -> appended after every element.
     * PO - this required has a gap. does last element must be appended with -> NO.
     *
     * if any of the element in the array are null then return null
     *
     * if the arr is null then return "Nulls are not supported"
     *
     * Proactive
     *
     *
     *
     * @param arr
     * @return
     */
    public static String reversesArray (String [] arr) {
        if(arr == null) {
            return "Nulls are not supported";
        }
        int size = arr.length;
        StringBuilder result = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {

            if (arr[i] == null) {
                return null;
            }

            result = result.append(arr[i]);
            if (i > 0) {
                result.append(" -> ");
            }

        }

        return result.toString();
    }


    public static void printName(String str) {
        System.out.println("Hello " + str);
    }

    public static void list(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j) {
            while (array.get(j) == toMove) {
                j--;
            }
            if (array.get(i) == toMove) {
                int temp = array.get(j);
                array.set(j, array.get(i));
                array.set(i, temp);
            }
            i++;
        }
    }
}
