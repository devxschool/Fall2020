package tests.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
    //Number one biggest feature of TestNG that is extremely helpful in all projects.

    //Purpose of a data provider is to be able to execute same test against multiple
    //set of data
    //We use DataProvider for functionalities that require not more than 10 fields(piece of info)
    //if more than 10 we use external files like xml. Apache POI -> java library to read and write from/to XML
    @DataProvider(name = "prerequisiteData")
    public static Object[][] data() {
        return new Object[][] {
                {"JohnDoe@test.com", "hardPass", true},
                {"devx", "chicago123",false}
        };
    }



    //login functionality
    //account
    //pass
    @Test(dataProvider = "prerequisiteData")
    //param data types should be able to take the values from inner arrays in the same order
    public void test1(String userName, String password, Boolean result) {
        System.out.println("Testing user " + userName);
        System.out.println("Testing pass " + password);
        System.out.println("Logged in " + result);
    }
}
