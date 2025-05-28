package p3_ListInterface;

import java.util.ArrayList;
import java.util.List;

public class C1_UseOfListInterface {
    public static void main(String[] args) {
        // Creating a List of Strings using ArrayList
        List<String> list = new ArrayList<>();

        // Adding elements in List
        list.add("Java");
        list.add("Python");
        list.add("DSA");
        list.add("C++");
        System.out.println("Print the list : ");

        //iterate through the list
        for(String s : list){
            System.out.println(s);
        }
        // Accessing elements
        System.out.println("Element at Index 1: "+ list.get(1));

        // Updating elements
        list.set(1, "JavaScript");
        System.out.println("Updated List: " + list);

        // Removing elements
        list.remove("C++");
        System.out.println("List After Removing Element: " + list);
    }
}
