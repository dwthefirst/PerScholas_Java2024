package GL_303_11_6;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample implements Comparator<String> {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: (Printed)" + numbers);
        System.out.println("TreeMap: (entrySet.())" + numbers.entrySet());

        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("Updated TreeMap: " + numbers.entrySet());

        System.out.println("***EXAMPLE TWO***");
        TreeMap<String, Integer> n = new TreeMap<>();
        n.put("First", 1);
        n.put("Second", 2);
        n.put("Third", 3);
        System.out.println("TreeMap: " + n);

        String firstKey = n.firstKey();
        System.out.println("First key: " + firstKey);

        String lastKey = n.lastKey();
        System.out.println("Last key: " + lastKey);

        System.out.println("First entry: " + n.firstEntry());
        System.out.println("Last entry: " + n.lastEntry());

        System.out.println("***EXAMPLE THREE (TREEMAP COMPARATOR)***");
        TreeMap<String, Integer> tm = new TreeMap<>(new TreeMapExample());
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);



    }

    @Override
    public int compare(String num1, String num2) {
        int value = num1.compareTo(num2);

        //sorted in reverse
        if(value > 0) {
            return -1;
        } else if (value < 0 ) {
            return 1;
        } else {
            return 0;
        }

    }
}
