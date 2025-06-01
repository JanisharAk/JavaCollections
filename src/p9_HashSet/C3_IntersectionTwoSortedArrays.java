package p9_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class C3_IntersectionTwoSortedArrays {
    /*
    int[] a = {1, 2, 3, 2, 1};
    int[] b = {3, 2, 2, 3, 3, 2};
    Output: 3 2
     */
    // Function to find intersection of two arrays
    static List<Integer> intersection(int[] a, int[] b) {

        // Put all elements of a[] in sa
        HashSet<Integer> sa = new HashSet<>();
        for (int num : a) {
            sa.add(num);
        }

        List<Integer> res = new ArrayList<>();

        // Traverse through b[]
        for (int num : b) {

            // If the element is in sa
            if (sa.contains(num)) {
                res.add(num);          // Add it to the result array
                sa.remove(num);        // Erase it from sa to avoid duplicates
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        List<Integer> res = intersection(a, b);

        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
/*
Related Articles:

Intersection of Two Arrays with Distinct Elements
Intersection of Two Sorted Arrays
Intersection of Two Sorted Arrays with Distinct Elements
Union and Intersection of Two Unsorted Arrays
Union and Intersection of Two Sorted Arrays

 */