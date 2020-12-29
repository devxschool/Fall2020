package string_methods;

public class MethodChaining {

    public static void main(String[] args) {


        String str = " steve jobs ";

        //bc trim method returns a String we are allowed to use String methods again.
        //the String we are working with is the resulting(returned) String from a trim
        //method
        System.out.println(str
                .trim()
                .replace('j', 'J')
                .replaceFirst("s", "S"));


        //when you have a long method chaining you can start every method call from a new line.

        String var = "s";
        System.out.println(str
                .trim()
                .replace('j', 'J')
                .replaceFirst(var, "S"));


        //remove all trailing spaces.
        //delete one r
        //make all upperCase => "SIERRA COFFEE"
        String str2 = "  Sierrra Coffee   ";
        String result = str2
                .trim()
                .toUpperCase()
                .replaceFirst("R", "")
                .substring(7)
                .concat(" Shop");

        System.out.println(result);

//no limit on the number methods you can chain as long as the return of the last method
        //is String.

//        //
//        String result2 = str2
//                .indexOf("21")
//                .trim()
//                .toUpperCase()
//                .replaceFirst("R", "")
//
//                .concat(" Shop");
//
//
//        char c = 'C';
//        c.trim();

    }
}
