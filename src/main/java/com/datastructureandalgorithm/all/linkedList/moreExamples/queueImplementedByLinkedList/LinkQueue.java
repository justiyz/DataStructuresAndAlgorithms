package com.datastructureandalgorithm.all.linkedList.moreExamples.queueImplementedByLinkedList;

class LinkQueue {
    private FirstLastList theList;

    // constructor
    public LinkQueue() {
        theList = new FirstLastList();
    } // make a 2-ended list

    // true if queue is empty
    public boolean isEmpty() {
        return theList.isEmpty();
    }

    // insert, rear of queue
    public void insert(long j) {
        theList.insertLast(j);
    }

    // remove, front of queue
    public long remove() {
        return theList.deleteFirst();
    }

    public void displayQueue() {
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }
}
