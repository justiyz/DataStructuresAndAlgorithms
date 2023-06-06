package com.datastructureandalgorithm.all.queues;

public class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) // constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) // put item at rear of queue
    {
        if (rear == maxSize - 1) // deal with wraparound
            rear = -1;
        queArray[++rear] = j; // increment rear and insert
        nItems++; // one more item
    }

    public long remove() // take item from front of queue
    {
        long temp = queArray[front++]; // get value and incr front
        if (front == maxSize) // deal with wraparound
            front = 0;
        nItems--; // one less item
        return temp;
    }

    // peek at front of queue
    public long peekFront() {
        return queArray[front];
    }
}
}
