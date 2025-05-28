package p8_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C1_UnionIntersectionDifferenceOnSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        System.out.println("Printing empty set "+set1);
        // Adding all elements to List
        set1.addAll(Arrays.asList(
                new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> set2 = new HashSet<Integer>();

        set2.addAll(Arrays.asList(
                new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));


        // To find union
        Set<Integer> u = new HashSet<Integer>(set1);
        u.addAll(set2);
        System.out.print("Union of the two Set ");
        System.out.println(u);

        // To find intersection
        Set<Integer> i = new HashSet<Integer>(set1);
        i.retainAll(set2);
        System.out.print("Intersection of the two Set ");
        System.out.println(i);

        // To find the symmetric difference
        Set<Integer> d = new HashSet<Integer>(set1);
        d.removeAll(set2);
        System.out.print("Difference of the two Set ");
        System.out.println(d);
    }
}
