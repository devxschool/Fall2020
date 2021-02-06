package arithmetic_operators;

public class AssignmentOperators {

    public static void main(String[] args) {

        //assignment operators
        String str = "Hello World";
        System.out.println(str);

        str = "Hello Mars";
        System.out.println(str);

        //compound assignment operators can only be used with numbers
        //only += can be used with String

        int carMileage = 1000;
        int milesUntilHome = 50;
        int milesFromHomeToFriends = 28;

        carMileage = carMileage + milesUntilHome;
        //carMileage+=milesUntilHome;
        System.out.println("Mileage when got home from dealership " + carMileage);

        carMileage = carMileage + milesFromHomeToFriends;
        //carMileage+=milesFromHomeToFriends;
        System.out.println("Mileage when got to friends place " + carMileage);


//        int finalMileage = carMileage + milesUntilHome;
//        System.out.println("car mileage " + finalMileage);
//
//        int milesUntilFriends = 28;
//
//        int mileageWhenShowingToFriends = finalMileage + milesUntilFriends;
//
//        System.out.println("Mileage when showing to friends " + mileageWhenShowingToFriends);
//
//        int finalMileageAfterShowFriends = milesUntilFriends + mileageWhenShowingToFriends;
//
//        System.out.println("Finally home let me check what's the mileage " + finalMileageAfterShowFriends);



        //given that salary grows 3% per year
        //find me what will be my salary after 5 years.
        int currentYear = 2020;
        int periodOfYears = 2;
        double currentYearSalary = 100_000.00; //(we can separate number with _ for readability purposes.)

        double salaryIncrease = 1.03; //
        //(salary * 0.03) + 100_000
        //100_000 * 1.03

        currentYearSalary*=salaryIncrease;
        currentYearSalary*=salaryIncrease;
        currentYearSalary*=salaryIncrease;
        currentYearSalary*=salaryIncrease;
        System.out.println(currentYearSalary);
    }
}
