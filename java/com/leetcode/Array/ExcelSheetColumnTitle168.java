package com.leetcode.Array;

public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int columnNumber) {

        StringBuilder str = new StringBuilder();
        while(columnNumber > 0){
            columnNumber --;
            char c= (char) ('A' + (columnNumber % 26));
            str.append(c);
            columnNumber /= 26;
        }
        return str.reverse().toString();
    }
}
