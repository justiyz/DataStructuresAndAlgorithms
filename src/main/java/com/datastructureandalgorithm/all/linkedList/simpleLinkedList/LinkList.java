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

}
