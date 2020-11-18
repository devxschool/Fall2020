package class_structures;

//we are telling to bring a class from different package.
import firstclass.HelloWorld;
import java.util.Random;

public class ImportStatements {

    public static void main(String[] args) {
        //A way to print out random numbers.
        Random r = new Random();
        //put a bound number. ex: 10 means you want a random number from 0 to 10
        System.out.println(r.nextInt(100));
    }
}
