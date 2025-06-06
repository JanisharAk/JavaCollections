package p10_MapInterface.sub1_HashMap;

import java.util.HashMap;
import java.util.Map;

public class C12_RemoveMinimumElements {
    //Remove minimum elements such that no common elements exist in two arrays

    //    Input: arr[] = { 1, 2, 3, 4}, arr2[] = { 2, 3, 4, 5, 8 }
//    Output: 3
//    Explanation: We need to remove 2, 3 and 4 from any array.


    static int minRemove(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> countA = new HashMap<>();
        HashMap<Integer, Integer> countB = new HashMap<>();
        int res = 0;

        // Count elements of arr1
        for (int num : arr1) {
            countA.put(num, countA.getOrDefault(num, 0) + 1);
        }

        // Count elements of arr2
        for (int num : arr2) {
            countB.put(num, countB.getOrDefault(num, 0) + 1);
        }

        // Traverse through all common elements, and pick minimum
        // occurrence from two arrays
        for (int key : countA.keySet()) {
            if (countB.containsKey(key)) {
                res += Math.min(countA.get(key), countB.get(key));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3, 4, 5, 8};

        System.out.println(minRemove(arr1, arr2));
    }
}
