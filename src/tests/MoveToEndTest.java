package tests;

import lists.MoveToEnd;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MoveToEndTest {
    // check if one targeted value was moved to the end in an unsorted arraylist
    // we don't want to change the order of the whole array,
    // but we want to swap only the targeted value and the value at the end of the
    // list in this case.
    // @Test annotation works only with methods, so it'll complain if you don't
    // put a method underneath it.
    @Test
    public void oneValueWasMovedToEndTest() {
        // All tests will have three sections:
        // 1. setup (precondition -- for the execution);
        // I have sth to execute, but b4 doing that, I need sth to
        // 2. execution;
        // 3. validation;
        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(99);
        nums.add(88);
        nums.add(50);
        nums.add(-100);
        nums.add(10);
        // 99, 88, 50, -100, 10 -> given
        // 99, 10, 50, -100, 88 -> expected
        int target = 88;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        // EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        // VALIDATION -> make sure that actual result meets the expected result
        List<Integer> expected = new ArrayList<>();
        expected.add(99);
        expected.add(10);
        expected.add(50);
        expected.add(-100);
        expected.add(88);
        Assert.assertEquals(expected, actual);
    }

    //target value = 10
    //[10, 947,54,10]
    //expected - [54, 947,10,10]

    @Test
    public void matchAtTheEndTest() {
        // All tests will have three sections:
        // 1. setup (precondition -- for the execution);
        // I have sth to execute, but b4 doing that, I need sth to
        // 2. execution;
        // 3. validation;
        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(947);
        nums.add(54);
        nums.add(10);

        int target = 10;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        // EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        // VALIDATION -> make sure that actual result meets the expected result
        List<Integer> expected = new ArrayList<>();
        expected.add(54);
        expected.add(947);
        expected.add(10);
        expected.add(10);
        Assert.assertEquals(expected, actual);
    }

    //10
    @Test
    public void oneElementListTargetThatValueTest() {
        // All tests will have three sections:
        // 1. setup (precondition -- for the execution);
        // I have sth to execute, but b4 doing that, I need sth to
        // 2. execution;
        // 3. validation;
        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);

        int target = 10;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        // EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        // VALIDATION -> make sure that actual result meets the expected result
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        Assert.assertEquals(expected, actual);
    }


    //10
    @Test
    public void oneElementWithWrongTarget() {
        // All tests will have three sections:
        // 1. setup (precondition -- for the execution);
        // I have sth to execute, but b4 doing that, I need sth to
        // 2. execution;
        // 3. validation;
        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);

        int target = 0;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        // EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        // VALIDATION -> make sure that actual result meets the expected result
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void wrongTargetTest() {
        // All tests will have three sections:
        // 1. setup (precondition -- for the execution);
        // I have sth to execute, but b4 doing that, I need sth to
        // 2. execution;
        // 3. validation;
        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(947);
        nums.add(54);
        nums.add(10);

        int target = -44;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        // EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        // VALIDATION -> make sure that actual result meets the expected result
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(947);
        expected.add(54);
        expected.add(10);
        Assert.assertEquals(expected, actual);
    }
}