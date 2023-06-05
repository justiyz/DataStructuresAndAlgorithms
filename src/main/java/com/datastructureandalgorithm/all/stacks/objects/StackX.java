package com.datastructureandalgorithm.all.stacks.objects;

class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int max) // constructor
    {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) // put item on top of stack
    {
        stackArray[++top] = j;
    }

    public char pop() // take item from top of stack
    {
        return stackArray[top--];
    }

    public char peek() // peek at top of stack
    {
        return stackArray[top];
    }

    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
}


class BracketChecker {
    private String input; // input string

    public BracketChecker(String in) // constructor
    {
        input = in;
    }

    public void check() {
        int stackSize = input.length(); // get max stack size
        StackX theStack = new StackX(stackSize); // make stack
        for (int j = 0; j < input.length(); j++) // get chars in turn
        {
            char ch = input.charAt(j); // get char
            switch (ch) {
                // opening symbols
                case '{':
                case '[':
                case '(':
                    theStack.push(ch); // push them
                    break;

                // closing symbols
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) // if stack not empty,
                    {
                        char chx = theStack.pop(); // pop and check
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '('))
                            System.out.println("Error: " + ch + "at " + j);
                    } else { // prematurely empty
                        System.out.println("Error: " + ch + " at " + j);
                        break;
                    }
                default: // no action on other characters
                    break;
            }
        }
    }
}
