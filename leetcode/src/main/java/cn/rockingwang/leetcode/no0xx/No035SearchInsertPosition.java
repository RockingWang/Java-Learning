package cn.rockingwang.leetcode.no0xx;

/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 */
public class No035SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        return binarySearchTarget(nums, target, 0, nums.length - 1);
    }

    private static int binarySearchTarget(int[] nums, int target, int startIndex, int endIndex) {
        if (target <= nums[startIndex]) {
            return startIndex;
        }
        if (target == nums[endIndex]) {
            return endIndex;
        }
        if (target > nums[endIndex]) {
            return endIndex + 1;
        }
        int middle = (startIndex + endIndex) / 2;
        if (target > nums[middle]) {
            return binarySearchTarget(nums, target, middle + 1, endIndex);
        }
        if (target < nums[middle]) {
            return binarySearchTarget(nums, target, startIndex, middle);
        }
        return middle;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int index = searchInsert(nums, 5);
        System.out.println("index:" + index);
    }

}
