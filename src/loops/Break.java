package loops;

public class Break {

    public static void main(String[] args) {

        //break statement
        //break statement is used for ending and jumping out
        //of the loop altogether.

        //when you are looking for something and found early on
        //which means that you dont really need to keep
        //iterating. you can stop the loop using break


        //we are looking for h
        String str = "DevX School";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h') {
                System.out.println("I found it");
                break;
            }
            System.out.println("Looked at index " + i);
        }


        //find the first number from 0-100 that's evenly divisible by 13

        for (int i = 1; i <= 100; i ++) {
            if (i % 13 == 0) {
                System.out.println(i);
                break;
            }

            System.out.println("Divided " + i + " by 13");
        }

    }
}
