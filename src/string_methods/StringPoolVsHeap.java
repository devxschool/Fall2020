package string_methods;

public class StringPoolVsHeap {


    public static void main(String[] args) {

        String car = "Toyota";
        String car2 = "Lexus";
        String car3 = "Toyota";

        String car4 = new String("Toyota");
        String car5 = new String("Toyota");

        boolean result1 = car == car2;//false
        boolean result2 = car == car3;//true
        boolean result3 = car2 ==car3;//false

        boolean result4 = car4 == car;//false

        boolean result5 = car4.equals(car);//true -> compare values letter to letter
        //not memory location.

        boolean result6 = car4 == car5;//false

        System.out.println(result6);
        System.out.println(car4.equals(car5));
        //new keyword tell java to create a new object in the heap.









    }
}
