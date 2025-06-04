package p10_MapInterface.sub1_HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class C4_CountDistinctElementsInEveryWindow {
    //Count Distinct Elements In Every Window of Size K

//    Input: arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
//    Output: [3, 4, 4, 3]
     public static void main(String[] args) {
         int arr[] = {1, 2, 1, 3, 4, 2, 3};
         int k = 4;
         //int count = 0;
         ArrayList<Integer> res = countDistinct(arr, k);
         for (int ele : res) {
             System.out.print(ele  + " ");
         }
     }

         static ArrayList<Integer> countDistinct(int[] arr, int k) {
             int n = arr.length;
             ArrayList<Integer> res = new ArrayList<>();

             // Iterate over every window
             for (int i = 0; i <= n - k; i++) {

                 // Hash Set to count unique elements
                 HashSet<Integer> st = new HashSet<>();
                 for (int j = i; j < i + k; j++)
                     st.add(arr[j]);

                 // Size of set denotes the number of unique elements
                 // in the window
                 res.add(st.size());
             }

             return res;
         }
}
