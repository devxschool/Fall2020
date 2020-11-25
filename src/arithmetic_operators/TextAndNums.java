package arithmetic_operators;

public class TextAndNums {

    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int i = a * b;
        System.out.println("Text " + i);//text 21
        System.out.println("some text" + a + b);//some text1011
        System.out.println(" " + (a+b));// 21
        //System.out.println("text" + a - b);//Strings can only work with + thus text10 - b doesnt compile
        System.out.println("apples" + a * b);//* has higher precedence than +
        //10+2*2
        System.out.println("hello " + (double)a/b);//if you have two different data types in the operation java is going to cast
        //all variables involved in the operation to the biggest data type.
        System.out.println("hello " + a/(double)b);
        //System.out.println("line 15 " * b); you can only use + with String.

        a = 5;//reassigning the value
        System.out.println("value of a after reassignment " + a);
        a = 66;
        System.out.println("value of a on line 23 " + a);
        a = b;
        System.out.println("test assingment operator " + (a = b));//changing the value of a to 11
        //assignment operator changes the value of a variable on the left to what ever is on the right
    }
}
