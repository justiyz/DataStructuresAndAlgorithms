package com.datastructureandalgorithm.all.stacks;

public class Stacks {

    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top; // top of stack

    // constructor
    public Stacks(int s)     {
        maxSize = s; // set array size
        stackArray = new long[maxSize]; // create array
        top = -1; // no items yet
    }

    public void push(long j) // put item on top of stack
    {
        stackArray[++top] = j; // increment top, insert item
    }
}
