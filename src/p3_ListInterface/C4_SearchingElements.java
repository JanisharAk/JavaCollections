package p3_ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class C4_SearchingElements {
    public static void main(String[] args) {
        /*
         The List interface provides several methods to search for elements,
         such as the indexOf(), lastIndexOf() methods.
         */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println("List : " + list);

        /// use indexOf() to find the first occurrence of an
        // element in the list
        int i = list.indexOf(2);

        System.out.println("First Occurrence of 2 is at Index: "+i);

        // use lastIndexOf() to find the last occurrence of
        // an element in the list
        int l = list.lastIndexOf(5);

        System.out.println("Last Occurrence of 2 is at Index: "+l);
    }
}
