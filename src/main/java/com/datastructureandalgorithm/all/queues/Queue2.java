package com.datastructureandalgorithm.all.queues;


//TODO: The Queue Class Without "numberOfItems"
class Queue2 {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    // constructor
    public Queue2(int s) {
        maxSize = s + 1; // array is 1 cell larger than requested
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
    }

    // put item at rear of queue
    public void insert(long j) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = j;
    }

    // take item from front of queue
    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        return temp;
    }

    // peek at front of queue
    public long peek() {
        return queArray[front];
    }

    // true if queue is empty
    public boolean isEmpty() {
        return (rear + 1 == front || (front + maxSize - 1 == rear));
    }

    // true if queue is full
    public boolean isFull() {
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }

    // (assumes queue not empty)
    public int size() {
        if (rear >= front) // contiguous sequence
            return rear - front + 1;
        else // broken sequence
            return (maxSize - front) + (rear + 1);
    }
}
