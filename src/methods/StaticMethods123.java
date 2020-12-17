package methods;

public class StaticMethods123 {

    public static void main(String[] args) {

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
