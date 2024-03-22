package GL303_5;

import java.util.Scanner;

public class GL_303_5_1 {
    public static void main(String[] args) {
        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }

        int sum = 0;
        n = 1000;
        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);

        //Example 3 - Palindrome
        String original = "";
        String reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string to check for palindrome");
        original = scan.nextLine();
        int length = original.length();

        for(int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i); //builds the string backwards from the original string
        }
        if(original.equals(reverse)) {
            System.out.println("PALINDROME!");
        } else {
            System.out.println("IS NOT PALINDROME!");
        }

        //EXAMPLE 4
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }


    }
}