package if_then;


import java.util.Scanner;

public class ExamScore {
    //Write a program which will tell me if I passed the exam
    //passing score is 70
    //if the user score is more than 70 say Great! You passed the exam

    //if the user score is less than 70 say Try again! Keep working hard!
    public static void main(String[] args) {
        int score = 59;

        if(score >= 70) {
            System.out.println("Great! You passed the exam");
        }

        if(score < 70) {
            System.out.println("Try Again! Keep working hard");
        }



        //Tell me if the temperature outside is too hot
        //print out "Too Hot" if the temp is hotter than 80F
        //Turn on your AC
        //if less 30 say Freaking Cold Chicago.
        //Miami wait for me
        Scanner sc = new Scanner(System.in);

        System.out.println("What's the weather outside?");
        int temp = sc.nextInt();

        if (temp >= 80) {
            System.out.println("Temp is \"Too Hot\"");
            System.out.println("Turn on your AC");
        }

        if (temp <= 30) {  //(temp<30 || temp==30)
            System.out.println("Freaking Cold Chicago!");
            System.out.println("Miami wait for me");
        }

        if (temp < 80 && temp > 30) {
            System.out.println("Good weather outside");
            System.out.println("Lets do picnic");
        }
    }
}
