package com.datastructureandalgorithm.all.queues;

class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int numberOfItems;

    // constructor
    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        numberOfItems = 0;
    }

    // put item at rear of queue
    public void insert(long j) {
        if (rear == maxSize - 1) // deal with wraparound
            rear = -1;
        queArray[++rear] = j; // increment rear and insert
        numberOfItems++; // one more item
    }

    // take item from front of queue
    public long remove() {
        long removedValue = queArray[front++]; // get value and incr front
        if (front == maxSize) // deal with wraparound
            front = 0;
        numberOfItems--; // one less item
        return removedValue;
    }

    // peek at front of queue
    public long peekFront() {
        return queArray[front];
    }

    // true if queue is empty
    public boolean isEmpty() {
        return (numberOfItems == 0);
    }

    // true if queue is full
    public boolean isFull() {
        return (numberOfItems == maxSize);
    }

    // number of items in queue
    public int size() {
        return numberOfItems;
    }

}
