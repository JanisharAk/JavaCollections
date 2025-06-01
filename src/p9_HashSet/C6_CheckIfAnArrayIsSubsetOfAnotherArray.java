package p9_HashSet;

import java.util.HashSet;

public class C6_CheckIfAnArrayIsSubsetOfAnotherArray {
    /*
Input: a[] = [11, 1, 13, 21, 3, 7], b[] = [11, 3, 7, 1]
Output: true

Input: a[]= [1, 2, 3, 4, 5, 6], b = [1, 2, 4]
Output: true

Input: a[] = [10, 5, 2, 23, 19], b = [19, 5, 3]
Output: false
     */
    public static void main(String[] args) {
        int[] a ={11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};
        boolean result = subSetOfAnother( a, b);
        System.out.println("Result of this = " + result);
    }


    public static boolean subSetOfAnother(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            if (!set.contains(num)) {
                return false;  // If any element of b is not in a
            }
        }
        return true; // All elements of b found in a


    }
}
