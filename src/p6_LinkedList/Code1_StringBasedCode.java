package p6_LinkedList;

import java.util.LinkedList;

public class Code1_StringBasedCode {
        public static void main(String[] args) {
            // Creating LinkedList object
            LinkedList<String> ll = new LinkedList<>();

            // add(E e)
            ll.add("Apple");
            ll.add("Mango");
            ll.add("Papaya");
            ll.add("Banana");
            ll.add("Grapes");
            System.out.println("After add(E e): " + ll);

            // element() - retrieves, but does not remove, the head (first element)
            System.out.println("element(): " + ll.element());

            // get(int index)
            System.out.println("get(2): " + ll.get(2)); // Papaya

            // getFirst()
            System.out.println("getFirst(): " + ll.getFirst());

            // getLast()
            System.out.println("getLast(): " + ll.getLast());

            // indexOf(Object o)
            System.out.println("indexOf(\"Banana\"): " + ll.indexOf("Banana"));

            // lastIndexOf(Object o)
            ll.add("Apple"); // Add duplicate for demonstration
            System.out.println("lastIndexOf(\"Apple\"): " + ll.lastIndexOf("Apple"));

            // offer(E e) - Adds at the end
            ll.offer("Orange");
            System.out.println("After offer(\"Orange\"): " + ll);

            // peek()
            System.out.println("peek(): " + ll.peek()); // Apple (head)

            // peekFirst()
            System.out.println("peekFirst(): " + ll.peekFirst());

            // peekLast()
            System.out.println("peekLast(): " + ll.peekLast());

            // poll() - retrieves and removes the head
            System.out.println("poll(): " + ll.poll());
            System.out.println("After poll(): " + ll);

            // pollFirst()
            System.out.println("pollFirst(): " + ll.pollFirst());
            System.out.println("After pollFirst(): " + ll);

            // pop() - removes and returns the first element
            System.out.println("pop(): " + ll.pop());
            System.out.println("After pop(): " + ll);

            // push(E e) - adds to the front
            ll.push("Kiwi");
            System.out.println("After push(\"Kiwi\"): " + ll);

            // remove() - removes and returns the head
            System.out.println("remove(): " + ll.remove());
            System.out.println("After remove(): " + ll);

            // size()
            System.out.println("size(): " + ll.size());

            // toString()
            System.out.println("toString(): " + ll.toString());

            // toArray()
            Object[] arr = ll.toArray();
            System.out.print("toArray(): ");
            for (Object fruit : arr) {
                System.out.print(fruit + " ");
            }
        }
    }


