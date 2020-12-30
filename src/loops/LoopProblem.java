package loops;

import java.util.Scanner;

public class LoopProblem {

    /**
     * development side should be easily maintainable
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter exam score 1");
        int score = 0;
        score += sc.nextInt();
        if (score < 0 || score > 100) {
            System.exit(1);
        }
        System.out.println("Enter exam score 2");
        score += sc.nextInt();
        if (score < 0 || score > 100) {
            System.exit(1);
        }
        System.out.println("Enter exam score 3");
        score += sc.nextInt();
        if (score < 0 || score > 100) {
            System.exit(1);
        }
        System.out.println("Enter exam score 4");
        score += sc.nextInt();
        if (score < 0 || score > 100) {
            System.exit(1);
        }
        System.out.println("Enter exam score 5");
        score += sc.nextInt();
        System.out.println(score / 5);
    }
}
