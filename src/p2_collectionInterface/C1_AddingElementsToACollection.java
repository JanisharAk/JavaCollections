package p2_collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class C1_AddingElementsToACollection {
    public static void main(String[] args) {
        // create an empty ArrayList
        // with an initial capacity
        Collection<Integer> collection = new ArrayList<Integer>(5);

        // use add() method to
        // add elements in the list
        collection.add(10);
        collection.add(20);
        collection.add(25);

        // prints all the elements available in list
        for(Integer n : collection){
            System.out.println("Number :" +n);
        }
        //creating another arrayList
        Collection<Integer> collection1 = new ArrayList<>();
        // Appending the collection to the list
        collection1.addAll(collection);

        // displaying the modified ArrayList
        System.out.println("The new ArrayList is: " + collection1);
    }
}
