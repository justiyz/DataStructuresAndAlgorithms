package com.datastructureandalgorithm.all.sorting.simpleSort.selectionSort;

public class SelectionSortImpl {
    public static void main(String[] args) {
        int maxSize = 100;
        SelectionSort selectionSort = new SelectionSort(maxSize);

        // fill array with random numbers
        for (int j = 0; j < maxSize; j++)         {
            long n = (long) (java.lang.Math.random() * (maxSize - 1));
            selectionSort.insert(n);
        }

        // insert 10 items
//        selectionSort.insert(77);
//        selectionSort.insert(99);
//        selectionSort.insert(44);
//        selectionSort.insert(55);
//        selectionSort.insert(22);
//        selectionSort.insert(88);
//        selectionSort.insert(11);
//        selectionSort.insert(00);
//        selectionSort.insert(66);
//        selectionSort.insert(33);

        // display items
        selectionSort.display();

        //selection sort them
        selectionSort.selectionSort();

        // display them again
        selectionSort.display();
    }
}
