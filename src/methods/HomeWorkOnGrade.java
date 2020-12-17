package methods;

public class HomeWorkOnGrade {

    public static void main(String[] args) {
        //print out A.
        //how do you print out stuff in java? -> System.out.println();
        //it should return 'L' -> result of a method.

        char var = grade(-100);
        char var1 = grade(80);
        System.out.println(var);
        System.out.println(var1);
    }

    //it's public static
    //has a return type of char -> which means method needs to return a char value
    //it has one int param.
    public static char grade(int exam) {
        //why String can be initialized as empty String -> "";
        //vs char can not be a an empty char

        char grade = ' ';

        if (exam <= 100 && exam >= 90) {
            //Grade A
            grade = 'A';
        } else if (exam < 90 && exam >= 80) {
            //Grade B
            grade = 'B';
        } else if (exam < 80 && exam >= 70) {
            //Grade C
            grade = 'C';
        } else if (exam < 70 && exam >= 60) {
            //Grade D
            grade = 'D';
        } else if (exam < 60 && exam > 0) {
            //Grade F
            grade = 'F';
        } else {
            //Error
            //How do I return an error if the return type is char?
            //system.err.println()
            System.err.println(exam + " is not within the range of 0-100 acceptable for exam score");
            System.err.println("Please try again");
            return 'X';
            //then return a value agreed between your team which will specify an error.
            //ex: return 'X', return ' '
            //or you might want to terminate the program entirely.

            //command to quit the program is System.exit(1);
            //System.exit(1); //stop the whole program
        }

        return grade; //=> result goes to where the method is being called(used).
        //when you have literals after return the method's result will always
        //be that literal in this example 'L';

        //when java runs return statement the method execution will end at that point.
        //think of return statement as end of sentence(method)

        //System.out.println("Hello");=> unreachable statement bc it's below return statement.
    }

    public static char getGrade(int examScore) {
        char grade = ' ';

        if (examScore <= 100 && examScore >= 90) {
            //Grade A
            return 'A';
        } else if (examScore < 90 && examScore >= 80) {
            //Grade B
            return 'B';
        } else if (examScore < 80 && examScore >= 70) {
            //Grade C
            return 'C';
        } else if (examScore < 70 && examScore >= 60) {
            //Grade D
            return 'D';
        } else if (examScore < 60 && examScore > 0) {
            //Grade F
            return 'F';
        } else {
            return 'X';
        }
        //return 'L';//this return is guaranteed not to run at all.
    }



}
