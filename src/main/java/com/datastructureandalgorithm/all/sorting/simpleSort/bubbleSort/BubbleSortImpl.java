package com.datastructureandalgorithm.all.sorting.simpleSort.bubbleSort;


class BubbleSortImpl {
    public static void main(String[] args) {

        int maxSize = 100; //array size
        BubbleSort arr; //reference to array
        arr = new BubbleSort(maxSize); // create the array

        // fill array with random numbers
        for (int j = 0; j < maxSize; j++)         {
            long n = (long) (java.lang.Math.random() * (maxSize - 1));
            arr.insert(n);
        }

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
        arr.bubbleSort(); // bubble sort them
        arr.display(); // display them again
    }
}
