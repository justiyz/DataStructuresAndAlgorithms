package com.datastructureandalgorithm.all.arrays;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class OrderedArray {

    private int[] objElements;
    private int count;

    public OrderedArray(int[] elements) {
        this.objElements = elements;
    }


    //The find() method searches for a specified item by repeatedly dividing in half the range of array elements to be considered.
    public String find(long searchKey) {

        int nElems = objElements.length;
        int upperBound = nElems - 1;
        int lowerBound = 0;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (objElements[curIn] == searchKey) {
                return ("The number is in index "+curIn);      // found it
            }
            else if (lowerBound > upperBound) {
                return "Number does not exist in the array";      // can’t find it
            }
            else        // divide range
            {
                if (objElements[curIn] < searchKey) {
                    lowerBound = curIn + 1; // it’s in upper half
                }
                else {
                    upperBound = curIn - 1; // it’s in lower half
                }
            } // end else divide range
        } // end while
    }
}
