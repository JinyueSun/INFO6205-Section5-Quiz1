package org.example;

public class InsertionSort {
    //Sorts the array using Insertion Sort.
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            insert(i, a);
        }
    }

    private void insert(int i, Comparable[] a) {
        //Inserts the 'Transition element' into its correct position in the sorted portion of the array.
        //TODO: TO BE IMPLEMENTED
        Comparable key = a[i];
        int j = i - 1;
        while (j >= 0 && a[j].compareTo(key) > 0) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = key;
    }
    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
