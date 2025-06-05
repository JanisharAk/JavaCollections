package p10_MapInterface.sub1_HashMap;

import java.util.HashMap;
import java.util.Map;

public class C5_CheckIfTwoArraysAreEqual {
//    Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
//    Output: true
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};
        /*
        solution 1.
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i<a.length; i ++
         {
             for(int i = 0; i<a.length; i ++
              {
                  if(a[i] != b[b]){
                     return false;}
              }
         }    return true;

         */

        System.out.println(checkIfTwoArrayAreSameOrNot(a, b));
    }
    public static boolean checkIfTwoArrayAreSameOrNot(int[] a, int[] b){
        if(a.length != b.length) return false;

        Map<Integer, Integer> freq = new HashMap<>();
        //count frequency
        for(int num : a){
            freq.put(num, freq.getOrDefault(num, 0 ) + 1);
        }
        // Compare with array b
        for (int num : b) {
            if (!freq.containsKey(num) || freq.get(num) == 0){
                return false;
            }
            freq.put(num, freq.get(num) - 1);//We decrement the count by 1 (frequencyMap.get(num)-1)
            //If b has the same elements as a, every number in b should exactly match the counts in frequencyMap.
        }
        return true;
    }
}
