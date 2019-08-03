package cn.rockingwang.leetcode.no4xx;

/**
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * <p>
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2.
 * If it does not exist, output -1 for this number.
 */
public class No496NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i ++) {
            int index = indexOf(nums2, nums1[i]);
            int tmp = -1;
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    tmp = nums2[j];
                    break;
                }
            }
            result[i] = tmp;
        }
        return result;
    }

    private static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] result = nextGreaterElement(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
        for (int i : result) {
            System.out.println(i);
        }
    }
}
