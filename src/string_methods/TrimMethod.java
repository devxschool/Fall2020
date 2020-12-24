package string_methods;

public class TrimMethod {

    public static void main(String[] args) {
        //you needed to check the addresses, get zip, state
        //"123 main st"

        String addressFromCustomer = "            123 main st ";

        String addressWithoutTrailingSpaces = addressFromCustomer.trim();
        System.out.println(addressWithoutTrailingSpaces);

        if (addressWithoutTrailingSpaces.equals("123 main st")) {
            System.out.println("Transaction Successful");
        }

        //what if the String doesnt have trailing spaces and we call trim()
        //nothing happens.
    }
}
