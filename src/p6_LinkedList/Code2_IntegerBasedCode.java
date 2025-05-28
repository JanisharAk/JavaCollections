package p6_LinkedList;

import java.util.LinkedList;

public class Code2_IntegerBasedCode {
    public static void main(String[] args) {
        // Creating LinkedList object
        LinkedList<Integer> ll = new LinkedList<>();

        // add(E e)
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        System.out.println("After add(E e): " + ll);

        // element()
        System.out.println("element(): " + ll.element());

        // get(int index)
        System.out.println("get(2): " + ll.get(2));

        // getFirst()
        System.out.println("getFirst(): " + ll.getFirst());

        // getLast()
        System.out.println("getLast(): " + ll.getLast());

        // indexOf(Object o)
        System.out.println("indexOf(4): " + ll.indexOf(4));

        // lastIndexOf(Object o)
        ll.add(4); // Duplicate element for demonstration
        System.out.println("lastIndexOf(4): " + ll.lastIndexOf(4));

        // offer(E e)
        ll.offer(10);
        System.out.println("After offer(10): " + ll);

        // peek()
        System.out.println("peek(): " + ll.peek());

        // peekFirst()
        System.out.println("peekFirst(): " + ll.peekFirst());

        // peekLast()
        System.out.println("peekLast(): " + ll.peekLast());

        // poll()
        System.out.println("poll(): " + ll.poll());
        System.out.println("After poll(): " + ll);

        // pollFirst()
        System.out.println("pollFirst(): " + ll.pollFirst());
        System.out.println("After pollFirst(): " + ll);

        // pop()
        System.out.println("pop(): " + ll.pop());
        System.out.println("After pop(): " + ll);

        // push(E e)
        ll.push(99);
        System.out.println("After push(99): " + ll);

        // remove()
        System.out.println("remove(): " + ll.remove());
        System.out.println("After remove(): " + ll);

        // size()
        System.out.println("size(): " + ll.size());

        // toString()
        System.out.println("toString(): " + ll.toString());

        // toArray()
        Object[] arr = ll.toArray();
        System.out.print("toArray(): ");
        for (Object item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
