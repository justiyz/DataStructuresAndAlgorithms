package com.datastructureandalgorithm.all.linkedList.moreExamples.queueImplementedByLinkedList;

class FirstLastList {

    private Link first; // ref to first item
    private Link last; // ref to last item

    // constructor
    public FirstLastList() {
        first = null; // no items on list yet
        last = null;
    }

    // true if no links
    public boolean isEmpty() {
        return first == null;
    }

    // insert at end of list
    public void insertLast(long dd) {
        Link newLink = new Link(dd); // make new link
        if (isEmpty()) // if empty list,
            first = newLink; // first --> newLink
        else
            last.next = newLink; // old last --> newLink
        last = newLink; // newLink <-- last
    }

    // delete first link (assumes non-empty list)
    public long deleteFirst() {
        long temp = first.dData;
        if (first.next == null) // if only one item
            last = null; // null <-- last
        first = first.next; // first --> old next
        return temp;
    }

    public void displayList() {
        Link current = first; // start at beginning
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }

}
