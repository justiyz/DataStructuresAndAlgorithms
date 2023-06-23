package com.datastructureandalgorithm.all.linkedList.doublyLinkedList;

class Link {

    public long dData; // data item
    public Link next; // next link in list
    public Link previous; // previous link in list

    // constructor
    public Link(long d) {
        dData = d;
    }

    // display this link
    public void displayLink() {
        System.out.print(dData + " ");
    }

} // end class Link

