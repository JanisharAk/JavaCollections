package p3_ListInterface;

import java.util.ArrayList;
import java.util.List;

public class C5_RemovingElements {
/*
remove(Object o): This method is used to simply remove an object from the List.
                  If there are multiple such objects, then the first occurrence
                  of the object is removed.
remove(int index): This method takes an integer value which simply removes the element
                   present at that specific index in the List. After removing the element,
                   all the elements are moved to the left to fill the space and the indices
                   of the objects are updated{
 */
      public static void main(String[] args) {
          // Creating List class object
          List<String> al = new ArrayList<>();

          // Adding elements to the object
          // Custom inputs
          al.add("Apple");
          al.add("Mango");
          al.add("Papaya");

          // Adding For at 2nd indexes
          al.set(2, "Papaya");
          System.out.println(al);

          //remove at index 2
          al.remove(2);
          System.out.println("Elements after removing from 2nd index  : " + al);
    }
}
