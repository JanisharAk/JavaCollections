package p9_HashSet;

import java.util.HashMap;
import java.util.Map;

public class C8_2Sum {
    /*
    If we use naive apprach then O(n^2) time and O(1) space
    if we use two pointer then O(nlogn) Time and O(1) Space
    if we use Hash Map or Dictionary - O(n) Time and O(n) Space
     */

//    Input: arr[] = {1, 5, 7, -1, 5}, target = 6
//    Output:  3
      public static void main(String[] args) {
          int[] arr = {1, 5, 7, -1, 5};
          int target = 6;
          System.out.println(countPairs(arr, target));

      }
      public static int countPairs(int[] arr, int target){
          Map<Integer, Integer> freq = new HashMap<>();
          int cnt = 0;

          for (int i = 0; i < arr.length; i++) {

              // Check if the complement (target - arr[i])
              // exists in the map. If yes, increment count
              if (freq.containsKey(target - arr[i])) { //freq.containsKey(x) is O(1) time.
                  cnt += freq.get(target - arr[i]);
              }

              // Increment the frequency of arr[i]
              freq.put(arr[i],
                      freq.getOrDefault(arr[i], 0) + 1);
          }
          return cnt;

      }
}

/*
Why Use HashMap?

Quick lookups: freq.containsKey(x) is O(1) time.
Stores how many times a number has appeared so far.
Lets us find target - current instantly.
Avoids nested loops and gives O(n) performance.
 */