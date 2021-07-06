/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lakshmi Priya
 */

class GenSort{
    
    private static <T> void swap(T[] a, int i, int j) {
        if (i != j) {
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[smallest])<=0) {
                    smallest = j;
                }
            }
            swap(a, i, smallest);
        }
        
    }
    
}