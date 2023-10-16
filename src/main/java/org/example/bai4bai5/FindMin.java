package org.example.bai4bai5;

public class FindMin {
    public static int FindMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {

                min =arr[i] ;
            }

        }

        return min;
    }
}