package p10_MapInterface.sub1_HashMap;

import java.util.HashMap;

public class C11_SubarrayWithGivenSum {
    //Subarray with Given Sum - Handles Negative Numbers

    /*
    Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
    Output: Sum found between indexes 2 and 4
    Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
    with Time Complexity: O(N2)
     */

    // solution 1: naive approach with
/*    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        checkSum(arr, sum);
    }

    static void checkSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int curr_sum = 0;

            // Try all subarrays starting with 'i'
            for (int j = i; j < arr.length; j++) {
                curr_sum += arr[j];

                if (curr_sum == sum) {
                    System.out.println("Sum found between indexes " + i + " and " + j);
                    return; // Done, exit method
                }
            }
        }
        System.out.println("No subarray found");
    }
}


 */


//Solution 2:- Prefix Sum and Hash Map - O(n) time and O(n) Space.

    public static void subArraySum(int[] arr, int n,
                                   int sum) {
        // cur_sum to keep track of cumulative sum till that point
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            cur_sum = cur_sum + arr[i];

 // check whether cur_sum - sum = 0, if 0 it means the sub array is starting from index 0-so stop
            if (cur_sum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
//if hashMap already has the value, means we already have subarray with the sum - so stop
            if (hashMap.containsKey(cur_sum - sum)) {
                start = hashMap.get(cur_sum - sum) + 1;
                end = i;
                break;
            }
            // if value is not present then add to hashmap
            hashMap.put(cur_sum, i);
        }
        // if end is -1 : means we have reached end without the sum
        if (end == -1) {
            System.out.println(
                    "No subarray with given sum exists");
        } else {
            System.out.println("Sum found between indexes "
                    + start + " to " + end);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {2, 12, -2, -20, 10};
        int n = arr.length;
        int sum = -10;

        // Function call
        subArraySum(arr, n, sum);
    }
}

/*
To solve the problem follow the below idea:---

The idea is to store the sum of elements of every prefix of the array in a hashmap, i.e,
every index stores the sum of elements up to that index hashmap. So to check if there is
a subarray with a sum equal to target_sum, check for every index i, and sum up to that
index as curr_sum. If there is a prefix with a sum equal to (curr_sum - target_sum), then
the subarray with the given sum is found.

Follow the given steps to solve the problem:---

= Create a Hashmap (hm) to store a key-value pair, i.e, key = prefix sum and value = its index,
  and a variable to store the current sum (curr_sum = 0).
= Traverse through the array from start to end.
= For every element update the curr_sum, i.e curr_sum = curr_sum + arr[i]
= If the sum is equal to target_sum then print that the subarray with the given sum is from 0 to i
= If there is any key in the HashMap which is equal to curr_sum - target_sum then print that the
  subarray with the given sum is from hm[curr_sum - target_sum] + 1 to i.
= Put the sum and index in the hashmap as a key-value pair.

 */