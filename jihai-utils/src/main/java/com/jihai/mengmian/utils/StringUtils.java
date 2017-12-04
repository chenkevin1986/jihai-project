package com.jihai.mengmian.utils;

import java.text.StringCharacterIterator;

/**
 * @Author: laiqiuhua.
 * @Date: 2017/9/29 13:17.
 */
public final class StringUtils {

    private StringUtils(String input){
        stringCharacterIterator = new StringCharacterIterator(input);
    }

    public static StringUtils getInstance(String input) {
        return new StringUtils(input);
    }

    private StringCharacterIterator stringCharacterIterator;

    public String firstLetterUppercase(String input) {
        char firstChar = stringCharacterIterator.first();
        firstChar = Character.toLowerCase(firstChar);
        return stringCharacterIterator.toString();
    }

    public String firstLetterLowercase(String input) {
        char firstChar = stringCharacterIterator.first();
        firstChar = Character.toLowerCase(firstChar);
        return stringCharacterIterator.toString();
    }

    public static void main(String[] args) {
        String str = "sdfsg";
        System.out.println(StringUtils.getInstance(str).firstLetterLowercase(str));
    }

}
