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
        // store the element that we want insert
        Comparable element = a[i];
        int j = i - 1;
        // find the proper position, a[i] < a[j];
        while (j >= 0 && a[j].compareTo(element) > 0) {
            a[j + 1] = a[j];
            j--;
        }
        // put the a[i] to the position
        a[j + 1] = element;
    }
    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
