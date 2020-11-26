package arithmetic_operators;

//> can be used with numbers only
public class GreaterLessThan {
    public static void main(String[] args) {
        int requirement = 690;
        int clientCreditScore = 800;

        System.out.println("Should this client get approved? " );
        System.out.println(clientCreditScore > requirement);

        double priceForGasINShell = 1.99;
        double priceInMyGasStation = 1.99;

        //
        boolean shouldIBuyInShell = priceInMyGasStation > priceForGasINShell;
        System.out.println(shouldIBuyInShell);

        double a = 1.09;
        double b =1.09;

        boolean result = a > b;//false




        double myGpa = 3.4;
        boolean admitted = myGpa >= 3.3;//is 3.3 <= 3.3

        System.out.println(admitted);//true




        //< it will return true if left side of < is less than right side
        //only works with number

//        String str = "A";
//        String str1 = "B";
//        boolean r = str > str1;

        int yearOfBirth = 1990;
        boolean isMillenial = yearOfBirth < 2000;

        System.out.println(isMillenial);

        //answer if bank should process this transaction.
        //if balance is larger than transaction amount
        //want to allow -20

        double myCurrentBalance = 100.99;
        double priceForTickets = 120.99;


        boolean allowTransaction = (myCurrentBalance-priceForTickets) >= -20;
        System.out.println("should transaction be allowed? " + allowTransaction);


        int clientAge = 21;

        boolean sellAlcohol = clientAge > 20;



    }
}
