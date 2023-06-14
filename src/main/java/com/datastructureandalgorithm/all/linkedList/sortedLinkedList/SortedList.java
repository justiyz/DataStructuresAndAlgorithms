package com.datastructureandalgorithm.all.linkedList.sortedLinkedList;


class SortedList {

    private Link first; // ref to first item on list

    // constructor
    public SortedList() {
        first = null;
    }

    // true if no links
    public boolean isEmpty() {
        return (first == null);
    }

    // insert, in order
    public void insert(long key) {
        Link newLink = new Link(key); // make new link
        Link previous = null; // start at first
        Link current = first;

        // until end of list, or key > current,
        while (current != null && key > current.dData) {
            previous = current;
            current = current.next; // go to next item
        }

        // at beginning of list
        if (previous == null)
            first = newLink; // first --> newLink
        else // not at beginning
            previous.next = newLink; // old prev --> newLink
        newLink.next = current; // newLink --> old current
    } // end insert()

    // return & delete first link
    public Link remove() { // (assumes non-empty list)
        Link temp = first; // save first
        first = first.next; // delete first
        return temp; // return value
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // start at beginning of list

        // until end of list,
        while (current != null) {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }

}
