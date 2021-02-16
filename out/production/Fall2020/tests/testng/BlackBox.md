###Unit vs BlackBox testing.
Unit tests are white box tests -> is when tests have direct access to the appliaction code. 
which means tests can and should be designed to test methods seperately.  In ex let's imagine we have 
a project for ordering items online. This this project will have bunch of functionalities like 
register user, buy product. These functionalities will be composed of many small methods. 

isUserNameValid() -> will have it's own unit tests.
isPasswordValid() -> will have it's own unit tests.
isAddressValid()  -> will have it's own unit tests
isEmailValid()    -> will have it's own unit tests.


Buy Product Functionality
isProductInStock() -> will have it's own unit tests.
isAddressSupported() -> will have it's own unit tests.
isCardValid() -> will have it's own unit tests.



Black box tests are tests that test the ready application from end user's perspective.
test overall project functionalities rather than small methods. 



Junit vs TestNG.
Junit is a great test framework when used just by itself to perform unit tests. However
it becomes weak to create black box(Acceptance Test Framework) test automation framework.
why? Because Ideal Acceptance Test framework should be able to run against different test data.

So TestNG is a testing tool that can be used for both Unit tests and Acceptance Test Framework by itself. 
TestNG was inspired by Junit and it stands for Next Generation. It has been the most popular tool in the market for 
some quite time.

TestNG offer everyting Junit offers plus extra feature like DataProvider, Parameterization, Extra Annotations.
 
Tests should never depend from each other. Which a certain should not fail just because previous test failed or previous
test was not run. Result of each test must be the same when you run it in a group(regression, smoke) as well as
when you run it indivudually.


##TestNG - XML
TestNG -XML file is used to execute tests. 