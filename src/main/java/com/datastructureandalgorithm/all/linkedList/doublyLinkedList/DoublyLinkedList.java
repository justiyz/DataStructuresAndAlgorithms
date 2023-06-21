package com.datastructureandalgorithm.all.linkedList.doublyLinkedList;

public class DoublyLinkedList {

    private Link first; // ref to first item
    private Link last; // ref to last item

    public DoublyLinkedList() // constructor
    {
        first = null; // no items on list yet
        last = null;
    }

    public boolean isEmpty() // true if no links
    { return first==null; }

    public void insertFirst(long dd) // insert at front of list
    {
        Link newLink = new Link(dd); // make new link
        if( isEmpty() ) // if empty list,
            last = newLink; // newLink <-- last
        else
            first.previous = newLink; // newLink <-- old first
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }


}
