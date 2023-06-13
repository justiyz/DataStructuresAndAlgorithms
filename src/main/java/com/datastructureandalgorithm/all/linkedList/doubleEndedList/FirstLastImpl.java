package com.datastructureandalgorithm.all.linkedList.doubleEndedList;

class FirstLastImpl {
    public static void main(String[] args) {

        FirstLastList theList = new FirstLastList();

        // insert at front
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        // insert at rear
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        // display the list
        theList.displayList();

        // delete first two items
        theList.deleteFirst();
        theList.deleteFirst();

        // display again
        theList.displayList();
    }
}
