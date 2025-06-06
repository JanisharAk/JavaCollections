package p10_MapInterface.sub1_HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C13_3Sum {
    /*
    Input: arr[] = [1, 4, 45, 6, 10, 8], target = 13
    Output: true
    Explanation: The triplet [1, 4, 8] sums up to 13
     */

    // solution 1: naive approach with o(n3)
/*
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;
        System.out.println(check_3_Sum(arr, target));
    }

    public static boolean check_3_Sum(int[] arr, int target) {
        if (arr.length < 3) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

 */

    // Solution 2:- Hash Set - O(n^2) Time and O(n) Space.

/*
    static boolean hasTripletSum(int[] arr, int target) {
        int n = arr.length;

        // Fix the first element as arr[i]
        for (int i = 0; i < n - 2; i++) {

            // Hash set to store potential second elements
            Set<Integer> st = new HashSet<>();

            // Fix the third element as arr[j]
            for (int j = i + 1; j < n; j++) {
                int second = target - arr[i] - arr[j];

                // Search for second element in hash set
                if (st.contains(second)) {
                    return true;
                }

                // Add arr[j] as a potential second element
                st.add(arr[j]);
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        if (hasTripletSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
*/

// Sorting and Two Pointer - O(n^2) Time and O(1) Space
static boolean hasTripletSum(int[] arr, int target) {
    int n = arr.length;
    Arrays.sort(arr);

    // Fix the first element as arr[i]
    for (int i = 0; i < n - 2; i++) {

        // Initialize left and right pointers with
        // start and end of remaining subarray
        int l = i + 1, r = n - 1;

        int requiredSum = target - arr[i];
        while (l < r) {
            if (arr[l] + arr[r] == requiredSum)
                return true;
            if (arr[l] + arr[r] < requiredSum)
                l++;
            else if (arr[l] + arr[r] > requiredSum)
                r--;
        }
    }

    // If we reach here, then no triplet was found
    return false;
}

    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        if (hasTripletSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}