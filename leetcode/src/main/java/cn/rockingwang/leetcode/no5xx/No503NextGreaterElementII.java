package cn.rockingwang.leetcode.no5xx;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Given a circular array
 * (the next element of the last element is the first element of the array),
 * print the Next Greater Number for every element.
 * The Next Greater Number of a number x
 * is the first greater number to its traversing-order next in the array,
 * which means you could search circularly to find its next greater number.
 * If it doesn't exist, output -1 for this number.
 */
public class No503NextGreaterElementII {

    public static int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int tmp = -1;
            for (int j = 0; j < nums.length; j++) {
                int index = (i + j) % nums.length;
                if (nums[index] > nums[i]) {
                    tmp = nums[index];
                    break;
                }
            }
            result[i] = tmp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = nextGreaterElements(new int[] {5,4,3,2,1});
        for (int i : result) {
            System.out.print(i);
        }
    }

}
