package p10_MapInterface.sub1_HashMap;

import java.util.HashMap;

public class C2_CountFrequenciesInArray {
    /*
Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
         5  1
     */
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        // Lets follow naive approach
//        int n = arr.length;
//        Boolean[] visited  = new Boolean[n];
//
//
//        for(int i  = 0; i < arr.length; i++){
//            // Skip if element is already counted
//            if (visited[i]) {
//                continue;
//            }
//            int count = 0;
//            for(int j  = 0; j < arr.length; j++){
//                if(arr[i] == arr[j]){
//                    visited[j] = true;
//                    count++;
//                }
//            }
//            System.out.println(arr[i] + " " + count);
//        }
//        Time Complexity : O(n2)
//        Auxiliary Space : O

        //Second way to solve is HashMap



            public static void main(String[] args) {
                int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

                // Create a HashMap to store the frequencies
                HashMap<Integer, Integer> frequencyMap = new HashMap<>();

                // Count frequencies
                for (int num : arr) {
                    if (frequencyMap.containsKey(num)) {//containsKey() Avoids Duplicates

                        // If number exists, increment its count
                        frequencyMap.put(num, frequencyMap.get(num) + 1);
                    } else {
                        // If number doesn't exist, add it with count 1
                        frequencyMap.put(num, 1);
                    }
                }

                // Print the frequencies
                for (int key : frequencyMap.keySet()) {
                    System.out.println(key + " " + frequencyMap.get(key));
                }
            }
        }

