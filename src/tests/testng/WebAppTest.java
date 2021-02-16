package tests.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebAppTest {

    @Test(groups = "smoke")
    //provide the key of the parameter from xml file
    //when running the test directly from the java class you can not use parameters, bc the xml file contains the
    //parameter key and value thus needs to be loaded.
    //If you still want to run the test with params directly from a java class
    //you can use @Optional annotation
    @Parameters({"browser","env"})
    public void test1(@Optional String browser, @Optional String env) {
        System.out.println("Testing amazon.com login on " + browser);
        System.out.println("Testing amazon.com login on " + env);
    }


    @Test
    public void test2(){
        System.out.println("Testing amazon.com search on Chrome");
    }


    @Test
    public void test3(){
        System.out.println("Testing amazon.com add to cart on Chrome");
    }
}
