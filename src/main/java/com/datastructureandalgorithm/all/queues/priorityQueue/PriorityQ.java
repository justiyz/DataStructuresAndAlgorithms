package com.datastructureandalgorithm.all.queues.priorityQueue;

class PriorityQ {

    // array in sorted order, from max at 0 to min at size-1
    private int maxSize;
    private long[] queArray;
    private int nItems;

    // constructor
    public PriorityQ(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    // insert item
    public void insert(long item) {
        int j;
        if (nItems == 0) // if no items,
            queArray[nItems++] = item; // insert at 0
        else // if items,
        {
            for (j = nItems - 1; j >= 0; j--) // start at end,
            {
                if (item > queArray[j]) // if new item larger,
                    queArray[j + 1] = queArray[j]; // shift upward
                else // if smaller,
                    break; // done shifting
            } // end for
            queArray[j + 1] = item; // insert it
            nItems++;
        } // end else (nItems > 0)
    } // end insert()

    // remove minimum item
    public long remove() {
        return queArray[--nItems];
    }

    // peek at minimum item
    public long peekMin() {
        return queArray[nItems - 1];
    }

    // true if queue is empty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // true if queue is full
    public boolean isFull() {
        return (nItems == maxSize);
    }


}
