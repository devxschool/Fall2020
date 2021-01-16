package tests;

// import the @Test Annotation.
//impo


import org.junit.Test;

public class SecondTestClass {

    //Anything that strats with "@" -> annotation.
    //Annotation are labels for classes, methods,
    //and params.
    //one test method is equivalent to one test case.
    //We cannot predict order of test execution.
    @Test
    public void thirdMethodTest(){
        //body -> work
        //we can put anything in the method.
        System.out.println("Hello World");
    }

    //we can have as many tests in one class
    //in real world projects you will have around 20 tests
    //in one class
    @Test
    public void secondMethodTest(){
        System.out.println("Test 2");
    }


    //Each test must be independent from each other.
    //It's not a Java rule.
    //If one test failed the next one should not care about the
    //result of previous test.

    //should be unique -> test method method cannot have params.
    @Test
    public void helloTest(){
        System.out.println("Hello Test method.");
    }

    @Test
    public void abc(){
        //when you are trying to access an index that is not present in the String
        String str = "Junit Test";
        int y = str.charAt(20);
        System.out.println(y);
    }

    //When you have junit test running exceptions
    //it means that the test didnt even run.
    //initialize -> init() -> start.
    //having one test defined incorrectly
    // will block any of the tests
    //to run
    //Every application in world has startup process(check)
    //before it fully starts it has to go through multiple checks.
    //like check if the application has access to DB.
    //check if the has internet connection.
    //same thing with Junit. Before it runs any tests it will
    //check if all tests are defined properly.
//    @Test
//    public int abc(){
//        int i =20;
//        int sum = i + 2;
//        System.out.println("ABC " + i);
//        return 1;
//    }

}
