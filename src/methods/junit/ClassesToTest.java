package methods.junit;

public class ClassesToTest {

    /**
     * Years of service under 5 get 5% of their salary as an annual bonus;
     */
    public static double calculateBonus(int yearsOfService, double salary) {
        if (yearsOfService < 5) {
            return salary * 5 / 100;
        } else if (yearsOfService == 7) {
            return salary;
        } else {
            return salary * 10 / 95;
        }
    }
}
