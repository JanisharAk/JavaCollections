package p10_MapInterface.sub1_HashMap;

import java.util.HashMap;

public class C9_ArrayPairSumsDivisibleByK {
    //naive approach
//    Input: arr[] = [9, 7, 5, 3], k = 6
//    Output: True
//    We can divide the array into (9, 3) and (7, 5). Sum of both of these pairs
//    is a multiple of 6.
//    public static void main(String[] args) {
//        int[] arr = {9, 7, 5, 3};
//        int k = 5;
//        System.out.println(checkSumDivisible(arr, k));
//    }
//    public static boolean checkSumDivisible(int[] arr, int k) {
//        int n = arr.length;
//
//        if (n % 2 == 1)
//            return false;
//
//        int count = 0;
//
//        boolean[] vis = new boolean[n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//
//                // If pair is divisible increment the
//                // count and mark elements as visited
//                if ((arr[i] + arr[j]) % k == 0 &&
//                        !vis[i] && !vis[j]) {
//
//                    count++;
//                    vis[i] = true;
//                    vis[j] = true;
//                }
//            }
//        }
//
//        return (count == n / 2);
//    }


    //  SOLVE USING HASHMAP

    // Returns true if arr[0..n-1] can be divided into pairs
    // with sum divisible by k.
    static boolean canPairs(int ar[], int k)
    {
        // An odd length array cannot be divided into pairs
        if (ar.length % 2 == 1)
            return false;

        // Create a frequency array to count occurrences
        // of all remainders when divided by k.
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count occurrences of all remainders
        for (int i = 0; i < ar.length; i++) {
            int rem = ((ar[i] % k) + k) % k;
            if (!hm.containsKey(rem)) {
                hm.put(rem, 0);
            }
            hm.put(rem, hm.get(rem) + 1);
        }

        // Traverse input array and use freq[] to decide
        // if given array can be divided in pairs
        for (int i = 0; i < ar.length; i++) {

            // Remainder of current element
            int rem = ((ar[i] % k) + k) % k;

            // If remainder with current element divides k into two halves.
            if (2 * rem == k) {

                // Then there must be even occurrences of such remainder
                if (hm.get(rem) % 2 == 1)
                    return false;
            }

            // If remainder is 0, then there must be two elements with 0 remainder
            else if (rem == 0) {

                // Then there must be even occurrences of such remainder
                if (hm.get(rem) % 2 == 1)
                    return false;
            }

        // Else number of occurrences of remainder must be equal to number of occurrences of
            // k - remainder
            else {
                if (hm.get(k - rem) != hm.get(rem))
                    return false;
            }
        }
        return true;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 92, 75, 65, 48, 45, 35 };
        int k = 10;

        // Function call
        boolean ans = canPairs(arr, k);
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
