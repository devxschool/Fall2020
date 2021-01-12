####https://mvnrepository.com/ - to find all java libaries


###Junit - 

1. Java unit testing -> Junit is an open source java library that helps executing unit tests in automated way. 

###open source -> means free to use

java library -> means some java program(classes and methods) that we can use to achive some tasks. So some company(guys) developed a program that solves a problem so we just reuse their solutions.

right now all we have to do is to learn how to use programs that someone has created. 

###ex of libraries: 
JDK libraries -> Scanner, System, Random, Math, String, StringBuilder.

external libraries -> Junit, TestNG, Cucumber, Selenium, JDBC, RestAssured, Jackson, Hamcrest

###.jar -> is the final artifact of a java program.
external libraries are not included into our program, so we have to dowload .jar(java architype) file and import it to our java project. 

some .jar files(libraries) will have a dependency on other .jar files(libraries).

java is super cool in that it you can create programs for users to use. or you can create programs for other developer to use.


###dependency -> dependent on, can not work without some other jar file. 

what is a method?
- is a block of a code which runs only when we call it? 
- we use methods in order to avoid repetition of the same logic in the code. you use the logic everywhere you need it. if there is a change in the logic then you  only need to change it in one place. That gives you great code maintainability.


###Unit test -> is a test of a java method.  this is done by developer of an application. 

Unit test is the first test in the whole hierachy of tests. 
Unit test is a first level of test automation. Devs will need a way to always test their methods. 

Junit helps getting result of method, and craeting report. it helps executing multiple(1000 tests) at once. 


###Steps to Import jar files

1. Download jar file
2. open intelliJ -> File
3. Project Structure
4. Choose Libraries on the left panel
5. Hit + sign
6. Choose java
7. Find .jar file click
8. And Ok.



####Project zipping.
external libraries are not included into zip file.
When you zip your project and send it to someone else
That someone else will have to import jar files again.

####Junit Test Definition(Initialization) Error
   When you have junit test running exceptions
   it means that the test didnt even run.
   initialize -> init() -> start.
   having one test defined incorrectly will block any of the tests
   to run Every application in world has startup process(check)
   before it fully starts it has to go through multiple checks.
   like check if the application has access to DB.
   check if the has internet connection.
   same thing with Junit. Before it runs any tests it will 
   check if all tests are defined properly.


###Before Annotation
Before annotation is a public void method. Which runs once before
every single test. When you have some common precondition steps
for every test in the same class you can put @before so that 
you dont have to repeat the same steps for many tests.

Before and After annotations are also knows as hooks.

###After Annotation
After annotation is a public void method. Which runs once after
every single test. When you have some common tear up(cleanup) steps
for every test in the same class you can put @after so that 
you dont have to repeat the same steps for many tests.

After is guaranteed to run whether the test it's running after
passes or fails.


###BeforeClass Annotation
Before class annotation will be run only once before all tests. 
Only once per one class. BeforeClass will run first before 
@before annotation. 
@BeforeClass method must be static.

ex: Open Browser. Since you dont have to spend time for 
opening and closing the browser. Bc Browsers are released versions
from big companies like Google, Apple so you can trust them.

AfterClass will also run only once after all tests. 

###Assert
Assertions are the validating part of a test. 

In Junit there are multiple assertion options and every single assertion has a parameter that takes a custom error message

Testing good practices:
1. In my framework I always put custom error messages on my assertions in order to be able identify the point 
of failure from the first glance, which helps me find the root cause of a test failure quicker.

2. Every test case must be independent of each other -  if an SDET or QA or Dev designs a test which depends on the 
result of a previous test, it will cause the new test to fail just because the first test failed. In such scenarios
which are extremely common, our framework will be producing false reports about tests.

3. 



1. Assert.fail() -> when this method is called test will fail
with AssertionException.
   Assert.fail(String msg) -> we can pass a custom message

2.
  a. int,short,byte,long - Assert.assertEquals(String msg, int expectedResult, int actualResult);
  b. double, float - Assert.assertEquals(String msg, double expectedResult, double actualResult, double delta);
     delta is decimal difference between expected and actual results you want to allow for your test.

  c. String -> Assert.assertEquals(String msg, String expected, String actual);
  
  d. assertNull -> you pass an object(non-primitive) to assertNull(Strin msg, Object obj);
  e. assertNotNull -> you pass an object(non-primitive) to assertNotNull(Strin msg, Object obj); and it will return
  true if the object is not null.
  f. assertTrue -> assertTrue(String msg, boolean actual) -> if actual result is true then test passes
  g. assertFalse -> assertFalse(String msg, boolean actual) -> if actual result is false then test passes




