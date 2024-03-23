package GL_303_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GL_303_6 {
    public static void main(String[] args) {

        /*
        EXAMPLE 3 - Enhanced For Loop
         */
        String[] names = {"New York", "Dalls", "Las Vegas", "Florida"};
        for(String name : names) {
            System.out.println(name);
        }


        /*
        Example 4 - Calculate sum and average of array of elements
         */
        //random array of integers
        Random random = new Random();
        int length = 4;
        int[] randomNumbers = new int[length];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(10);
        }
        System.out.println("Random Array: " + Arrays.toString(randomNumbers));

        //Sum and Average:
        int sum = 0;
        double average = 0;
        for(int number : randomNumbers) {
            sum += number;
        }
        average = ((double) sum / randomNumbers.length);
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);


        /*
        Example 5 - Mean and Standard Deviation
         */
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        sum = 0;
        int sumSq = 0;
        double mean;
        double stdDev;

        //compute the sum and square sum using loop
        for(int i = 0; i < marks.length; i++) {
            //System.out.println("i is: " + i);
            sum += marks[i];
            sumSq += marks[i] * marks[i];
            //System.out.println("sum squared: " + sumSq);
        }

        mean = (double) sum / marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - (mean * mean));

        System.out.printf("mean: %.2f%n", mean);
        System.out.printf("Standard Deviation: %.2f%n", stdDev);


        /*
        Example 6
         */
        int i = 0;
        int element;
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 integers: ");
        for (i = 0; i < 10; i++) {
            arr[i] = scan.nextInt(); //enters all but the last element in the array
        }

        System.out.println("Enter an element: ");
        element = scan.nextInt();
        arr[i] = element;
        System.out.println("array: " + Arrays.toString(arr));



    }
}
