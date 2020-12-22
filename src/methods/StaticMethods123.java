package methods;

public class StaticMethods123 {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        //static methods are called from the className;
        int ab = StaticMethods123.absolute(-12);

        //to instance methods are only called from object variables.
        double tax = c.calculateTax(true, 120000);
        System.out.println(tax);
    }

    //get an integer and return the absolute number
    //distance from the 0;
    //-10 -> 10
    //10 -> 10
    //-9 -> 9

    //static methods can be called without creating an object.
    //just by using ClassName.methodName();
    public static int absolute(int i) {
        return (i<0) ? -i : i;
    }
}
