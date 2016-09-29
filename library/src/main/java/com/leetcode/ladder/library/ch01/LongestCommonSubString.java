package com.leetcode.ladder.library.ch01;

/**
 * Created by aliouswang on 16/9/29.
 */

public class LongestCommonSubString {

    public static int longestCommonSubString(String A, String B) {
        int n = A.length();
        int m = B.length();
        int[][] f = new int[n + 1][m + 1];
        int max = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    f[i][j] =  f[i - 1][j - 1];
                }else {
                    f[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                max = Math.max(max, f[i][j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String A = "http://www.baidu.com";
        String B = "https://www.taobao.com";
        System.out.println(LongestCommonSubString.longestCommonSubString(A, B) + "");
    }

}
