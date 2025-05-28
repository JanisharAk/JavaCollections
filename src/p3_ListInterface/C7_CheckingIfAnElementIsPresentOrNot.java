package p3_ListInterface;

import java.util.ArrayList;
import java.util.List;

public class C7_CheckingIfAnElementIsPresentOrNot {
    /*
    Parameter: contains(Object o): This method takes a single parameter,
    the object to be checked if it is present in the list.
     */
    public static void main(String[] args) {
        // Creating List class object
        List<String> al = new ArrayList<>();
        // Adding elements to the object
        // Custom inputs
        al.add("Apple");
        al.add("Mango");
        al.add("Papaya");
        al.add("banana");
        al.add("Grapes");

        //Checking if element is present using contains() method
        boolean  isPresent = al.contains("Mango");
        System.out.println("Is mango resent or not : "+ isPresent);
    }
}
