package data_types;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        //variables are some data type information name.
        //every piece of info will have a name(variable)
        //and every variable must have a data type.
        //what is the data type of this variable?

        //creating variables is called variable declaration
        //ex: declare a variable with int data type.
        //variable names have naming convention as well.
        //everything is the same as for class naming convention
        //except the first letter will start from a lowerCase.

        //examples of declaring variables.
        //1 Plain declaration first
        byte numberLikes;
        int numberOfComments;
        double price;
        char gender;
        long numberOfViews;
        float shoeSize;

        //initialization separate
        numberLikes = 120;
        numberOfComments = 20;

        //byte numberLikes = 120; //=> cannot do bc numberLikes variable name has already been used.


        System.out.println(numberLikes);
        System.out.println(numberOfComments);

        //2 declaration + initialization(assigning a value to a variable for the first time)
        byte elonMuskAge = 52;
        short mObamaAge = 50;
        int johnDoeAge = 28;
        double liters = 1.5;

        System.out.println(elonMuskAge);
        System.out.println(mObamaAge);
        System.out.println(liters);


        //3 declare multiple variables with same data type in one line
        int miles = 12, temp, weight, height = 6;
//        int miles;
//        int temp;
//        int weight;

        temp = 45;
        weight = 175;
    }
}
