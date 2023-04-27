package com.datastructureandalgorithm.all.linkedList;

import lombok.Data;

@Data
public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeLast();
        System.out.println(list.indexOf(40));
        System.out.println(list.contains(40));
    }
}
