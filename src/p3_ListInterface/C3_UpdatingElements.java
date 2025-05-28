package p3_ListInterface;

import java.util.ArrayList;
import java.util.List;

public class C3_UpdatingElements {
    /*
    if we want to change the element, it can be done using the set() method.
    Since List is indexed, the element which we wish to change is referenced
    by the index of the element. This method takes an index and the updated
    element which needs to be inserted at that index.
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("c");
        System.out.println("List before update : " + list);

        list.set(1,"D");
        System.out.println("After list got updated : "+ list);

    }
}
