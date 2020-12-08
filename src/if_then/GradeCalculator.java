package if_then;

public class GradeCalculator {

    public static void main(String[] args) {


        //Tell user their grade
        //user needs input score
        //program should return A,B,C,D,F

        //100- 90 -> A
        //89-> 80 ->B
        //79-> 70 -> C
        //69-> 60 ->D
        //59 -> 0 -> F
        //for all other inputs
        //print out an error message
        //Wrong Input, please input a score between 0-100

        //Math.abs(-20);//positive -> 20

        int score = 90;
        char message = ' ';// "" -> empty String
        //commonly used for temp init(initialization)

        //code maintainability -> is an extremely important
        //practice of good code.
        //your code should be easy to maintain
        if (score > 89 && score < 101) {
            message = 'A';
        }
        else if(score > 79 && score < 90) {
            message = 'B';
        }
        else if(score > 69 && score < 80) {
            message = 'C';
        }
        else if(score > 59 && score < 70) {
            message = 'D';
        }
        else if(score > 0 && score < 60) {
            message = 'F';
        }
        else {
            System.err.println("Wrong Input, Please enter a score between 0-100");
        }


        //You are able to use only one print out for all
        //only if all conditions should print the same message except the variable.
        System.out.println("Your Score for th exam: " + message);
    }

}
