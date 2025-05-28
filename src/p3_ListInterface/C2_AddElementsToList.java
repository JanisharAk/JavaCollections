package p3_ListInterface;

import java.util.ArrayList;
import java.util.List;

public class C2_AddElementsToList {
    //    List<Obj> list = new ArrayList<Obj> ();
    /*    The common implementation classes of the List interface
        are ArrayList, LinkedList, Stack, and Vector:

     */
    public static void main(String[] args) {
        // Creating an object of List interface,
        // implemented by ArrayList class
        List<String> list = new ArrayList<>();
        // Adding elements to object of List interface
        // Custom elements
        list.add("A");
        list.add("B");
        list.add(1, "C");
        list.add(0,"D");

        // Print all the elements inside the
        // List interface object
        System.out.println(list);
    }
}
