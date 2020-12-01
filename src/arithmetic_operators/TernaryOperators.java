package arithmetic_operators;

public class TernaryOperators {


    public static void main(String[] args) {

        //I want to know where I should go
        //Morning -> Go to Gym
        //evening -> go to DevX Class

        String time = "Morning";

        //if time equals to Morning
        //? => then return "Gym"
        //: => otherwise return "DevX Class";

        String whereShouldIGo = time=="Morning" ? "Gym" : "DevX Class";
        System.out.println(whereShouldIGo);

        System.out.println(time=="Morning" ? "Gym" : "DevX Class");


        String carOffered = "Ferrari";

        boolean buy = carOffered == "Ferrari" ? true : false;

        System.out.println(buy);

        //the data type of a variable on the left will define what you need to after ?
        // or :

        // = vs == ?
        //= is used to assign a value to a variable.
        //== used for comparison.
        //false == false => true;

        //Write my name in upper or lowercase based on my selection

        String casee = "lower";

        String name = casee == "upper" ? "JOHN" : "john";
        System.out.println(name);


        int num1 = 13254454;
        int num2 = 4554554;
        int num3 = 3233232;
        //is num1 greater than num2
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);


        //nested ternary operators.
        //
        int max2 = num1 > num2 && num1 > num3 ? num1 : (num2 > num3 ? num2 : num3);
        System.out.println(max2);


        boolean isExpensive = true;
        boolean isGoodQuality = true;

        boolean buy1 = false;

        //not used much.
        buy1 &= isGoodQuality;//buy1 = buy1 & isGoodQuality;

        //buy1 = false & true;
        //buy1 = false;

        System.out.println(buy1);



        int a = 10, b = 5, c = 1, result;
        result = a - ++c - ++b;
        System.out.println(result);
    }
}
