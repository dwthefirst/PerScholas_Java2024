package PA303_7_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    ●	Task 1: Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
     */
    public static void task1() {
        System.out.println("\n==============QUESTION 1==============\n");
        int[] array = new int[3];
        array = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(array));
    }

    /*
    ●	Task 2: Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
     */
    public static void task2() {
        System.out.println("\n==============QUESTION 2==============\n");
        //?Hard code the values of the array
        /*
            divide the array by 2
            if its odd, get the integer and add 1
            if its even?
         */
        //2 lines?

        int[] numbers = {13, 5, 7, 68, 2};
        System.out.println("Middle value: " + numbers[numbers.length / 2]);
    }

    /*
        ●	Task 3: Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
     */
    public static void task3() {
        System.out.println("\n==============QUESTION 3==============\n");
        String[] stringArray = {"red", "green", "blue", "yellow"};
        System.out.println("original: " + Arrays.toString(stringArray));
        System.out.println("length: " + stringArray.length);
        String[] copy = stringArray.clone();
        System.out.println("copy: " + Arrays.toString(copy));
    }

    /*
        ●	Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.
     */
    public static void task4() {
        System.out.println("\n==============QUESTION 4==============\n");
        //array of random numbers
        Random random = new Random();
        int[] array = new int[5]; //length: 5
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Random Array: " + Arrays.toString(array));
        System.out.println("First index: " + array[0]);
        // System.out.println("Last index: " + array[array.length]); //ArrayIndexOutOfBoundsException
        System.out.println("Last index: " + array[array.length - 1]);
        //array[5] = 100; //ArrayIndexOutOfBoundsException

    }


    /*
   	●	Task 5: Write a program where you create an integer array with a length of 5.
        Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
    */
    public static void task5() {
        System.out.println("\n==============QUESTION 5==============\n");
        int[] array = new int[5]; //length: 5
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Array: " + Arrays.toString(array));

    }

    /*
   ●	Task 6: Write a program where you create an integer array of 5 numbers.
        Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
*/
    public static void task6() {
        System.out.println("\n==============QUESTION 6==============\n");
        int[] array = new int[5]; //length: 5
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        System.out.println("Array: " + Arrays.toString(array));

    }

    /*
        ●	Task 7: Write a program where you create an array of 5 elements.
        Loop through the array and print the value of each element, except for the middle (index 2) element.
*/
    public static void task7() {
        System.out.println("\n==============QUESTION 7==============\n");

        //array of random numbers
        Random random = new Random();
        int[] array = new int[5]; //length: 5
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            if (i != 2) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\nArray: " + Arrays.toString(array));

    }


    /*
        ●	Task 8: Write a program that creates a String array of 5 elements
        and swaps the first element with the middle element without creating a new array.
*/
    public static void task8() {
        System.out.println("\n==============QUESTION 8==============\n");

        String[] array = {"one", "two", "three", "four", "five"};
        System.out.println("Original: " + Arrays.toString(array));

        int middleIndex = array.length / 2; // should be the third element (index = 2)     5 / 2  = 2
        String temp = array[0]; //temp variable
        array[0] = array[middleIndex];
        array[middleIndex] = temp;
        System.out.println("Swapped array (first element with the middle): " + Arrays.toString(array));

    }


    /*
     Task 9 - Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
     Print the array in ascending order, and print the smallest and the largest element of the array. The output will look like the following:
        Array in ascending order: 0, 1, 2, 4, 9, 13
        The smallest number is 0
        The biggest number is 13

*/
    public static void task9() {
        System.out.println("\n==============QUESTION 9==============\n");

        int[] array = {4, 2, 9, 13, 1, 0};
        System.out.println("Original Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }


    /*
     Task 10 -  Create an array that includes an integer, 3 strings, and 1 double. Print the array.
*/
    public static void task10() {
        System.out.println("\n==============QUESTION 10==============\n");

        //Arrays can only be made of a single type
        //String[] objArray = {"One", "Two", "Three", 4.0};java: incompatible types: double cannot be converted to java.lang.String

        //Object is the root of all classes in Java
        Object[] objectArray = {"One", "Two", "Three", 4.0};
        System.out.println("Object array" + Arrays.toString(objectArray));
    }

    /*
 ●	Task 11: Write some Java code that asks the user how many favorite things they have.
      Based on their answer, you should create a String array of the correct size.
      Then ask the user to enter the things and store them in the array you created. Finally, print out the contents of the array.
    */
    public static void task11() {
        System.out.println("\n==============QUESTION 11==============\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int length = scan.nextInt();

        String[] favoriteThings = new String[length];
        scan.nextLine(); //eat the carriage return
        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.println("Enter your favorite thing: ");

            favoriteThings[i] = scan.nextLine();
        }
        System.out.println("Your favorite things are: ");

        int i = 0;
        for(String favoriteThing : favoriteThings) {
            //if last statement, print a period instead
            if(i == favoriteThings.length - 1) {
                System.out.print(favoriteThing + ". ");
            } else {
                System.out.print(favoriteThing + ", ");
            }
            i++;
        }
        //System.out.println(Arrays.toString(favoriteThings));
    }




    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();

    }
}
