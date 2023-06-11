package com.datastructureandalgorithm.all.linkedList.simpleLinkedList;

class Link {
    public int iData; // data item
    public double dData; // data item
    public Link next; // next link in list

    // constructor
    public Link(int id, double dd) {
        iData = id; // initialize data
        dData = dd;
        next = null; //we set next to null here but this isn't necessary cuz references are set to null automatically when they’re created.
    }

    // display ourself
    public void displayLink() {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
} // end class Link
