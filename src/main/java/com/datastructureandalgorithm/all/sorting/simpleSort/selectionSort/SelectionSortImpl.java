package com.datastructureandalgorithm.all.sorting.simpleSort.selectionSort;

public class SelectionSortImpl {
    public static void main(String[] args) {
        int maxSize = 100;
        SelectionSort arr = new SelectionSort(maxSize);

        // insert 10 items
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        // display items
        arr.display();

        //selection sort them
        arr.selectionSort();

        // display them again
        arr.display();
    }
}
