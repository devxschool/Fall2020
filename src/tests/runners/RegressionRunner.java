package tests.runners;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        AssertionsDemo.class,
        FirstTest.class,
        AssertDemo2.class,
        JunitDemo.class,
        MoveToEndTest.class,
        SecondTestClass.class})
public class RegressionRunner {

    @BeforeClass
    public static void beforeAll(){
        System.out.println("Selenium open chrome");
        System.out.println("Selenium go to amazon.com");
        System.out.println("Selenium make sure my window is maximized");
    }

    @AfterClass
    public static  void tearUp(){
        System.out.println("Close the browser");
        System.out.println("Clean the mess you made");
    }
}
