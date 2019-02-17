package in.alavala.utils;

import java.util.Arrays;

public class ArraysUtils {

    public static void print(int[] array) {
        System.out.println(asString(array));
    }

    public static void print(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static String asString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i : array) {
            sb.append(i);
            sb.append(' ');
        }
        sb.append(']');
        return sb.toString();
    }

    public static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int t = array[i];
            array[i] = array[j];
            array[j] = t;
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int dest = 1;
        for (int src = 1; src < array.length; src++) {
            if (array[src] != array[dest - 1]) {
                array[dest] = array[src];
                dest++;
            }
        }
        return Arrays.copyOf(array, dest);
    }
}
