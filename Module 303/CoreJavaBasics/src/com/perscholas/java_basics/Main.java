package com.perscholas.java_basics;

/*
    PA 303.2.1 - Practice Assignment - Core Java - Variables
 */
public class Main {
    public static void main(String[] args) {
        /*
            1. Write a program that declares two integer variables, assigns an integer to each, and adds them together.
            Assign the sum to a variable. Print out the result.
         */
        System.out.println("-------\nQuestion 1 \n------");
        int num1 = 3;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);

        /*
            2. Write a program that declares two double variables, assigns a number to each, and adds them together.
            Assign the sum to a variable. Print out the result.
         */
        System.out.println("-------\nQuestion 2 \n------");
        double a = 100.50;
        double b = 50.40;
        double sumDouble = a + b;
        System.out.println(a + " + " + b + " = " + sumDouble);

        /*
            3. Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
            Assign the sum to a variable. Print out the result. What variable type must the sum be?
         */
        System.out.println("-------\nQuestion 3 \n------");
        int c = 4;
        double d = 43.23;
        double sumDoubleInt = c + d;
        System.out.println(c + " + " + d + " = " + sumDoubleInt + " (variable type of sum must be Double)");

        /*
            4. Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
            Assign the result to a variable. Print out the result. Now change the larger number to a decimal.
            What happens? What corrections are needed?
         */
        System.out.println("-------\nQuestion 4 \n------");
        int e = 6;
        int f = 18;
        int quotient = f / e;
        System.out.println(f + " / " + e + " = " + quotient);
        System.out.println("An error occured when chacing larger decimal to a decimal: java: incompatible types: possible lossy conversion from double to int");
        System.out.println("(Changing larger number to a decimal requires to change the type to double.)");
        double f2 = 18.75;
        System.out.println(f2 + " / " + e + " = " + f2 / e);

        /*
            5. Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
            Assign the result to a variable. Print out the result.
            Now, cast the result to an integer. Print out the result again.
         */
        System.out.println("-------\nQuestion 5 \n------");
        double g = 2.75;
        double h = 10.50;
        double quotient2 = h / g;
        System.out.println(h + " / " + g + "= " + quotient2);
        int quotient2Cast = (int) quotient2;
        System.out.println(quotient2Cast);

        /*
            6. Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
            Declare a variable q and assign y/x to it and print q.
            Now, cast y to a double and assign it to q. Print q again.
         */
        System.out.println("-------\nQuestion 6 \n------");
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println(x + " / " + y + " = " + q);
        q = (double) y; //cast y to a double
        System.out.println("q = " + q + " (y cast to double)");

        /*
            7. Write a program that declares a named constant and uses it in a calculation. Print the result.
         */
        System.out.println("-------\nQuestion 7 \n------");
        final double PI = 3.1415926535;
        System.out.println("PI = " + PI);
        int radius = 4;
        double area = PI * (radius * radius);
        System.out.println("PI * 4^2 = " + area);

        /*
            8. Write a program where you create three variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product.
            Create two more variables called subtotal and totalSale and complete an “order” for
                three items of the first product,
                four items of the second product,
                and two items of the third product.
            Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.
         */
        System.out.println("--------\nQuestion 8: \n--------");
        double coffee = 2.50;
        double tea = 1.50;
        double hotCoco = 2.00;

        double subtotal;
        double totalSale;

        double coffeeOrder = 3 * coffee;
        System.out.println("#3 coffees * " + coffee + "(cost) = " + coffeeOrder);
        double teaOrder = 4 * tea;
        System.out.println("#4 teas * " + tea + "(cost) = " + teaOrder);
        double hotCocoOrder = 2 * hotCoco;
        System.out.println("#2 hot Cocos * " + hotCoco + "(cost) = " + hotCocoOrder);

        subtotal = coffeeOrder + teaOrder + hotCocoOrder;
        System.out.println("subtotal: " + subtotal);

        final double SALES_TAX = .15;
        System.out.println("SALES TAX: " + SALES_TAX);

        totalSale = (subtotal * (SALES_TAX)) + subtotal; //total should = 20.125

        System.out.println("total: " + totalSale);

    }
}
