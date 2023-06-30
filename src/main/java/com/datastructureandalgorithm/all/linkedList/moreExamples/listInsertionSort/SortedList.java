package com.datastructureandalgorithm.all.linkedList.moreExamples.listInsertionSort;

class SortedList {

    private Link first; // ref to first item on list

    // constructor (no args)
    public SortedList()
    {
        first = null;
    } // initialize list

    // constructor (array as argument)
    public SortedList(Link[] linkArr) {
        first = null; // initialize list
        for (int j = 0; j < linkArr.length; j++) // copy array
            insert(linkArr[j]); // to list
    }

    // insert (in order)
    public void insert(Link k) {
        Link previous = null; // start at first
        Link current = first;

        // until end of list, or key > current,
        while (current != null && k.dData > current.dData) {
            previous = current;
            current = current.next; // go to next item
        }
        if (previous == null) // at beginning of list
            first = k; // first --> k
        else // not at beginning
            previous.next = k; // old prev --> k
        k.next = current; // k --> old current
    } // end insert()

    // return & delete first link
    public Link remove()
    { // (assumes non-empty list)
        Link temp = first; // save first
        first = first.next; // delete first
        return temp; // return value
    }
}
