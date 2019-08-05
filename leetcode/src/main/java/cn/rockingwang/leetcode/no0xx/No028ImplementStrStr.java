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
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0 || needle.length() > haystack.length()) {
            return -1;
        }
        while (startIndex < haystack.length() - needle.length() + 1) {
            if (haystack.charAt(startIndex) == needle.charAt(0)) {
                boolean match = true;
                for (int i = 0; i < needle.length(); i++) {
                    if (haystack.charAt(startIndex + i) != needle.charAt(i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return startIndex;
                }
            }
            startIndex++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = strStr("mississippi", "issipi");
        System.out.println("index: " + index);
    }

}
