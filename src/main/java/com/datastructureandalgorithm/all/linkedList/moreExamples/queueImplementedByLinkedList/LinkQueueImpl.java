package com.datastructureandalgorithm.all.linkedList.moreExamples.queueImplementedByLinkedList;

class LinkQueueImpl {
    public static void main(String[] args) {

        LinkQueue theQueue = new LinkQueue();
        // insert items
        theQueue.insert(20);
        theQueue.insert(40);

        // display queue
        theQueue.displayQueue();

        // insert items
        theQueue.insert(60);
        theQueue.insert(80);

        // display queue
        theQueue.displayQueue();

        // remove items
        theQueue.remove();
        theQueue.remove();

        // display queue
        theQueue.displayQueue();
    }
}
