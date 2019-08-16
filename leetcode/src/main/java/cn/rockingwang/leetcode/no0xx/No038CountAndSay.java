package cn.rockingwang.leetcode.no0xx;

public class No038CountAndSay {

    public static String countAndSay(int n) {
        String current = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] stringChars = current.toCharArray();
            char temp = '-';
            int count = 0;
            for (int j = 0; j < stringChars.length; j++) {
                if (stringChars[j] == temp) {
                    count++;
                } else {
                    if (j > 0) {
                        stringBuilder.append(count);
                        stringBuilder.append(temp);
                    }
                    temp = stringChars[j];
                    count = 1;
                }
                if (j == stringChars.length - 1) {
                    stringBuilder.append(count);
                    stringBuilder.append(temp);
                }
            }
            current = stringBuilder.toString();
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + countAndSay(4));
    }
}
