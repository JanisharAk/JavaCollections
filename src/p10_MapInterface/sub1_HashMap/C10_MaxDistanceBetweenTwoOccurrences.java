package p10_MapInterface.sub1_HashMap;

import java.util.HashMap;

public class C10_MaxDistanceBetweenTwoOccurrences {
//    Input: arr = [1, 1, 2, 2, 2, 1]
//    Output: 5
//    Explanation: distance for 1 is: 5-0 = 5, distance for 2 is: 4-2 = 2, So max distance is 5.

    // Solution 1 using naive approach  with  O(n^2) Time and O(1) Space.

/*    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 1};

        System.out.println(maxDistance(arr));
    }
    static int maxDistance(int[] arr){
        int res = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                // check if two elements are equal
                if (arr[i] == arr[j]) {

                    // calculate the distance and update res
                    res = Math.max(res, j - i);
//                    j - i gives the distance between the current matching pair.
//                    res holds the maximum distance seen so far.
//                    Math.max(res, j - i) updates res only if the current distance is larger.
                }
            }
        }
        return res;
    }

 */

    //Solution 2: Using Hash Map or Dictionary - O(n) Time and O(n) Space

    /*
    An efficient solution to this problem is to use hashing. The idea is to traverse the
    input array and store the index of the first occurrence in a hash map. For every other
    occurrence, find the difference between the index and the first index stored in the
    hash map. If the difference is more than the result so far, then update the result.
     */

    static int maxDistance(int[] arr) {

        // Stores element to first index mapping
        HashMap<Integer, Integer> mp = new HashMap<>();
        int res = 0;

        for (int i = 0; i < arr.length; i++) {

            // If this is the first occurrence of the
            // element, store its index
            if (!mp.containsKey(arr[i]))
                mp.put(arr[i], i);

                // Else update max distance
            else
                res = Math.max(res, i - mp.get(arr[i]));
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 1};
        System.out.println(maxDistance(arr));
    }
}
