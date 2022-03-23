package com.company;

public class TimGiaTriNhoNhatTrongMang {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, -1, -1, 0, 0};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index] + " at index " + index);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}