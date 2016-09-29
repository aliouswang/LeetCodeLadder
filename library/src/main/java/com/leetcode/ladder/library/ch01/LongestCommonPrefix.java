package com.leetcode.ladder.library.ch01;

/**
 * Created by aliouswang on 16/9/29.
 */

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        int max = 0;
        if(len == 0) {
            return "";
        }
        else if(len == 1) {
            max = strs[0].length();
        }else {
            int firstLen = strs[0].length();
            for(int i = 0; i < firstLen; i++) {
                if(checkSame(strs, i)) {
                    max++;
                }else {
                    break;
                }
            }
        }
        if (max <= 0) {
            return "";
        }else {
            return strs[0].substring(0, max);
        }
    }

    public static boolean checkSame(String[] strs, int index) {
        int len = strs.length;
        char firstChar = strs[0].charAt(index);
        boolean result = true;
        for(int i = 1; i < len; i++) {
            if(index >= strs[i].length() || firstChar != strs[i].charAt(index)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
