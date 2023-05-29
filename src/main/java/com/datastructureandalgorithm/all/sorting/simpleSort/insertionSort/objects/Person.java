package com.datastructureandalgorithm.all.sorting.simpleSort.insertionSort.objects;

class Person {
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

    public String getLastName() // get last name
    {
        return lastName;
    }
}


class ArrayInOb {

    private final Person[] array; // ref to array a
    private int numberOfElements; // number of data items

    public ArrayInOb(int max) {
        array = new Person[max]; // create the array
        numberOfElements = 0; // no items yet
    }

    // put person into array
    public void insert(String last, String first, int age) {
        array[numberOfElements] = new Person(last, first, age);
        numberOfElements++; // increment size
    }

    // displays array contents
    public void display() {
        for (int j = 0; j < numberOfElements; j++) // for each element,
            array[j].displayPerson(); // display it
        System.out.println("");
    }

    //sort the person data by the last name
    public void insertionSort() {
        int in, out;
        for (out = 1; out < numberOfElements; out++) // out is dividing line
        {
            Person temp = array[out]; // remove marked person
            in = out; // start shifting at out
            while (in > 0 && // until smaller one found,
                    array[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
                array[in] = array[in - 1]; // shift item to the right
                --in; // go left one position
            }
            array[in] = temp; // insert marked item
        } // end for
    } // end insertionSort()
}
