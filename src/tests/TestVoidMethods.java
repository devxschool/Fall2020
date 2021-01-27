//package tests;
//
//import methods.junit.ClassesToTest;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestVoidMethods {
//
//
//    @Test
//    public void voidTest() {
//
//        List<Integer> nums = new ArrayList<>();
//        nums.add(12);
//        nums.add(34);
//        nums.add(45);
//        nums.add(6);
//
//        ClassesToTest.list(nums, 12);
//
//        List<Integer> expected = new ArrayList<>();
//        expected.add(6);
//        expected.add(34);
//        expected.add(45);
//        expected.add(12);
//
//
//        Assert.assertEquals(expected, nums);
//    }
//}
