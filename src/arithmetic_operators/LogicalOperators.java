package arithmetic_operators;

public class LogicalOperators {

    public static void main(String[] args) {
        // || -> conditional OR
        // use cases:
        // SleepIN;
        //you can sleep if it's Saturday or Sunday;

        String today = "Sunday";
        String weekend1 = "Saturday";
        String weekend2  = "Sunday";

        boolean canSleep = today == weekend1 | today == weekend2; //|
        System.out.println("Can I sleep? " + canSleep);


        //Grocery Store
        //you want give a discount to people who are seniors(60) or who spend 100
        int age = 80;
        double spending = 90.00;

        boolean discount = age >= 60 || spending >= 100;

        System.out.println("Should we give discount? " + discount);

        //let insurance company
        //you want to provide insurance to people who are older than 18 and not older than 70

        int clientAge = 20;


    }
}
