package p9_HashSet;

import java.util.HashSet;
import java.util.Set;

public class C9_OnlyRepeatingElement {
    /*
    Input: arr[] = [1, 3, 2, 3, 4]
    Output: 3
    Explanation: The number 3 is the only repeating element.
     */

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4};
        int duplicate = findOnlyRepeatingElement(arr);
        System.out.println("Only repeating element: " + duplicate);
    }

    public static int findOnlyRepeatingElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return num; // First repeating element
            }
            set.add(num);
        }
        return -1; // If no duplicate found
    }
}
