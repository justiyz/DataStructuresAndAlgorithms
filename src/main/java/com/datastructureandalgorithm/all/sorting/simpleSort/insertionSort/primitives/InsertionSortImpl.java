package com.datastructureandalgorithm.all.sorting.simpleSort.insertionSort.primitives;

class InsertionSortImpl {

    public static void main(String[] args) {

        int maxSize = 100; // array size
        InsertionSort arr = new InsertionSort(maxSize); // create the array

        // fill array with random numbers
//        for (int j = 0; j < maxSize; j++)         {
//            long n = (long) (java.lang.Math.random() * (maxSize - 1));
//            arr.insert(n);
//        }

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

        arr.display(); // display items
        arr.insertionSort(); // insertion-sort them
        arr.display(); // display them again
    }
}
