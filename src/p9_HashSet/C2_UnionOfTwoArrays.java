package p9_HashSet;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.awt.geom.Rectangle2D.union;

public class C2_UnionOfTwoArrays {
    /*
    Input: a[] = {1, 1, 2, 2, 2, 4}, b[] = {2, 2, 4, 4}
    Output: {1, 2, 4}
     */
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 2, 2, 4};
        int[] array2 = {1, 2, 4};

        Set<Integer> unionSet = unionMethod(array1, array2);// unionSet calling the union method
        // which contains two parametere as arrray
//        You are declaring a variable named unionSet of type Set<Integer>.
//        You are assigning it the return value of a method call: union(array1, array2).
//         The method union() is being called independently. It just happens to return a Set.

        System.out.println("Union of arrays: " + unionSet);
    }
        public static Set<Integer> unionMethod(int[] arr1, int[] arr2){
            Set<Integer> set = new HashSet<>();
            for(int num: arr1){
                set.add(num);
            }
            for(int num: arr2){
                set.add(num);
            }return set;

    }
}
