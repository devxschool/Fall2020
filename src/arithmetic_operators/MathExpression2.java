package arithmetic_operators;

public class MathExpression2 {
    public static void main(String[] args) {

        int num = 300;
        int num1 = 30;

        //addition
        int sum = num + num1;
        //"" + ""
        //" ";
        // 300 + 30
        //330;
        int sum1 = 300 + 30;

        System.out.println(sum);
        System.out.println(sum1);

        int difference = num - num1;
        System.out.println(difference);

        int multiplication = num * num1;
        System.out.println(multiplication);

        int division = num/num1;
        System.out.println(division);
        System.out.println();


        //Grocery store
        //receipt
        double priceOfAnOrange = 0.99;
        int amountOfOranges = 2;

        double total = priceOfAnOrange * amountOfOranges;//98.50
        //price for oranges: 1.98
        //amount: 2
        System.out.println("Orange price per lb: \t$" + priceOfAnOrange);
        System.out.println("amount: \t\t\t\t\t" + amountOfOranges);
        System.out.println("Total: \t\t\t\t\t$" + total); //Total: $1.98



        //
        double implicitCasting = amountOfOranges;
        System.out.println(implicitCasting);

        int explicitCasting = (int)priceOfAnOrange;
        //casting bigger data type to a smaller one requires explicit casting

        //(int) on the right side of = sign means we are converting a variable to int data type.
        int totalInt =  (int)(amountOfOranges * priceOfAnOrange); //() takes place before casting and casting takes place before math operations.
        int totalInt1 =  amountOfOranges * (int)priceOfAnOrange; //casting takes place before math operations.

        System.out.println(totalInt);
        System.out.println(totalInt1);
        //precedence => order.
        //3 + 2 * 2 = 7;


    }

    //Math operators we usually use between two number variables.
    //implicit => indirect(happens automatically behind the scene)
    //explicit => direct(we need to take an action manually)
}
