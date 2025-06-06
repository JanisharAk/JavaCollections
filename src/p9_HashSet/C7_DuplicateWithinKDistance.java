package p9_HashSet;

import java.util.HashSet;

public class C7_DuplicateWithinKDistance {

    public static void main(String[] args) {
        /*
        Input: k = 3, arr[] = [1, 2, 3, 4, 1, 2, 3, 4]
        Output: No
         */


            int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
            if (checkDuplicatesWithinK(arr, 3))
                System.out.println("Yes");
            else
                System.out.println("No");


    }

        public static boolean checkDuplicatesWithinK(int[] arr, int k){
            // Creates an empty hashset
            HashSet<Integer> set = new HashSet<>();

            // Traverse the input array
            for (int i=0; i<arr.length; i++)
            {
                // If already present n hash, then we found
                // a duplicate within k distance
                if (set.contains(arr[i]))
                    return true;

                // Add this item to hashset
                set.add(arr[i]);

                // Remove the k+1 distant item
                if (i >= k)
                    set.remove(arr[i-k]);
            }
            return false;
        }


}
