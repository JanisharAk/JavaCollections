package p9_HashSet;

import java.util.HashSet;

public class C1_AddingRemoveElementInHashSet {
    public static void main(String[] args) {
        // Creating an empty HashSet of string entities
        HashSet<String> hs = new HashSet<String>();

        // Adding elements using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");

        // Printing all string entries inside the Set
        System.out.println("HashSet : " + hs);

        // Returns false if the element is not present
        System.out.println("B exists in Set : " + hs.remove("For"));
    }
}
