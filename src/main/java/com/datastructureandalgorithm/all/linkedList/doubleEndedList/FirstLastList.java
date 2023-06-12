package com.datastructureandalgorithm.all.linkedList.doubleEndedList;

public class FirstLastList {
    private Link first; // ref to first link
    private Link last; // ref to last link

    // constructor
    public FirstLastList() {
        first = null; // no links on list yet
        last = null;
    }

    // true if no links
    public boolean isEmpty() {
        return first == null;
    }

    // insert at front of list
    public void insertFirst(long dd) {
        Link newLink = new Link(dd); // make new link
        if (isEmpty()) // if empty list,
            last = newLink; // newLink <-- last
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
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

    // delete first link
    public long deleteFirst() { // (assumes non-empty list)
        long temp = first.dData;
        if (first.next == null) // if only one item
            last = null; // null <-- last
        first = first.next; // first --> old next
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // start at beginning
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }

}
