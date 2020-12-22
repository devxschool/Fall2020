package string_methods;

public class StringCreation {

    public static void main(String[] args) {

        String name = "John Doe";
        String carType = "4Dr";

        //redundant -> not needed
        String name1 = new String("Elon Musk");
        String carType2 = new String("2dr");

        System.out.println(name);
        System.out.println(carType);
        System.out.println(name1);
        System.out.println(carType2);


        //two ways for concatenating(add two Strings together)
        String message = name + " drives " +  carType + " car";

        System.out.println(message);

        String elonMuskMessage = name1 + " drives " + carType2 + " car";
        System.out.println(elonMuskMessage);

        int num  = 10;

        String str = 10 + num + name;//20JohnDoe
        String str2 = name + 10 + num;//JohnDoe1010
        String str3 = name + (10 + num);//JohnDoe20

        System.out.println(str);
        System.out.println(str2);


        //no other class but String can initialized with literals.

        //how to call String methods?
        String strHello = new String("Hello");
//        String strHello = "Hello";

        //concat add to the end of the String.
        String result = strHello.concat(" World");
        System.out.println(result);

        //let's add 2021 to Hello World -> Hello World 2021
        String newYear = result.concat(" 2021");
        System.out.println(newYear);

        int year = 2021;
        //(String) -> #1 rule of casting that both data types must be of same type.
        String newYear1 = result.concat(" " + year);
        System.out.println(newYear1);


        //compound operators are also allowed
        //update the original value of result
        result +=  " 2021";//result = result + 2021;
        System.out.println(result);
        //static or instance method?
        //is instance
    }
}
