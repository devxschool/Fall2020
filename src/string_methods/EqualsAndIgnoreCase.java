package string_methods;

public class EqualsAndIgnoreCase {

    public static void main(String[] args) {
        String userName = "Chime";
        String password = "HardPa$$";

        if (userName.equalsIgnoreCase("chime")) {
            if (password.equals("HardPa$$")) {
                System.out.println("Login Success");
            } else {
                System.err.println("Wrong Pass");
            }
        } else {
            System.err.println("Wrong UserName");
        }

        //FullName
        //DOB
        //SSN
        //String fullName = lookup(ssn)
        //if(fullName.equals("James Bond") {
        //   green light;
        ///
        //String lookup(String ssn){
      //
        //}



        //#5 find a method which printout the word that contains 11 characters given a tree word String then return true.
        //James 344-54-5566 Number

        //#6 you will return true only if the one of the words are in ssn format(ddd-dd-dddd);
    }
}
