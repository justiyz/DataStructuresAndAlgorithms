package com.datastructureandalgorithm.all.stacks.primitives;

class Stack {

    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top; // top of stack

    // constructor
    public Stack(int s) {
        maxSize = s; // set array size
        stackArray = new long[maxSize]; // create array
        top = -1; // no items yet
    }

    // put item on top of stack
    public void push(long j) {
        stackArray[++top] = j; // increment top, insert item
    }

    // take item from top of stack
    public long pop() {
        return stackArray[top--]; // access item, decrement top
    }

    // peek at top of stack
    public long peek() {
        return stackArray[top];
    }

    // true if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // true if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
