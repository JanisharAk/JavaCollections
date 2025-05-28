package p8_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C2_OperationOnSet {
    public static void main(String[] args) {
        //  Adding elements
        Set<String> s = new HashSet<>();
        s.add("B");
        s.add("B");  // Duplicate, will be ignored
        s.add("C");
        s.add("A");
        s.add("D");
        s.add("E");

        //  Accessing elements (by checking if an element exists)
        System.out.println("Does set contain 'A'? " + s.contains("A"));
        System.out.println("Does set contain 'Z'? " + s.contains("Z"));

        //  Removing elements
        s.remove("D"); // removes D
        System.out.println("After removing 'D': " + s);

        //  Iterating elements using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String element : s) {
            System.out.println(element);
        }

        //  Iterating through Set using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Final state of Set
        System.out.println("Final Set: " + s);
    }
}
