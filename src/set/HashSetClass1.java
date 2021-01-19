package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetClass1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> ssn = new ArrayList<>();
        ssn.add("000-00-0000");
        ssn.add("123-33-4444");
        ssn.add("222-33-2457");
        ssn.add("988-00-6788");
        ssn.add("123-33-4444");

        System.out.println(ssn);


        Set<String> ssnUnique = new HashSet<>();
        ssnUnique.add("000-00-0000");

        boolean result = ssnUnique.add("123-33-4444");//true
        if (!result) {
            System.out.println("Warning SSN is already taken by a customer");
        }
        ssnUnique.add("222-33-2457");
        ssnUnique.add("988-00-6788");

        //Set<String> ssnUnique = new HashSet
        //String ssn = "123432";
        //int num = 43545;

        //Set doesnt complain when duplicate values
        //are added at compile time

        boolean result1 = ssnUnique.add("123-33-4444");//false
        if (!result1) {
            System.out.println("Warning SSN is already taken by a customer 2");
        }

        addSsn(ssnUnique, "222-33-2457");


        //Print out -> "This SSN already used by a different account
        //Set actually checks at runtime if the value
        //that's being added is already in the
        //collection.
        //What is a variable?
        //if statements
        //switch statements
    }

    /**
     * This method adds new SSNs.
     * if the SSN already taken we send a warning message
     * @param ssnSet
     * @param ssn
     */
    public static void addSsn(Set<String> ssnSet, String ssn) {
        boolean added = ssnSet.add(ssn);//true or false

        if(!added) {
            System.out.println("Method: SSN already used");
        }
    }


    public static void add(List<String> ssn, String str) {
        if(!ssn.contains(str)) {
            ssn.add(str);
        }
    }
}
