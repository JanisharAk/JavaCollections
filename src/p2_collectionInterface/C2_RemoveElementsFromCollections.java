package p2_collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class C2_RemoveElementsFromCollections {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(5);
        collection.add(12);
        collection.add(20);
        collection.add(21);
        collection.add(30);
        collection.add(40);
        collection.add(60);

        // Displaying the list
        //System.out.println(collection);


        //print the collection
        for(Integer collection1 : collection){
            //System.out.println("Number :" +collection1);
            System.out.print(collection1+" ");
        }

        System.out.println();
        collection.remove(20);
        System.out.println("Removing specific collection :- "+ collection);

        collection.removeAll(collection);
        System.out.println("Removing all the collection :- "+ collection);

        // Remove element with value 20
//        collection.remove(Integer.valueOf(20));
//
//        // Print updated collection
//        System.out.println(collection);
    }
}
