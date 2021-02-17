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
        return new Object[][]{
                //valid user name and valid password
                {"JohnDoe@test.com", "hardPass", 123, true},
                //valid user name but wrong password
                {"devx", "chicago123", 34, false},
                //wrong username and wrong password
                {"1234", "123", 45, false},
                //valid username and caseInsensitive password
                {"JohnDoe@test.com", "hardpass", 44, false}
        };
    }


    @DataProvider(name="accountTestData")
    public static Object[][] accountData(){
        return new Object[][]{
                {"Alex Pato", "123 main st", "312-730-2097", 19},
                {"Jane Doe", "122343 main st", "112-730-2097", 11}
//                {"Alex Pato", "123 main st", "312-730-2097", 19},
//                {"Alex Pato", "123 main st", "312-730-2097", 19},
        };
    }


    //login functionality
    //account
    //pass
    @Test(dataProvider = "prerequisiteData")
    //param data types should be able to take the values from inner arrays in the same order
    public void test1(String userName, String password, Integer id, Boolean result) {
        System.out.println("Testing user " + userName);
        System.out.println("Testing pass " + password);
        System.out.println("Logged in " + result);
        System.out.println(id);
    }



    @Test(dataProvider = "prerequisiteData")
    public void test2(String userName, String password, Integer id, Boolean result) {
        System.out.println("2 Testing user " + userName);
        System.out.println("2 Testing pass " + password);
        System.out.println("2 Logged in " + result);
        System.out.println(id);

    }



//    @Test
//    public void test2() {
//        System.out.println("Testing user " + "JohnDoe@test.com");
//        System.out.println("Testing pass " + "hardPass");
//        System.out.println("Logged in " + true);
//    }
//
//
//    @Test
//    public void test3() {
//        System.out.println("Testing user " + "devx");
//        System.out.println("Testing pass " + "chicago123");
//        System.out.println("Logged in " + false);
//    }
//
//    @Test
//    public void test4() {
//        System.out.println("Testing user " + "1234");
//        System.out.println("Testing pass " + "123");
//        System.out.println("Logged in " + false);
//    }


}
