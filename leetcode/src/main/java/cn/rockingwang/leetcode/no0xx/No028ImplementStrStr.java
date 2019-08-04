package cn.rockingwang.leetcode.no0xx;

/**
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 */
public class No028ImplementStrStr {

    public static int strStr(String haystack, String needle) {
        int startIndex = 0;
        while (startIndex < haystack.length()) {
            if (haystack.charAt(startIndex) == needle.charAt(0)) {
                for (int i = 0; i < needle.length(); i++) {
                    if (haystack.charAt(startIndex + i) != )
                }
            }
        }
    }

    public static void main(String[] args) {
        int index = strStr("hello", "ll");
        System.out.println("index: " + index);
    }

}
