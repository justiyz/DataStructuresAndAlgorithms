package com.datastructureandalgorithm.all.sorting.simpleSort.selectionSort;

import lombok.Data;

@Data
public class SelectionSort {

    private long[] array; // ref to array a
    private int numberOfElements; // number of data items

    // constructor
    public SelectionSort(int max) {
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

    public void selectionSort() {
        int outerLoop, innerLoop, minimum;

        for (outerLoop = 0; outerLoop < numberOfElements - 1; outerLoop++) {
            minimum = outerLoop;
            for (innerLoop = outerLoop + 1; innerLoop < numberOfElements; innerLoop++) {
                if (array[innerLoop] < array[minimum])
                    minimum = innerLoop;
                swap(outerLoop, minimum);
            }
        }
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
