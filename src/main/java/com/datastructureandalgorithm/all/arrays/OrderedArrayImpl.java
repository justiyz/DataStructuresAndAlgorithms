package com.datastructureandalgorithm.all.arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderedArrayImpl {
    public static void main(String[] args) {
        int[] elements = {10, 20, 30, 40, 50, 60, 70};
        OrderedArray array = new OrderedArray(elements);
        String result = array.find(30);
        log.info("RESULT -> {}", result);
    }
}
