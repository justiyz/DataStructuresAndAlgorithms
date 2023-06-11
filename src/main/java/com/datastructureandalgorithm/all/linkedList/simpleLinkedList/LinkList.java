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


}
