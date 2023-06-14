package com.datastructureandalgorithm.all.linkedList.sortedLinkedList;

class SortedListImpl {
    public static void main(String[] args) {

        // create new list
        SortedList theSortedList = new SortedList();

        // insert 2 items
        theSortedList.insert(20);
        theSortedList.insert(40);

        // display list
        theSortedList.displayList();

        // insert 3 more items
        theSortedList.insert(10);
        theSortedList.insert(30);
        theSortedList.insert(50);

        // display list
        theSortedList.displayList();

        // remove an item
        theSortedList.remove();

        // display list
        theSortedList.displayList();
    }
}
