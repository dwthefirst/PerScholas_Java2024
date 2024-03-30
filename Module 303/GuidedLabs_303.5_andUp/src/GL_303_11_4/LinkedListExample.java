package GL_303_11_4;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.add("Item1");
        linkedlist.add("Item2");
        linkedlist.add("Item3");
        linkedlist.add("Item4");
        linkedlist.add("Item5");
        System.out.println(linkedlist);

        linkedlist.addFirst("First Item");
        linkedlist.add("Last Item");
        System.out.println(linkedlist);

        var firstElement = linkedlist.get(0);
        System.out.println("first element: " + firstElement + " | type: " + firstElement.getClass().getSimpleName());
        linkedlist.set(0, "Changed first item");
        System.out.println("first element: " + linkedlist.get(0) + " | type: " + firstElement.getClass().getSimpleName());
        Object firstVar2 = linkedlist.get(0);
        System.out.println();
        //System.out.println("first element: " + firstVar2 + " | type: " +firstVar2.getClass().getSimpleName());

        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

        linkedlist.add(0, "Newly added item!");
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist);


    }
}
