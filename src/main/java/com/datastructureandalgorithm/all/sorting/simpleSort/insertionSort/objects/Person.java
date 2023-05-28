package com.datastructureandalgorithm.all.sorting.simpleSort.insertionSort.objects;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    public void displayPerson() {
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    public String getLast() // get last name
    {
        return lastName;
    }
}


class ArrayInOb {

    private Person[] a; // ref to array a
    private int nElems; // number of data items

    public ArrayInOb(int max) {
        a = new Person[max]; // create the array
        nElems = 0; // no items yet
    }

    // put person into array
    public void insert(String last, String first, int age)
    {
        a[nElems] = new Person(last, first, age);
        nElems++; // increment size
    }
}
