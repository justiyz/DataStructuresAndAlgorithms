package com.datastructureandalgorithm.all.linkedList.doubleEndedList;

class Link {
    public long dData; // data item
    public Link next; // next link in list

    // constructor
    public Link(long d) {
        dData = d;
    }

    // display this link
    public void displayLink() {
        System.out.print(dData + " ");
    }
}
