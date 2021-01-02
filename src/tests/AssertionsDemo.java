package tests;

import methods.junit.ClassesToTest;
import org.junit.Assert;
import org.junit.Test;

public class AssertionsDemo {

    //We dont test applications, but we test functionalities.
    //Moreover we test specific scenarios of functionalities.
    //each test(case) must be named per scenario.
    //Naming convention is that you add Test Suffix to all
    //test names.
    //BonusUnder5yearsServiceTest
    //bonusTest();

    //Assert.fail() -> will make the test fail.
    @Test
    public void bonusUnder5YearsServiceTest() {
        double bonus = ClassesToTest.calculateBonus(2,100000);
        System.out.println(bonus);
        //5000 here is an expected value that comes from the
        //calculation based on requirements.
        if(bonus != 5000) {
            Assert.fail();
        }
    }


    //if the tests dont have any fail statements it will just pass.
    @Test
    public void bonus6yearsServiceTest(){
        double bonus = ClassesToTest.calculateBonus(6,100000);
        if(bonus != 10000) {
            Assert.fail();
        }
    }


    //if the tests dont have any fail statements it will just pass.
    @Test
    public void bonusAbove5yearsServiceTest(){
        double bonus = ClassesToTest.calculateBonus(6,100000);
        if(bonus != 10000) {
            Assert.fail();
        }

        double bonus3 = ClassesToTest.calculateBonus(8,100000);
        if(bonus3 != 10000) {
            Assert.fail();
        }
    }


    //We are able report 7 years service failure extremely quick.
    @Test
    public void bonus7yearsServiceTest(){
        double bonus = ClassesToTest.calculateBonus(7,100000);
        if(bonus != 10000) {
            Assert.fail();
        }
    }


    @Test
    public void bonusTest10Years() {
        double bonus = ClassesToTest.calculateBonus(10,100000);
        //first value is expected value -> requirement
        //second value is actual value  -> comes from the application
        //for double only you need to put delta -> which means decimal point precision.
        //9999.7
        Assert.assertEquals(10000, bonus,0.0);
    }

}
