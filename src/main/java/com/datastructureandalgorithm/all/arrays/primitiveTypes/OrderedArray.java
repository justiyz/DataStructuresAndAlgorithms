package com.datastructureandalgorithm.all.arrays.primitiveTypes;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
class OrderedArray {

    private long[] array;
    private int numberOfElements;

    public OrderedArray(int lengthOfArray) {
        array = new long[lengthOfArray];
        numberOfElements = 0;
    }

    public int size() {
        return numberOfElements;
    }

    //find an item
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = numberOfElements - 1;
        int currentIndex;
        while (true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if (array[currentIndex] == searchKey)
                return currentIndex; // found it
            else if (lowerBound > upperBound)
                return numberOfElements; // can’t find it
            else // divide range
            {
                if (array[currentIndex] < searchKey)
                    lowerBound = currentIndex + 1; // it’s in upper half
                else
                    upperBound = currentIndex - 1; // it’s in lower half
            }
        }
    }

    // put element into array
    public void insert(long value) {
        int j;
        for (j = 0; j < numberOfElements; j++) // find where it goes
            if (array[j] > value) // (linear search)
                break;
        for (int k = numberOfElements; k > j; k--) // move bigger ones up
            array[k] = array[k - 1];
        array[j] = value; // insert it
        numberOfElements++; // increment size
    }

    //remove item
    public boolean delete(long value) {
        int j = find(value);
        if (j == numberOfElements) // can’t find it
            return false;
        else // found it
        {
            for (int k = j; k < numberOfElements; k++) // move bigger ones down
                array[k] = array[k + 1];
            numberOfElements--; // decrement size
            return true;
        }
    } // end delete()

    // displays array contents
    public void display() {
        for (int j = 0; j < numberOfElements; j++) // for each element,
            System.out.print(array[j] + " "); // display it
        System.out.println(" ");
    }


    // Merge array1 and array2 + sorting into destination
    public int[] merge(int[] array1, int[] array2) {

        int[] destination = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            destination[index] = array1[i];
            index++;
        }
        for (int j = 0; j < array2.length; j++) {
            destination[index] = array2[j];
            index++;
        }

        for (int i = 0; i < destination.length - 1; i++) {
            for (int j = 0; j < destination.length - i - 1; j++) {
                if (destination[j] > destination[j + 1]) {
                    int temp = destination[j];
                    destination[j] = destination[j + 1];
                    destination[j + 1] = temp;
                }
            }
        }
        return destination;
    }

}


