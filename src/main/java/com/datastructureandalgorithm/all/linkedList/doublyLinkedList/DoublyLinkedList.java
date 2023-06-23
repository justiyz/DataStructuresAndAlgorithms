package com.datastructureandalgorithm.all.linkedList.doublyLinkedList;

class DoublyLinkedList {

    private Link first; // ref to first item
    private Link last; // ref to last item

    // constructor
    public DoublyLinkedList() {
        first = null; // no items on list yet
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
        else
            first.previous = newLink; // newLink <-- old first
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    // insert at end of list
    public void insertLast(long dd) {
        Link newLink = new Link(dd); // make new link
        if (isEmpty()) // if empty list,
            first = newLink; // first --> newLink
        else {
            last.next = newLink; // old last --> newLink
            newLink.previous = last; // old last <-- newLink
        }
        last = newLink; // newLink <-- last
    }

    // delete first link (assumes non-empty list)
    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null) // if only one item
            last = null; // null <-- last
        else
            first.next.previous = null; // null <-- old next
        first = first.next; // first --> old next
        return temp;
    }

    // delete last link(assumes non-empty list)
    public Link deleteLast() {
        Link temp = last;
        if (first.next == null) // if only one item
            first = null; // first --> null
        else
            last.previous.next = null; // old previous --> null
        last = last.previous; // old previous <-- last
        return temp;
    }

    // insert dd just after key(assumes non-empty list)
    public boolean insertAfter(long key, long dd) {
        Link current = first; // start at beginning
        while (current.dData != key) // until match is found,
        {
            current = current.next; // move to next link
            if (current == null)
                return false; // didn’t find it
        }
        Link newLink = new Link(dd); // make new link
        if (current == last) // if last link,
        {
            newLink.next = null; // newLink --> null
            last = newLink; // newLink <-- last
        } else // not last link,
        {
            newLink.next = current.next; // newLink --> old next
            // newLink <-- old next
            current.next.previous = newLink;
        }
        newLink.previous = current; // old current <-- newLink
        current.next = newLink; // old current --> newLink
        return true; // found it, did insertion
    }

    // delete item w/ given key(assumes non-empty list)
    public Link deleteKey(long key) {
        Link current = first; // start at beginning
        while (current.dData != key) // until match is found,
        {
            current = current.next; // move to next link
            if (current == null)
                return null; // didn’t find it
        }
        if (current == first) // found it; first item?
            first = current.next; // first --> old next
        else // not first
            // old previous --> old next
            current.previous.next = current.next;

        if (current == last) // last item?
            last = current.previous; // old previous <-- last
        else // not last
            // old previous <-- old next
            current.next.previous = current.previous;
        return current; // return value
    }

    public void displayForward() {
        System.out.print("List (first --> last): ");
        Link current = first; // start at beginning
        while (current != null) // until end of list,
        {
            current.displayLink(); // display data
            current = current.next; // move to next link
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last --> first): ");
        Link current = last; // start at end
        while (current != null) // until start of list,
        {
            current.displayLink(); // display data
            current = current.previous; // move to previous link
        }
        System.out.println("");
    }


}
