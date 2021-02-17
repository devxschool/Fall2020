package tests.testng;

import org.testng.annotations.Test;

import static tests.testng.GroupsConstants.*;


public class TestNGGroups {

    //Let's imagine we work for chase banking
    //there are three different automation engineers each of them responsible for one functionality
    //1 -> create, update, delete account
    //2 -> send, receive, request payments
    //3 -> create, request -> statements

    //every test in your framework will have group.
    //cucumber -> tags.

    @Test(groups = {ACCOUNT, "smoke", "regression1"})
    public void test1() {
        System.out.println("Testing create account");
    }

    @Test(groups = {ACCOUNT, "regression1"})
    public void test2() {
        System.out.println("Testing update account");
    }

    @Test(groups = {ACCOUNT, "regression1"})
    public void test3() {
        System.out.println("Testing delete account");
    }

    @Test(groups = {PAYMENT, "smoke", "regression"})
    public void testPayment() {
        System.out.println("Testing send payment");
    }

    @Test(groups = {PAYMENT, "regression"})
    public void testPayment2() {
        System.out.println("Testing receive payment");
    }

    @Test(groups = {PAYMENT,"regression"})
    public void testPayment3() {
        System.out.println("Testing request payment");
    }

    @Test(groups = {STATEMENT, "smoke", "regression"})
    public void requestStatement() {
        System.out.println("Testing request statement");
    }

    @Test(groups = {STATEMENT, "regression"})
    public void createStatement() {
        System.out.println("Testing create statement");
    }
}
