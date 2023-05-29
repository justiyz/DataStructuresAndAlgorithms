package com.datastructureandalgorithm.all.sorting.simpleSort.bubbleSort;

    public class BubbleSort {

    private final long[] array; // ref to array a
    private int numberOfElements; // number of data items

    public BubbleSort(int max) {
        array = new long[max]; // create the array
        numberOfElements = 0; // no items yet
    }

    // put element into array
    public void insert(long value) {
        array[numberOfElements] = value; // insert it
        numberOfElements++; // increment size
    }

    // displays array contents
    public void display() {
        for (int j = 0; j < numberOfElements; j++) // for each element,
            System.out.print(array[j] + " "); // display it
        System.out.println("");
    }

    public void bubbleSort() {
        int out, in;
        for (out = numberOfElements - 1; out > 1; out--) // outer loop (backward)
            for (in = 0; in < out; in++) // inner loop (forward)
                if (array[in] > array[in + 1]) // out of order?
                    swap(in, in + 1); // swap them
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }


}
