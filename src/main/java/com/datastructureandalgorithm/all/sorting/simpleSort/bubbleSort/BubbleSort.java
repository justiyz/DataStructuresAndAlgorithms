package com.datastructureandalgorithm.all.sorting.simpleSort.bubbleSort;

    public class BubbleSort {

    private long[] a; // ref to array a
    private int nElems; // number of data items

    public BubbleSort(int max) {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    // put element into array
    public void insert(long value) {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }

    // displays array contents
    public void display() {
        for (int j = 0; j < nElems; j++) // for each element,
            System.out.print(a[j] + " "); // display it
        System.out.println("");
    }

    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) // outer loop (backward)
            for (in = 0; in < out; in++) // inner loop (forward)
                if (a[in] > a[in + 1]) // out of order?
                    swap(in, in + 1); // swap them
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
