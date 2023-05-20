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
    public int find(long searchKey) {
        int nElems = objElements.length;

        int lowerBound = 0;
        int upperBound = nElems - 1;

        int curIn;
        while (true) {
            log.info("LOWERBOUND & UPPERBOUND -> {} - {}", lowerBound, upperBound);
            curIn = (lowerBound + upperBound) / 2;
            log.info("CURRENT INDEX 1 -> {}", curIn);
            if (objElements[curIn] == searchKey) {
                log.info("CURRENT INDEX 2 -> {}", curIn);
                return curIn;       // found it
            }
            else if (lowerBound > upperBound) {
                log.info("NUMBER OF ELEMENTS -> {}", nElems);
                return nElems;      // can’t find it
            }
            else        // divide range
            {
                log.info("ELSE -> {}", curIn);
                if (objElements[curIn] < searchKey) {
                    log.info("INNER IF -> {}", curIn);
                    lowerBound = curIn + 1; // it’s in upper half
                }
                else {
                    log.info("INNER ELSE -> {}", curIn);
                    upperBound = curIn - 1; // it’s in lower half
                }
            } // end else divide range
        } // end while
    }
}
