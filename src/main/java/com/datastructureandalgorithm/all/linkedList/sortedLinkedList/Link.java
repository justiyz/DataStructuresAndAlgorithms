package com.datastructureandalgorithm.all.linkedList.sortedLinkedList;

class Link {
    public long dData; // data item
    public Link next; // next link in list

    // constructor
    public Link(long dd) {
        dData = dd;
    }

    // display this link
    public void displayLink() {
        System.out.print(dData + " ");
    }
}
