import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        /*
//            1. Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if statement to print out “Less than 10” if x is less than 10. Change x to equal 15, and notice the result (console should not display anything).
//         */
//        System.out.println("========\nQuestion 1\n========");
//        int x = 7;
//        System.out.println("x = " + 7);
//        if (x < 10) {
//            System.out.println("Less than 10");
//        }
//        x = 15;
//        System.out.println("x = 15");
//        if (x < 10) {
//            System.out.println("Less than 10");
//        }
//
//        /*
//            2. Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
//         */
//        System.out.println("========\nQuestion 2\n========");
//        x = 7;
//        System.out.println("x = " + 7);
//        if (x < 10) {
//            System.out.println("Less than 10");
//        } else {
//            System.out.println("Greater than 10");
//        }
//
//        x = 15;
//        System.out.println("x = 15");
//        if (x < 10) {
//            System.out.println("Less than 10");
//        } else {
//            System.out.println("Greater than 10");
//        }
//
//        /*
//        3. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else-if statement that prints out “Less than 10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
//         */
//        System.out.println("========\nQuestion 3\n========");
//        x = 15;
//        System.out.println("x = " + x);
//        if (x < 10) {
//            System.out.println("Less than 10");
//        } else if (x > 10 && x < 20) {
//            System.out.println("Between 10 and 20");
//        } else {
//            System.out.println("Greater than or equal to 20");
//        }
//
//        x = 50;
//        System.out.println("x = " + 50);
//        if (x < 10) {
//            System.out.println("Less than 10");
//        } else if (x > 10 && x < 20) {
//            System.out.println("Between 10 and 20");
//        } else {
//            System.out.println("Greater than or equal to 20");
//        }
//
//        /*
//        4. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
//         */
//        System.out.println("========\nQuestion 4\n========");
//        x = 15;
//        System.out.println("x = " + 15);
//        if (x < 10 || x > 20) {
//            System.out.println("Out of range");
//        } else if (x >= 10 && x <= 20) {
//            System.out.println("In range");
//        }
//
//        x = 5;
//        System.out.println("x = " + 5);
//        if (x < 10 || x > 20) {
//            System.out.println("Out of range");
//        } else if (x >= 10 && x <= 20) {
//            System.out.println("In range");
//        }
//
//        /*
//            5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
//                A: 90-100
//                B: 80-89
//                C: 70-79
//                D: 60-69
//                F: <60
//                Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range” if the score is less than 0 or greater than 100.
//         */
//        System.out.println("========\nQuestion 5\n========");
//        System.out.println("Please enter a number score: ");
//
//        Double grade = scan.nextDouble();
//        //System.out.println("You entered: " + grade);
//        if(grade >= 90 & grade <= 100) {
//            System.out.println("Grade is an: A");
//        } else if (grade >= 80 && grade <= 89) {
//            System.out.println("Grade is a: B");
//        } else if (grade >= 70 && grade <= 79) {
//            System.out.println("Grade is a: C");
//        } else if (grade >= 60 && grade <= 69) {
//            System.out.println("Grade is a: D");
//        } else if (grade < 60 && grade >= 0) {
//            System.out.println("Grade is a: F");
//        } else { //if score less than 0 or greater than 100
//            System.out.println("Score out of range");
//        }
//
//
//        /*
//            6. Write a program that accepts an integer between 1 and 7 from the user.
//            Use a switch statement to print out the corresponding weekday.
//            Print “Out of range” if the number is less than 1 or greater than 7. Do not forget to include “break” statements in each of your cases.
//         */
//        System.out.println("========\nQuestion 6\n========");
//        System.out.println("Enter a number 1 - 7:");
//        int userInput = scan.nextInt();
//
//        System.out.print("Today is: ");
//        switch(userInput) {
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Out of range");
//                break;
//        }
//        scan.nextLine(); //read/eat empty new line character

        /*
            7. Create a program that lets the users input their filing status and income. Display how much tax the user would have to pay according to status and income.
                ❑	The U.S. federal personal income tax is calculated based on the filing status and taxable income.
                ❑	There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.

         */
        System.out.println("========\nQuestion 7\n========");

        //getting status input
        System.out.println("Please enter your filing status: ( 1. Single, 2. Married Filing Jointly, 3. Married Filing Separately, and 4. Head of Household)");

        String statusInput = scan.nextLine();

        //getting income input
        System.out.println("Please enter your income: ");
        Double incomeInput = scan.nextDouble();

        double tax_total = 0;

        //check status first, then check income
        //SINGLE
        if (statusInput.equalsIgnoreCase("single") || statusInput.equals("1")) {
            System.out.print("Single Status -> ");
            double taxRate;
                if(incomeInput <= 8350) {
                    taxRate = .10;
                    System.out.println("tax rate: " + taxRate);
                    tax_total = taxRate * incomeInput;
                    System.out.println("Amount of Tax to pay: " + tax_total);
                } else if (incomeInput <= 33950) {
                    taxRate = .15;
                    System.out.println("tax rate: " + taxRate);
                    tax_total = taxRate * incomeInput;
                    System.out.println("Amount of Tax to pay: " + tax_total);
                } else if (incomeInput <= 82250) {
                    taxRate = .25;
                    System.out.println("tax rate: " + taxRate);
                    tax_total = taxRate * incomeInput;
                    System.out.println("Amount of Tax to pay: " + tax_total);
                } else if (incomeInput <= 171550) {
                    taxRate = .28;
                    System.out.println("tax rate: " + taxRate);
                    tax_total = taxRate * incomeInput;
                    System.out.println("Amount of Tax to pay: " + tax_total);
                } else if (incomeInput <= 372950) {
                    taxRate = .33;
                    System.out.println("tax rate: " + taxRate);
                    tax_total = taxRate * incomeInput;
                    System.out.println("Amount of Tax to pay: " + tax_total);
                } else if ( incomeInput >= 372951) {
                    taxRate = .35;
                    System.out.println("tax rate: " + taxRate);
                    tax_total = taxRate * incomeInput;
                    System.out.println("Amount of Tax to pay: " + tax_total);
                } else {
                    System.out.println("Out of range.");
                }
        }
        //Married Filing Jointly
        else if (statusInput.equalsIgnoreCase("Married Filing Jointly") || statusInput.equals("2")) {
            System.out.print("Married Filing Jointly -> ");
            double taxRate;
            if(incomeInput <= 16700) {
                taxRate = .10;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput <= 67900) {
                taxRate = .15;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput <= 137050) {
                taxRate = .25;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if ( incomeInput <= 208850) {
                taxRate = .28;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if ( incomeInput <= 372950) {
                taxRate = .33;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if ( incomeInput >= 372951) {
                taxRate = .35;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else {
                System.out.println("Out of range.");
            }
        }
        //Married Filing Separately
        else if (statusInput.equalsIgnoreCase("Married Filing Separately") || statusInput.equals("3")) {
            System.out.print("Married Filing Separately -> ");
            double taxRate;
            if(incomeInput <= 8350) {
                taxRate = .10;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput <= 33950) {
                taxRate = .15;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput <= 68525) {
                taxRate = .25;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput <= 104425) {
                taxRate = .28;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput <= 1086475) {
                taxRate = .33;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if ( incomeInput >= 186476) {
                taxRate = .35;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else {
                System.out.println("Out of range.");
            }
        }
        //Head of Household
        else if (statusInput.equalsIgnoreCase("Head of Household") || statusInput.equals("4")) {
            System.out.print("Head of Household -> ");
            double taxRate;
            if(incomeInput <= 11950) {
                taxRate = .10;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput <= 45500) {
                taxRate = .15;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput <= 117450) {
                taxRate = .25;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput <= 190200) {
                taxRate = .28;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput <= 372950) {
                taxRate = .33;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else if (incomeInput >= 372951) {
                taxRate = .35;
                System.out.println("tax rate: " + taxRate);
                tax_total = taxRate * incomeInput;
                System.out.println("Amount of Tax to pay: " + tax_total);
            } else {
                System.out.println("Out of range.");
            }
        } else {
            System.out.println("Not valid. Please try again.");
        }

    }
}