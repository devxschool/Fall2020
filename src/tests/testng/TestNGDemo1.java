package tests.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGDemo1 {
   public final static String ACCOUNT = "account";
    //Same as in JUNIT TestNG supports ignoring tests
    // if the devs are still working on fixing or adding a feature.

    @Ignore
    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    //using annotation attributes.
    @Test(enabled = false)
    public void test3(){
        System.out.println("Test 3");
    }

    @Test(groups = {ACCOUNT})
    public void test4(){
        System.out.println("Login Functionality");
    }


}
