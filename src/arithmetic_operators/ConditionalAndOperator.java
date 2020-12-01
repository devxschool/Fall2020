package arithmetic_operators;

public class ConditionalAndOperator {

    public static void main(String[] args) {

        //you checking for some one's age
        //we can only have age between 0 and 100;

        int age = 111;

        boolean isValidAge = age >= 0 && age <= 100;
        System.out.println(isValidAge);


        //password entry
        //
        String usernameSavedInDB = "JohnDoe";
        String userPasswordSavedInDB = "ExtraHard";

        String usernameEntered = "Doe";
        String userPasswordEntered = "extraHard";

        boolean allowToLogin
                = usernameSavedInDB == usernameEntered && userPasswordSavedInDB == userPasswordEntered;

        System.out.println("user name in DB: " + usernameSavedInDB);
        System.out.println("user name Entered: " + usernameEntered);

        System.out.println("user password in DB: " + userPasswordSavedInDB);
        System.out.println("user password Entered: " + userPasswordEntered);
        System.out.println("Login sucess? " + allowToLogin);


        // || conditional OR -- && -- Conditional And


        int i = 0;

        int x = 1;

        boolean result = i < x | x++ > i;

        System.out.println(x);
        System.out.println(result);

        int a = 0;
        int y = 1;

        boolean result1 = a > y & a++ < y;

        System.out.println(a);
        System.out.println(result1);
    }
}
