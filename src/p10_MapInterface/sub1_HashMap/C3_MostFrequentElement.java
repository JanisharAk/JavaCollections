package p10_MapInterface.sub1_HashMap;

import java.util.HashMap;

public class C3_MostFrequentElement {
    public static void main(String[] args) {
        int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
        System.out.println(mostFrequentELement(arr));
    }
//    static int mostFrequentELement(int[] arr){
//        int n = arr.length;
//       // int count = 0;
//        int maxCount = 0;
//        int res = 0;
//
//        for(int i =0; i< n;i++){
//            int count = 0;
//            for(int j = 0; j < n; j++)
//                if(arr[i] == arr[j])
//                    count++;
//            if(count > maxCount || (count == maxCount && arr[i] > res)){
//                maxCount = count;
//                res = arr[i];
//            }
//        }return res;

    // solution 2 using hashmap

    static int mostFrequentELement(int[] arr) {
        int n = arr.length;

        // Insert all elements in hash map.
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i  = 0; i< arr.length; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);// This checks if the element arr[i] exists in the map:
                                     // If it does, returns its current value.If it doesn't,
                                     // returns 0 (the default).
        }
        // find the max frequency
        int maxCnt = 0, res = -1;
        for (var entry : freq.entrySet()) {
            int val = entry.getKey(); // gets the key
            int cnt = entry.getValue(); // gets the vaule
            if (maxCnt < cnt || (cnt == maxCnt && val > res)) {
                res = val;
                maxCnt = cnt;
            }
        }

        return res;

    }
}
