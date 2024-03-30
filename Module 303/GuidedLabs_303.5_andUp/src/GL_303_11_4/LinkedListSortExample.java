package GL_303_11_4;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListSortExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("Z");
        linkedList.add("h");

        System.out.println("Unsorted: " + linkedList);

        Collections.sort(linkedList);
        System.out.println("Sorted: " + linkedList);

        Collections.sort(linkedList, Collections.reverseOrder());
        System.out.println(("reverse order: ") + linkedList);

    }
}
