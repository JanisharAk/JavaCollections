package p2_collectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class C3_IteratingOverCollection {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(10);
        collection.add(10);
        collection.add(20);
        collection.add(30);
        collection.add(10);
        collection.add(20);
        collection.add(50);
        collection.add(60);

        // Displaying the list
        System.out.println("The list is:" + collection);

        // Create an iterator for the list
        // using iterator() method
        Iterator<Integer> iterator = collection.iterator();

        // Displaying the values after iterating
        // through the list
        System.out.println("\nThe iterator values" + " of list are: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
    }
}
