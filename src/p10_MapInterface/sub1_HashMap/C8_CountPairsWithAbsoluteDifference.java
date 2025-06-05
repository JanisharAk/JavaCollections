package p10_MapInterface.sub1_HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class C8_CountPairsWithAbsoluteDifference {
    /*
    Count pairs with absolute difference equal to k
Input: arr[] = [1, 4, 1, 4, 5], k = 3
Output: 4

     solution 1:
     *
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 5};
        int k = 3;
        System.out.println(checkAbsoluteDifference(arr, k));
    }
    public static int  checkAbsoluteDifference(int[] arr, int k){
        int count = 0;
        for(int i = 0; i < arr.length; i++){

            for(int j = 1; j < arr.length; j++){
                if(arr[j] - arr[i] == k){
                    count++;
                }
            }
        }
        return count;
        // It has :O(n^2) Time and O(1) Space
    } */

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 5};
        int k = 3;
        System.out.println(checkAbsoluteDifference(arr, k));
    }

    public static int checkAbsoluteDifference(int[] arr, int k) {
        Arrays.sort(arr); // Step 1: Sort the array
        int count = 0;
        int n = arr.length;

        int left = 0;
        int right = 1;

        while (right < n) {
            int diff = arr[right] - arr[left];

            if (left == right || diff < k) {
                right++;
            } else if (diff > k) {
                left++;
            } else { // diff == k
                int leftVal = arr[left];
                int rightVal = arr[right];
                int leftCount = 0;
                int rightCount = 0;

                // Count duplicates of leftVal
                while (left < n && arr[left] == leftVal) {
                    leftCount++;
                    left++;
                }

                // Count duplicates of rightVal
                while (right < n && arr[right] == rightVal) {
                    rightCount++;
                    right++;
                }

                count += leftCount * rightCount;
            }
        }

        return count;
    }
}