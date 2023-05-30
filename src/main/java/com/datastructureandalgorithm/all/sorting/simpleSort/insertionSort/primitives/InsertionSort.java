package com.datastructureandalgorithm.all.sorting.simpleSort.insertionSort.primitives;

public class InsertionSort {

    private final long[] array;
    private int numberOfElements;

    //constructor
    public InsertionSort(int max) {
        array = new long[max]; // create the array
        numberOfElements = 0; // no items yet
    }

    // put element into array
    public void insert(long value) {
        array[numberOfElements] = value; // insert it
        numberOfElements++; // increment size
    }

    // displays array contents
    public void display()
    {
        for (int j = 0; j < numberOfElements; j++) // for each element,
            System.out.print(array[j] + " "); // display it
        System.out.println("");
    }

    public void insertionSort() {
        int in, out;

        for (out = 1; out < numberOfElements; out++) // out is dividing line
        {
            long temp = array[out]; // remove marked item
            in = out; // start shifts at out
            while (in > 0 && array[in - 1] >= temp) // until one is smaller,
            {
                array[in] = array[in - 1]; // shift item right,
                --in; // go left one position
            }
            array[in] = temp; // insert marked item
        } // end for

    }

}
