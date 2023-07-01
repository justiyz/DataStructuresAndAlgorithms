package com.datastructureandalgorithm.all.linkedList.moreExamples.stackImplementedByLinkedList;

class LinkList {
    private Link first; // ref to first item on list

    // constructor
    public LinkList() {
        first = null; // no items on list yet
    }

    // true if list is empty
    public boolean isEmpty() {
        return (first == null);
    }

    // insert at start of list
    public void insertFirst(long dd) {
        Link newLink = new Link(dd); // make new link
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    // delete first item (assumes list not empty)
    public long deleteFirst() {
        Link temp = first; // save reference to link
        first = first.next; // delete it: first-->old next
        return temp.dData; // return deleted link
    }

    //display list
    public void displayList() {
        Link current = first; // start at beginning of list
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }


}
