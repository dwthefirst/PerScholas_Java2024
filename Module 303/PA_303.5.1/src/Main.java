import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        question1();
        question2();
        question3();

    }

    /*
        1. Write a program that uses nested for loops to print a multiplication table.
     */
    public static void question1() {
        System.out.printf("\n========Question 1========\n");
        for (int i = 1; i <= 12; i++) {
            //System.out.println(i + " ");
            for(int j = 1; j <=12; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }

    /*
       2. Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
        ❖	Examples:
        ➢	Enter 2 and 4. The gcd is 2.
        ➢	Enter 16 and 24.  The gcd is 8.
        ❖	How do you find the gcd?
        ➢	Name the two input integers n1 and n2.
        ➢	You know number 1 is a common divisor, but it may not be the gcd.
        ➢	Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
    */
    public static int question2() {
        System.out.printf("\n========Question 2========\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two positive integers to calculate the GCD:");

        int inputA = 0;
        int inputB = 0;

        //checking int input for first number
        while(true) {
            try {
                System.out.println("Please enter first number: ");
                inputA = Math.abs(scan.nextInt()); //change integers to absolute values
                break;
            } catch(InputMismatchException e) { //if the input is NOT a number
                scan.nextLine(); //eat the carriage return
            }
        }

        //checking int input for first number
        while(true) {
            try {
                System.out.println("Please enter the second number:");
                inputB = Math.abs(scan.nextInt()); //change integers to absolute values
                break;
            } catch(InputMismatchException e) { //if the input is NOT a number
                scan.nextLine(); //eat the carriage return
            }
        }

        int min = Math.min(inputA, inputB); //find the smallest number
        int gcf = 1;
        //loop through from the smallest number and decrement BACKWARDS
        for (int i = min; i > 0; i--) {
            //use modulo operator to find divisors (0 means it's a factor)
            //if the first number AND the second number are both divisible
            if(inputA % i == 0 && inputB % i == 0) {
                gcf = i;
                System.out.println("The GCD is: " + i);
                return gcf; //return the value and exit the loop
            }
        }
        return gcf; //return the first match (the smallest number should be 1)
    }


    /*
    Question 3
        ❑	Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
        ❑	In how many years will the tuition be doubled?
     */
    public static int question3() {
        System.out.printf("\n========Question 3========\n");
        double initialTuition = 10000;
        double tuition = initialTuition;
        final double percent = .07;
        int year = 0;
        for (int i = 0; tuition <= (initialTuition * 2); i++) { //loop until the tuition is greater than or equal to 20000
            System.out.printf("%-9s", "year: " + (i + 1));
            //System.out.println((1 + percent) + " * " + tuition + " = " + (1 + percent) * tuition);
            tuition  = (1 + percent) * tuition; //tuition = 1.07 * (currentTuition)
            System.out.printf("\ttuition = %.2f%n", tuition);
            year++;//increment year
        }
        System.out.println("The tuition will double in: " + year + " years.");
        return year;
    }
}