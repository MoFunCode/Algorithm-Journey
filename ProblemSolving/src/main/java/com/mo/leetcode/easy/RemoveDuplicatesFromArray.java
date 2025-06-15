package com.mo.leetcode.easy;

public class RemoveDuplicatesFromArray {


    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[fast - 1]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {

        int[] test1 = {1, 1, 2};

        System.out.println("Test 1: ");
        System.out.println("Original: " + java.util.Arrays.toString(test1));
        int newSize = removeDuplicates(test1);
        System.out.println("After: " + java.util.Arrays.toString(java.util.Arrays.copyOf(test1, newSize)));
        System.out.println("New size: " + newSize);


    }

}
