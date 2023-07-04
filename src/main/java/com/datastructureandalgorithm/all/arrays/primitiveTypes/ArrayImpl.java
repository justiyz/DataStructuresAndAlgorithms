package com.datastructureandalgorithm.all.arrays.primitiveTypes;

class ArrayImpl {
    public static void main(String[] args) {

        //create new object with length
        Arrays arrays = new Arrays(2);

        //insert 4 items
        arrays.insert(10);
        arrays.insert(20);
        arrays.insert(30);
        arrays.insert(40);

        //arrays.removeAt(3);
        System.out.println(arrays.indexOf(400));
        arrays.print();

    }
}
