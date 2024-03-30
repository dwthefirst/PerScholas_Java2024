package GL_303_11_5;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> num_Treeset = new TreeSet<>();
        num_Treeset.add(20);
        num_Treeset.add(5);
        num_Treeset.add(15);
        num_Treeset.add(25);
        num_Treeset.add(10);

        Iterator<Integer> iterSet = num_Treeset.iterator();
        System.out.println("TreeSet using Iterator: ");
        //Access TreeSet elements using Iterator
        while(iterSet.hasNext()) {
            System.out.print(iterSet.next());
            System.out.print(", ");
        }

        //System.out.println();
        System.out.println("\n***EXAMPLE TWO***");
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.addAll(List.of(2, 5, 6));
        System.out.println("Tree set: " + numbers);
        boolean v1 = numbers.remove(5);
        System.out.println("is 5 removed? " + v1);
        boolean v2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + v2);

        System.out.println("\n***EXAMPLE THREE***");
        numbers = new TreeSet<>(List.of(2, 5, 6));
        System.out.println(numbers);
        System.out.println("first number: " + numbers.first());
        System.out.println("last number: " + numbers.last());

    }
}
