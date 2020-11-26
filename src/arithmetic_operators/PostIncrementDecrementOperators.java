package arithmetic_operators;

public class PostIncrementDecrementOperators {

    //increment decrement operators will update the value
    //by one. there is no limit;

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;

        num1++;//num1+=1; num1 = num1 + 1;
        num2--;//num2-=1; num2 = num2 - 1;

        System.out.println("num1++ is " + num1);
        System.out.println("num2-- is " + num2);

        num1 = 150;
        System.out.println(num1);

        //count number of people in the building
        int numberOfPeople = 0;
        numberOfPeople++;

        System.out.println(numberOfPeople);

        //post increment decrement get updated next time you are using it.

        System.out.println(numberOfPeople++);//still 1 bc it gets updated
        // not in the same place rather in the next usage of numbOfPeople
        System.out.println(numberOfPeople);//2
        System.out.println(numberOfPeople++);// still 2
        System.out.println(numberOfPeople++);//3
        System.out.println(numberOfPeople);//4

        numberOfPeople--;
        System.out.println(numberOfPeople--);//3


        //is it possible to reassign the value;

        numberOfPeople = 0;
        System.out.println(numberOfPeople);


        //Pre increment updates the value of a variable by 1 on the same line

        int y = 11;
        int x = 9;

        int a = 11;
        int b = 9;


        --y;
        ++x;
        a--;
        b++;


        System.out.println(y);
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);

        System.out.println("pre increment " + ++y);//updates right away this 11
        System.out.println("pre decrement " + --x);//updates right away thus 9
        System.out.println("post increment " + a++);//stay the same on this line 10
        System.out.println("post decrement " + b--);//stays the same on this line 10


        int number = 20;
        int number2 = number++;//20

        System.out.println(number2);
        System.out.println(number);//21

        int num3 = 1;
        int num4 = --num3;//0

        System.out.println(num4);//0



    }
}
