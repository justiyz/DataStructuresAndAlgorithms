package com.datastructureandalgorithm.all.arrays.Objects;

public class Person {

        private String lastName;
        private String firstName;
        private int age;

        public Person(String last, String first, int age) {
            lastName = last;
            firstName = first;
            this.age = age;
        }

        public void displayPerson()
        {
            System.out.print(" Last name: " + lastName);
            System.out.print(", First name: " + firstName);
            System.out.println(", Age: " + age);
        }
        public String getLast() // get last name
        { return lastName; }

}
