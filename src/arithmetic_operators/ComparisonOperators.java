package arithmetic_operators;

public class ComparisonOperators {

    public static void main(String[] args) {
        System.out.println(10==10);//true
        System.out.println(10==-10);//false
        System.out.println(9==10);//false


        int myLotteryTicketNumber = 12345;
        int winnerLotteryTicketNumber = 12345;

        boolean didIWin = myLotteryTicketNumber==winnerLotteryTicketNumber;

        System.out.println("Did I win the lottery?");
       // System.out.println(myLotteryTicketNumber==winnerLotteryTicketNumber);
        System.out.println(didIWin);


        boolean areEqual = 10-10 == -20+20;//java will execute each side of == and compare the
        //results of each side
        System.out.println(areEqual);//true

        int a = 10;
        int b = 20;
        boolean areEqual2 = ++a == b++;//false 11 and 20 are not equal
        System.out.println(areEqual2);


        int c = 10;
        int d = 9;
        boolean areEqual3 = c++ == ++d;//true 10 == 10
        System.out.println(areEqual3);



        //in order for a String == String to return true
        //both values must be the same case sensitive
        //we can only use == and != comparison operator with Strings.
        String str = "apple";
        String str2 = "Apple";
        String str3 = "apple";
        System.out.println("line 42");
        System.out.println(str==str3);//true
        System.out.println(str == str2);//false

        //use cases: passwords, card numbers, zip, expiration.
        //lottery winner
        //test answers.


        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        //boolean -> false == false; true
        //false == true;//false
        //true == false;//false;
        //true == true;//true

        boolean result = (a1==a2)==(a3==a1);//true
        System.out.println("line 62");
        System.out.println(result);

        int clientCreditScore = 600;
        int creditScoreThreshold = 690;

        System.out.println("Should this client get approved? " );
        System.out.println(clientCreditScore==creditScoreThreshold);
    }
}
