package com.datastructureandalgorithm.all.arrays.objects;

import lombok.Data;

@Data
public class Person {

    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }
}

class ClassDataArray {
    private Person[] ArrayOfPersons; // reference to array
    private int numberOfElements; // number of data items

    // constructor
    public ClassDataArray(int max) {
        ArrayOfPersons = new Person[max]; // create the array
        numberOfElements = 0; // no items yet
    }

    // find specified value
    public Person find(String searchName) {
        int j;
        for (j = 0; j < numberOfElements; j++) // for each element,
            if (ArrayOfPersons[j].getLastName().equals(searchName)) // found item?
                break; // exit loop before end
        if (j == numberOfElements) // gone to end?
            return null; // yes, can’t find it
        else
            return ArrayOfPersons[j]; // no, found it
    }

    // put person into array
    public void insert(String last, String first, int age) {
        ArrayOfPersons[numberOfElements] = new Person(last, first, age);
        numberOfElements++; // increment size
    }


    // delete person from array
    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < numberOfElements; j++) { // look for it
            if (ArrayOfPersons[j].getLastName().equals(searchName))
                break;
        }
        if (j == numberOfElements) {
            return false;
        } else // found it
        {
            for (int k = j; k < numberOfElements; k++) // shift down
                ArrayOfPersons[k] = ArrayOfPersons[k + 1];
            numberOfElements--; // decrement size
            return true;
        }
    }

    public void displayArrayOfPersons() // displays array contents
    {
        for (int j = 0; j < numberOfElements; j++) // for each element,
            ArrayOfPersons[j].displayPerson(); // display it
    }


}