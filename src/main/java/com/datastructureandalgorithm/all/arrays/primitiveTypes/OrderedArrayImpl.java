package com.datastructureandalgorithm.all.arrays.primitiveTypes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderedArrayImpl {
    public static void main(String[] args) {

        int maxSize = 100; // array size
        OrderedArray arr = new OrderedArray(maxSize); // create the array

//        arr.insert(77); // insert 10 items
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(00);
//        arr.insert(66);
//        arr.insert(33);
//
//        int searchKey = 55; // search for item
//        if (arr.find(searchKey) != arr.size()) {
//            System.out.println("Found " + searchKey);
//        } else {
//            System.out.println("Can’t find " + searchKey);
//        }
//
//        arr.display(); // display items
//        arr.delete(00); // delete 3 items
//        arr.delete(55);
//        arr.delete(99);
//        arr.display(); // display items again

        int[] source1 = {1, 2, 5};
        int [] source2 = {6, 7, 9};
        int [] result = arr.merge(source2, source1);
        log.info("MERGED RESULT -> {}", result);




    }
}
