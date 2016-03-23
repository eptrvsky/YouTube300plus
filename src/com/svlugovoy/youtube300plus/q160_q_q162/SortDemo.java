package com.svlugovoy.youtube300plus.q160_q_q162;

import java.util.Arrays;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 21.03.2016.
 */
public class SortDemo {
    public static void main(String[] args) {

        int[] arrayDemo = {10, -20, 15, 45, 50, 1, 500, 0, 56, 7, 77, 3500, 80};
        System.out.println(Arrays.toString(arrayDemo));

        bubbleSort(arrayDemo);
        System.out.println("bubbleSort:\n" + Arrays.toString(arrayDemo));

//        bubbleSort2(arrayDemo);
//        System.out.println("bubbleSort2:\n" + Arrays.toString(arrayDemo));

    }

    //bubbleSort
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    static void bubbleSort2(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] < array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }


}
