package string_methods;

//String manipulation methods.
public class LastIndexOF {

    public static void main(String[] args) {

        //ERROR This is wrong credit card info - transactionId:11234557;
        //Customer email is invalid - transactionId:11234558;
        //Customer phone number is invalid - transactionId:11234559;
        //Customer Id is invalid -

        String errorMessage = "ERROR Customer Id is invalid - transactionId:4232344555";
        //pseudocode -> your solution to the task
        //need find the index of ":".
        //using the index of ":" -> get the substring starting right after :
        //note that error messages might have the : as well so use lastIndexOf method
        //just in words


        int indexOfId = errorMessage.lastIndexOf(":") + 1;

        String transactionId = errorMessage.substring(indexOfId);
        System.out.println(transactionId);

        //find first letter of the last word in String
        int lastIndexOfSpace = errorMessage.lastIndexOf(" ");
        System.out.println(errorMessage.charAt(lastIndexOfSpace+1));



        //#1 given a full US address. create a method to return zipcode.
        //#2 create a method to return STATE.
        //#3Create a method to return CITY
        //#4 cretate a method to return address line.
        //public String getAddressLine(String address);
        String fullCustomerAddress = "123 Main st apt #1, Brooklyn, NY, 23453";


    }

    //findCustomer(String transactionId){
    //}

}
