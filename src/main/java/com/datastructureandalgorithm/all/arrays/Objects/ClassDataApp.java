package com.datastructureandalgorithm.all.arrays.Objects;

import lombok.Data;

@Data
public class ClassDataApp {
    public static void main(String[] args) {

        int maxSize = 100; // array size
        ClassDataArray arr; // reference to array
        arr = new ClassDataArray(maxSize); // create the array

        // insert 10 items
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        arr.displayArrayOfPersons();

        // search for item
        String searchKey = "Stimson";
        Person found = arr.find(searchKey);
        if(found != null) {
            System.out.print("Found ");
            found.displayPerson();
        }
        else {
            System.out.println("Can’t find " + searchKey);
        }

        // delete 3 items
        System.out.println("Deleting Smith, Yee, and Creswell");
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");

        // display items again
        arr.displayArrayOfPersons();
    }
}
