package com.datastructureandalgorithm.all.linkedList.examples.stackImplementedByLinkedList;

class Link {
    public long dData; // data item
    public Link next; // next link in list

    // constructor
    public Link(long dd) {
        dData = dd;
    }

    // display ourself
    public void displayLink() {
        System.out.print(dData + " ");
    }
}
