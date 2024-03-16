import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
            1. Write a program that declares an integer a variable x, assigns the value 2 to it, and prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results, write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
         */
        System.out.println("==========\nQuestion 1\n==========");
        int x = 2;
        System.out.println("Binary String of " + x + " : " + Integer.toBinaryString(x));
        x = x << 1;
        //predicted value - the value should be 4?
        System.out.println("left shift of 1: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        System.out.println("-------");
        x = 9;
        System.out.println("Binary String of " + x + " : " + Integer.toBinaryString(x));
        x = x << 1;
        //predicted value - the value should be 4?
        System.out.println("left shift of 1: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        System.out.println("-------");
        x = 17;
        System.out.println("Binary String of " + x + " : " + Integer.toBinaryString(x));
        x = x << 1;
        //predicted value - the value should be 4?
        System.out.println("left shift of 1: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        System.out.println("-------");
        x = 88;
        System.out.println("Binary String of " + x + " : " + Integer.toBinaryString(x));
        x = x << 1; //predicted value - the value should be 4?
        System.out.println("left shift of 1: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        /*
            2. Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.
         */
        System.out.println("==========\nQuestion 2\n==========");
        int x2 = 150;
        System.out.println("Binary String of " + x2 + " : " + Integer.toBinaryString(x2));
        x2 = x2 >> 2; //predicted value - the value should be 00100101 = 37
        System.out.println("right shift of 2: " + x2);
        System.out.println("Binary String: " + Integer.toBinaryString(x2));

        System.out.println("-------");
        x2 = 225; //10110000
        System.out.println("Binary String of " + x2 + " : " + Integer.toBinaryString(x2));
        x2 = x2 >> 2; //predicted value - the value should be 0011 1000 = 56
        System.out.println("right shift of 2: " + x2);
        System.out.println("Binary String: " + Integer.toBinaryString(x2));

        System.out.println("-------");
        x2 = 1555;
        System.out.println("Binary String of " + x2 + " : " + Integer.toBinaryString(x2));
        x2 = x2 >> 2; //predicted value - the value should be 00110000100 = 388
        System.out.println("right shift of 2: " + x2);
        System.out.println("Binary String: " + Integer.toBinaryString(x2));

        System.out.println("-------");
        x2 = 32456;
        System.out.println("Binary String of " + x2 + " : " + Integer.toBinaryString(x2));
        x2 = x2 >> 2; //predicted value - the value should be 001111110110010 = 8114
        System.out.println("right shift of 2: " + x2);
        System.out.println("Binary String: " + Integer.toBinaryString(x2));

        /*
            3.	Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
            Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
            Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
         */
        System.out.println("==========\nQuestion 3\n==========");
        int x3 = 7; //0111
        int y = 17;  //10001
        // & AND Bitwise
        int z = x3 & y ; //prediction: 00000111 | 00010001 = 0001
        System.out.println("Binary of x(" + x3 + "): " + "\t\t" + Integer.toBinaryString(x3));
        System.out.println("Binary of y(" + y + "): " + "\t\t" + Integer.toBinaryString(y));
        System.out.println("The result of AND bitwise (binary): \t" + Integer.toBinaryString(z));
        System.out.println("The result of AND bitwise (decimal): \t" + z);


        /*
            4. Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
             As before, write a comment that indicates what you predict the values to be before printing them out.
         */
        System.out.println("==========\nQuestion 4\n==========");
        // | OR Bitwise
        //  Prediction:
        //  00111   (7)
        //  10001   (17)
        //  1   0   1   1   1 (Binary Prediction)
        //  16  8   4   2   1 (16 + 4 + 2 + 1) = 23 (Decimal Prediction)
        int or = x3 | y;
        System.out.println("The result of OR bitwise (decimal): " + or);
        System.out.println("The result of OR bitwise (binary): " + Integer.toBinaryString(or));

        /*
            5. Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value.
            Print the value before and after the increment operator.
         */
        System.out.println("==========\nQuestion 5\n==========");
        int a = 5;
        System.out.println("a = " + 5);
        System.out.println("Before postfix increment: " + a);
        a++;
        System.out.println("After postfix increment: " + a);

        /*
            6. Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
            Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
         */
        System.out.println("==========\nQuestion 6\n==========");
        //1. regular addition
        System.out.println("Method 1: Regular addition");
        int b = 5;
        System.out.println("b = " + b);
        b = b + 1;
        System.out.println("b + 1 = " + b);
        b = b + 1;
        System.out.println("b + 1 = " + b);

        //2. Postfix-Increment
        System.out.println("Method 2: Postfix-Increment");
        b = 5;
        System.out.println("b = " + b);
        b++;
        System.out.println("b++ = " + b);
        b++;
        System.out.println("b++ = " + b);


        //3. Addition Assignment
        System.out.println("Method 3: Prefix-Increment");
        b = 5;
        System.out.println("b = " + b);
        b += 1;
        System.out.println("b += " + b);
        b += 1;
        System.out.println("b += " + b);

        /*
            7. Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
            Create another variable sum and assign the value of ++x added to y, and print the result.
            Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program.
            Notice what the value of the sum is.
            The first configuration incremented x, and THEN calculated the sum,
                while the second configuration calculated the sum, and THEN incremented x.
         */
        System.out.println("==========\nQuestion 7\n==========");
        int x7 = 5;
        int y7 = 8;
        System.out.println("Post-fix operator: ");
        System.out.println("x = " + x7);
        System.out.println("y = " + y7);
        int sum = ++x7 + y7; //prediction: (5 + 1) + 8 = 14
        //System.out.println("++x = " + x7);
        System.out.println("++x" + " + " + "y" + " = " + sum);

        System.out.println("\nPrefix Operator: ");
        x7 = 5;
        System.out.println("x = " + x7);
        System.out.println("y = " + y7);
        sum = (x7++) + y7; //prediction: (5) + 8 = 13 (the variable x is incremented AFTER the calculations)
        System.out.println("x" + "++ + " + "y" + " = " + sum);






    }
}