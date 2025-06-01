package p9_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C5_DisjointArraysOrSets {
    /*
    Input: a[] = {12, 34, 11, 9, 3}, b[] = {2, 1, 3, 5}
    Output: False
    Explanation: 3 is common in both the arrays.
     */
    public static void main(String[] args) {
        int[] a = {12, 34, 11, 9, 3};
        int[] b = {2, 1, 3, 5};
        boolean result =  disjoint(a, b);
        System.out.println("Are arrays disjoint? " + result);

    }
        public static boolean disjoint(int[] a, int[] b){
           Set<Integer> set = new HashSet<>();
            // Add all elements of first array to set
            for (int num : a) {
                set.add(num);
            }
            // Check if any element from b is already in set
            for(int num: b){
                if(set.contains(num)){
                    return false;
                }
            }
            return true;
    }
}
