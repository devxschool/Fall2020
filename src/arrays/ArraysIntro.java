package arrays;

public class ArraysIntro {

    public static void main(String[] args) {
        //As a representative of an education department
        //I would like get the ages of every student.

        int student1 = 20;
        int student2 = 31;
        int student3 = 44;
        int student4 = 19;
        int student5 = 50;
        int student6 = 38;
        int student7 = 35;
        int student8 = 18;
        int student9 = 22;
        int student10 = 31;


        int avr = (student1 + student2
                + student3 + student4
                + student5 + student6
                + student7 + student8
                + student9 + student10) / 10;

        System.out.println(avr);


        //naming convention for arrays are camelCase plural.
        //the size -> 10

        // value inside a []-> is an index of an array.
        int[] studentAges = new int[10];
        studentAges[0] = 20;
        System.out.println(studentAges[0]);
        studentAges[1] = 31;
        System.out.println(studentAges[1]);
        studentAges[2] = 44;
        studentAges[3] = 19;
        studentAges[4] = 50;
        studentAges[5] = 38;
        studentAges[6] = 35;
        studentAges[7] = 18;
        studentAges[8] = 22;
        studentAges[9] = 31;
        //once you store your values in an array you are
        //able access and use them in any way you want.
        int average = (studentAges[0] + studentAges[1]
                + studentAges[2] + studentAges[3]
                + studentAges[4] + studentAges[5]
                + studentAges[6] + studentAges[7]
                + studentAges[8] + studentAges[9]) / 10;
        System.out.println(average);

        int indexOfFirstStudent = 0;

        //it's allowed to use int variable to access array values at given
        //index
        System.out.println(studentAges[indexOfFirstStudent]);

        //find the minimum and max ages of the students.
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += studentAges[i];
        }

        System.out.println(sum / 10);

        //what is the size of studentAges array?

        //race -> Asian, Latino, White, Black.
        //every index contains an element.
        String[] studentRaces = new String[11];
        studentRaces[0] = "Asian";
        studentRaces[1] = "White";
        studentRaces[2] = "Black";
        studentRaces[3] = "Latino";
        studentRaces[4] = "Latino";
        studentRaces[5] = "Latino";
        studentRaces[6] = "Black";
        studentRaces[7] = "White";
        studentRaces[8] = "Latino";
        studentRaces[9] = "White";
        studentRaces[10] = "Latino";


        //arr
        //When you use the array variable and index
        //it will always give you the data Of Array elements.
        //studentRaces[8] => you treat this variable(element)
        //as any other String.
        //studentRaces[8].contains("a") you can call any String method
        //bc studentRaces is a String array.

        //
//        System.out.println(studentRaces[3]);
//        if (studentRaces[3].equals("Latino"))

        //find how many Latino students we have?

        //we created this loop to check each String value in an array
        for (int i = 0; i < 10; i++) {
            System.out.println(studentRaces[i]);
        }

        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (studentRaces[i].equals("Latino")) {
                System.out.println(studentRaces[i]);
            }
        }

        System.out.println();

        int counter = 0;
        //count each race and print how many students of each race do we have
        for (int i = 0; i < studentRaces.length; i++) {
            if (studentRaces[i].equals("Latino")) {
                counter++;
            }
        }

        System.out.println("there are " + counter + " Latinos");

        //there are 3 latinos
        String race = "Latino";

        if (race.equals("Latino")) {

        }

        //Create an array for Ethnicity of 10.
        //give any Ethnicity you like
        //and calculate each ethnicity.
        //Ethnicity

        //
        //gender

        char[] genders = new char[9];
        genders[0] = 'F';
        genders[1] = 'M';
        genders[2] = 'F';
        genders[3] = 'M';
        genders[4] = 'F';
        genders[5] = 'F';
        genders[6] = 'M';
        genders[7] = 'M';
        genders[8] = 'F';


        int countMale = 0;
        for (int i = 0; i < 9; i++) {
            if (genders[i] == 'M' || genders[i] == 'm') {
                countMale++;
            }
        }

        System.out.println("There are " + countMale + " Males");

        System.out.println(genders[0]);
        System.out.println(genders[1]);
        System.out.println(genders[2]);
        System.out.println(genders[3]);
        System.out.println(genders[4]);
        System.out.println(genders[5]);
        System.out.println(genders[6]);
        System.out.println(genders[7]);
        System.out.println(genders[8]);


        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.println(genders[i]);
        }



        //we must store only one type of information either all ages or all weights.
        int[] agesAndWeights = new int[5];
        agesAndWeights[0] = 65;//index 0 has weight
        agesAndWeights[1] = 55;//index 1 has ages


        //Election Results
        String[] results = new String[3];
        results[0] = "D.T";
        results[1] = "J.B";
        //   results[3] = "J.B";//throw ArrayIndexOutOfBound Exception.

        System.out.println(results[2]);
        results[2]+="a";
        System.out.println(results[2]);
    }
}
