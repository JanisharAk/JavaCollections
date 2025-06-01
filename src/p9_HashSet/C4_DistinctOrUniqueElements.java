package p9_HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class C4_DistinctOrUniqueElements {
//    Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
//    Output: {12, 10, 9, 45, 2}
     public static void main(String[] args) {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        //Set<Integer> set = new HashSet<>();// it prints in order way.like incrasing order

         Set<Integer> set = new LinkedHashSet<>();

         for(int num: arr){
            set.add(num);
        }
         System.out.println(set);
   }
}
