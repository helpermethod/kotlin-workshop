package com.predic8.kotlin;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
public class Functions {
    public static String slice(String s, int begin, int end) {
        return s.substring(begin, end);
    }

    public static String slice(String s, int begin) {
        return slice(s, begin, s.length());
    }

    public static String sliceWithDefaultBegin(String s, int end) {
        return slice(s, 0, end);
    }
}