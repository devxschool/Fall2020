//package tests;
//
//import org.junit.*;
//
//public class JunitDemo {
//
//    @BeforeClass
//    public static void beforeClassHook(){
//        System.out.println("Before Class");
//    }
//
//
//    @Before//it doesnt matter if @Before is written under the tests or after tests in the middle
//    //of the tests.
//    //But best practice is to put it in front of all tests.
//    public void beforeHook(){
//        System.out.println("Before Method");
//    }
//
//    //@Test
//    public void test1(){
//        System.out.println("Test 1");
//    }
//
//    @Ignore
//    @Test
//    public void test2() {
//        System.out.println("Test 2");
//        Assert.fail();
//    }
//
//    @Test
//    public void test3(){
//        System.out.println("Test 3");
//    }
//
//
//    //you are telling the test to pass within one sec
//    //otherwise I will report you as failed.
//    @Test(timeout = 1000)
//    public void test4() throws InterruptedException {
//        //this is a code to make your program just freeze for given time
//        Thread.sleep(2000);
//        System.out.println("Logged");
//    }
//
//    @After
//    public void afterHook() {
//        System.out.println("After Method");
//    }
//
//    @AfterClass
//    public static void afterClassHook() {
//        System.out.println("Run once after all tests");
//    }
//}
