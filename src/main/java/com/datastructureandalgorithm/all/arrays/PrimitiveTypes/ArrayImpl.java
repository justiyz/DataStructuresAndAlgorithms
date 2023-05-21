package com.datastructureandalgorithm.all.arrays.PrimitiveTypes;

public class ArrayImpl {
    public static void main(String[] args) {

        Arrays arrays = new Arrays(2);
        arrays.insert(10);
        arrays.insert(20);
        arrays.insert(30);
        arrays.insert(40);
//        arrays.removeAt(3);
        System.out.println(arrays.indexOf(400));
        arrays.print();

    }
}
