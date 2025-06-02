package p9_HashSet;

import java.util.Arrays;

public class C10_LongestConsecutiveSubsequence {
    /*
Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
Output: 4
Explanation: The subsequence [1, 3, 4, 2] is the longest subsequence of consecutive elements
     */

    // we are using sorting and time complexity will be O(n*log n)
    // Solution 1
    static int longestConsecutive(int[] arr) {

        // Sort the array
        Arrays.sort(arr);

        int res = 1, cnt = 1;

        // Find the maximum length by traversing the array
        for (int i = 1; i < arr.length; i++) {

            // Skip duplicates
            if (arr[i] == arr[i - 1])
                continue;

            // Check if the current element is equal
            // to previous element + 1
            if (arr[i] == arr[i - 1] + 1) {
                cnt++;
            } else {
                // Reset the count
                cnt = 1;
            }

            // Update the result
            res = Math.max(res, cnt);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 1, 9, 4, 5, 3 };
        System.out.println(longestConsecutive(arr));
    }

}
// Solution 2. using hashing to solve with O(n) Time and O(n) Space

/*
static int longestConsecutive(int[] arr) {
        Set<Integer> st = new HashSet<>();
        int res = 0;

        // Hash all the array elements
        for (int val : arr)
            st.add(val);

        // Check each possible sequence from the start then update optimal length
        for (int val : arr) {

            // If current element is the starting element of a sequence
            if (st.contains(val) && !st.contains(val - 1)) {

                // Then check for next elements in the sequence
                int cur = val, cnt = 0;
                while (st.contains(cur)) {

                    // Remove this number to avoid recomputation
                    st.remove(cur);
                    cur++;
                    cnt++;
                }

                // Update optimal length
                res = Math.max(res, cnt);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(longestConsecutive(arr));
    }
 */