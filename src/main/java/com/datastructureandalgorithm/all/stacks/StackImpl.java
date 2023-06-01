package com.datastructureandalgorithm.all.stacks;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StackImpl {
    public static void main(String[] args) {

        // make new stack
        Stack theStack = new Stack(10);

        // push items onto stack
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        // until it’s empty, delete item from stack
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value); // display it
            System.out.print(" ");
        } // end while
        System.out.println(" ");


    }
}
