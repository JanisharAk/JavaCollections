package p3_ListInterface;

import java.util.ArrayList;
import java.util.List;

public class C6_AccessingElements {
    public static void main(String[] args) {
        /*
        get(int index): This method returns the element at the specified index in the list.
         */

        // Creating List class object
        List<String> al = new ArrayList<>();
        // Adding elements to the object
        // Custom inputs
        al.add("Apple");
        al.add("Mango");
        al.add("Papaya");
        al.add("banana");
        al.add("Grapes");

        //print list of array
        System.out.println("List before accesing : "+ al);

        // Accessing elements using get() method
        String first = al.get(0);
        String second = al.get(1);
        String third = al.get(2);

        // Printing all the elements inside the
        // List interface object
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(al);

    }
}
