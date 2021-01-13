package arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        //calculate sales
        //store all of the sales amounts of the day.

        double[] mondaySales = {12.43, 65.4, 56.5, 54.33,45.23};
        double[] tuesdaySales = {234.43, 45.4, 66.5, 214.33,21.11,43.5,32.1,34,56};
        double[] wednesdaySales = {14.43, 345.4, 566.5};
        double[] thursdaySales = {134.33, 15.4, 56.5, 124.33};

        //size of the inner arrays are not required.
        //they can be of different sizes
        //declaring inner array size doenst define a min or max values you can store.
        double[][] weeklySales = new double[7][2];
        weeklySales[0] = mondaySales;
        weeklySales[1] = tuesdaySales;
        weeklySales[2] = wednesdaySales;
        weeklySales[3] = thursdaySales;
        weeklySales[4] = new double[4];
        weeklySales[5] = new double[4];
        weeklySales[6] = new double[4];

        System.out.println(Arrays.deepToString(weeklySales));
        System.out.println(weeklySales[1][2]);

        //calculate total amount of sales of the week.
        for (int i = 0; i < weeklySales.length; i++) {
            for (int y =0; y <weeklySales[i].length; y++) {
                System.out.println(weeklySales[i][y]);
            }
        }

        for (double[] arr : weeklySales) {
            for (double l : arr) {

            }
        }
    }

}
