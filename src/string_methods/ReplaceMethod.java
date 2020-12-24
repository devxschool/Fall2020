package string_methods;

public class ReplaceMethod {

    public static void main(String[] args) {
        String str = "Learn Share Learn";
        String replacedStr = str.replace('e', 'E');
        System.out.println(replacedStr);

        String str1 = "123 Main St";
        System.out.println(str1.replace('1', 'P'));


        double goldPrice = 25.66;
        System.out.println("Price For Gold: " + goldPrice);
        //105.7

        String str2 = "Hello world !!!";
        String changed = str2.replace("world", "World");
        System.out.println(changed);

        System.out.println(str2.replace("world", "my beautiful World"));


        String str3 = "Hello 2020 Hell Of a World";
        System.out.println(str3.replaceFirst("ell",""));

        System.out.println(str3.replaceAll("Hell", "Hi"));


    }
}
