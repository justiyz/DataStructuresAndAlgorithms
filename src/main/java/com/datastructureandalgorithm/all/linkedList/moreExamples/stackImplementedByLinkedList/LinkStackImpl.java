package com.datastructureandalgorithm.all.linkedList.moreExamples.stackImplementedByLinkedList;

class LinkStackImpl {
    public static void main(String[] args) {

        LinkStack theStack = new LinkStack(); // make stack

        // push items
        theStack.push(20);
        theStack.push(40);

        // display stack
        theStack.displayStack();

        // push items
        theStack.push(60);
        theStack.push(80);

        // display stack
        theStack.displayStack();

        // pop items
        theStack.pop();
        theStack.pop();

        // display stack
        theStack.displayStack();
    }
}
