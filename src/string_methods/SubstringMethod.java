package string_methods;

public class SubstringMethod {
    public static void main(String[] args) {
        String str = "Hello";
        String result = str.substring(2);
        System.out.println(result);//llo

        String str1 = "Unites States of America";
        System.out.println(str1.substring(7));

        System.out.println(str1.substring(17));

        System.out.println(str1.substring(str1.length()-7));



        //Chase
        //"123123545" =

        //Log file => INFO account #124 is buying item "Gold";

        String item = "INFO account #124.9 is buying item Gold";

        String gold = item.substring(item.length() - 4);
        boolean isGold = gold.equals("Gold");
        System.out.println(isGold);

        String school = "DevX School";

        String str5 = school.substring(0,4);
        System.out.println(str5);

        System.out.println(school.substring(5));

        //System.out.println(school.substring(3232)); String index out
        //of bound exception.

        String number = item.substring(14,17);
        System.out.println(number);

        int num = Integer.parseInt(number);
        int i = num * 20;
        System.out.println(i);
    }
}
