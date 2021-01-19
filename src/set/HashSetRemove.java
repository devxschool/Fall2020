package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetRemove {

    public static void main(String[] args) {
        Set<String> ssn = new HashSet<>();
        ssn.add("000-00-0000");
        ssn.add("123-33-4444");
        ssn.add("222-33-2457");
        ssn.add("988-00-6788");
        ssn.add("123-33-4444");

        System.out.println(ssn);
        System.out.println(ssn.size());
        if (ssn.remove("000-00-0000")) {
            System.out.println("removed invalid ssn");
        }
        System.out.println(ssn);
        System.out.println(ssn.size());

        if (ssn.isEmpty()) {
            System.out.println("Not Empty");
        }

        if (ssn.contains("222-33-2457")) {
            System.out.println("We have Elon Musks" +
                    " SSN");
        }
        ssn.clear();//clears all elements
        System.out.println(ssn);


        ssn.add("000-00-0000");
        ssn.add("123-33-4444");
        ssn.add("222-33-2457");
        ssn.add("988-f0-6788");
        ssn.add("123-33-4444");
        System.out.println("+++++++++++");
        System.out.println(ssn);





        List<String> ssnList = new ArrayList<>();
        ssnList.add("000-00-0000");
        ssnList.add("123-33-4444");
        ssnList.add("222-a3-2457");
        ssnList.add("988-00-6788");
        ssnList.add("123-33-4444");

        //print out all of the values in a List?
        for (int i = 0; i < ssnList.size(); i++) {
            if (!checkFormat(ssnList.get(i))) {
                System.out.println(ssnList.get(i) + " has an invalid format");
            }
        }

        //Use for each loop only if you have to go though every single element in the collection
        //use regular for loop if you have to jump through some elements. Or stop somewhere in the middle.
        //Also if you want to start from not the beginning.
        for (String ssnElement : ssnList) {
            if (!checkFormat(ssnElement)) {
                System.out.println(ssnElement + " has an invalid format");
            }
        }

        /**
         * Iterate through our set.
         */
        //for( a new variable with the same data type of elements in the collection  : collection variable)
        for (String s : ssn) {
            if (!checkFormat(s)) {
                System.out.println(s + " has an invalid format SET");
            }
        }
    }


    /**
     * check if the ssn format is valid
     *
     * @param socialSecurityNumber
     * @return
     */
    public static boolean checkFormat(String socialSecurityNumber) {

        boolean first3areDigits = Character.isDigit(socialSecurityNumber.charAt(0))
                &&
                Character.isDigit(socialSecurityNumber.charAt(1))
                &&
                Character.isDigit(socialSecurityNumber.charAt(2));

        boolean char4isAHiphen = socialSecurityNumber.charAt(3) == '-';
        boolean char5And6areDigits = Character.isDigit(socialSecurityNumber.charAt(4))
                &&
                Character.isDigit(socialSecurityNumber.charAt(5));

        boolean char6isAHiphen = socialSecurityNumber.charAt(6) == '-';

        boolean lastFourAreDigits = Character.isDigit(socialSecurityNumber.charAt(7))
                &&
                Character.isDigit(socialSecurityNumber.charAt(8))
                &&
                Character.isDigit(socialSecurityNumber.charAt(9))
                &&
                Character.isDigit(socialSecurityNumber.charAt(10));


        return first3areDigits && char4isAHiphen && char5And6areDigits && char6isAHiphen && lastFourAreDigits;

    }
}
