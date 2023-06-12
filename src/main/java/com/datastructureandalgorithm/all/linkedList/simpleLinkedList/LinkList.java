package com.datastructureandalgorithm.all.linkedList.simpleLinkedList;

class LinkList {
    private Link first; // reference to first link on list

    // constructor
    public void LinkList() {
        first = null; // no items on list yet
    }

    // true if list is empty
    public boolean isEmpty() {
        return (first == null);
    }

    // insert at start of list
    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd); // make new link
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    // delete first item (assumes list not empty)
    public Link deleteFirst() {
        Link temp = first; // save reference to link
        first = first.next; // delete it: first-->old next
        return temp; // return deleted link
    }

    public Link find(int key) // find link with given key
    { // (assumes non-empty list)
        Link current = first; // start at ‘first’
        while (current.iData != key) // while no match,
        {
            if (current.next == null) // if end of list,
                return null; // didn’t find it
            else // not end of list,
                current = current.next; // go to next link
        }
        return current; // found it
    }

    // delete link with given key (assumes non-empty list)
    public Link delete(int key) {
        Link current = first; // search for link
        Link previous = first;
        while (current.iData != key) {
            if (current.next == null)
                return null; // didn’t find it
            else {
                previous = current; // go to next link
                current = current.next;
            }
        } // found it
        if (current == first) // if first link,
            first = first.next; // change first
        else // otherwise,
            previous.next = current.next; // bypass it
        return current;
    }


    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // start at beginning of list
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }

}
