package in.alavala.utils;

import java.util.HashMap;
import java.util.Map;

public class NumberUtils {

    static Map<Integer, String> strings = new HashMap<Integer, String>() {{
        put(0, "zero");
        put(1, "one");
        put(2, "two");
        put(3, "three");
        put(4, "four");
        put(5, "five");
        put(6, "six");
        put(7, "seven");
        put(8, "eight");
        put(9, "nine");
        put(10, "ten");
        put(11, "eleven");
        put(12, "twelve");
        put(13, "thirteen");
        put(14, "fourteen");
        put(15, "fifteen");
        put(16, "sixteen");
        put(17, "seventeen");
        put(18, "eighteen");
        put(19, "nineteen");
        put(20, "twenty");
        put(30, "thirty");
        put(40, "forty");
        put(50, "fifty");
        put(60, "sixty");
        put(70, "seventy");
        put(80, "eighty");
        put(90, "ninety");
        put(100, "hundred");

        for (int i = 21; i <100; i++) {
            putIfAbsent(i, get((i/10)*10) + " " + get(i%10));
        }

    }};

    public static void main(String[] args) {
        for (int i=0; i<=100; i++) {
            System.out.println(strings.get(i));
        }
    }


}
