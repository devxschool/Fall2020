package tests.testng;

import methods.testclasses.AppStore;
import methods.testclasses.ClassesToTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CalculateBonusTest {


    @BeforeMethod// same as @Before
    public static void setUp(){
        System.out.println("Before Class");
        AppStore.store.put("Ipad", 10);
        AppStore.store.put("Iphone",5);
        AppStore.store.put("AppleWatch", 2);
    }

//    @BeforeTest// same as @Before
//    public void beforeHook(){
//        System.out.println("User goes to home page");
//    }

    @Test //one @Test is one test case
    public void testBonus() {
        double actualBonus = ClassesToTest.calculateBonus(10,100_000);
        //
        Assert.assertEquals(actualBonus,11000,"10 years bonus failure");
    }


    @Test
    public void testBuyPossitive(){
        AppStore.buy("Ipad", 2);
        AppStore.buy("AppleWatch",1);

        Map<String, Integer> expectedStore = new HashMap<>();
        expectedStore.put("Ipad", 8);
        expectedStore.put("Iphone", 5);
        expectedStore.put("AppleWatch", 1);

        Assert.assertEquals(AppStore.store, expectedStore, "Buy Ipad and AppleWatch Failure");
    }

    @Test //what do you do if one test from regression fails?
    public void testBuy2() {
        AppStore.buy("Ipad", 7);
        AppStore.buy("AppleWatch",1);
        AppStore.buy("Iphone",3);

        Map<String, Integer> expectedStore = new HashMap<>();
        expectedStore.put("Ipad", 3);
        expectedStore.put("Iphone", 2);
        expectedStore.put("AppleWatch", 1);

        Assert.assertEquals(AppStore.store, expectedStore, "Buy Ipad and AppleWatch Failure 2");
    }
}
