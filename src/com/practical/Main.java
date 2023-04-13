package com.practical;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {9,12,7,14,5,16,3,19};
        var sort = new Sort();
        int[] sorted = sort.bubbleSort(array);
        System.out.println(Arrays.toString(sorted));

     }
}
