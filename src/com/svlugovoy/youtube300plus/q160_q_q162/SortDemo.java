package com.svlugovoy.youtube300plus.q160_q_q162;

import java.util.Arrays;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 21.03.2016.
 */
public class SortDemo {
    public static void main(String[] args) {

        int[] arrayDemo = {10, -20, 15, 45, 50, 1, 500, 0, 56, 7, 77, 3500, 80};
        System.out.println(Arrays.toString(arrayDemo));

//        bubbleSort(arrayDemo);
//        System.out.println("bubbleSort:\n" + Arrays.toString(arrayDemo));

//        bubbleSort2(arrayDemo);
//        System.out.println("bubbleSort2:\n" + Arrays.toString(arrayDemo));

//        selectSort(arrayDemo);
//        System.out.println("selectSort:\n" + Arrays.toString(arrayDemo));

        selectSort2(arrayDemo);
        System.out.println("selectSort2:\n" + Arrays.toString(arrayDemo));
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

    //selectionSort
    static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    static void selectSort2(int[] array) {
        int out, in, min;
        for (out = 0; out < array.length - 1; out++) {
            min = out;
            for (in = out + 1; in < array.length; in++) {
                if (array[in] < array[min])
                    min = in;
            }
            int tmp = array[out];
            array[out] = array[min];
            array[min] = tmp;
        }
    }

}
