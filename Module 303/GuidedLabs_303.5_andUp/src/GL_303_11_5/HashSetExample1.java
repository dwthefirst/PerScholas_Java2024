package GL_303_11_5;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);

        System.out.println("***EXAMPLE TWO***");
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        numbers.addAll(evenNumbers);
        System.out.println("Union: " + numbers);

        System.out.println("***EXAMPLE THREE***");
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference: " + primeNumbers);

        System.out.println("***EXAMPLE FOUR***");
        HashSet<String> h = new HashSet<>();

        h.add("Apple");
        h.add("Grapes");
        h.add("Mango");
        h.add("Orange");
        h.add("Fig");
        h.add("Apple"); //duplicate
        h.add("Grapes"); //duplicate
        System.out.println("HashSet: " + h);

        h.add(null);
        h.add(null);
        System.out.println("HashSet: " + h);

        for(String str : h) {
            System.out.println(" ----> " + str);
        }

    }
}
