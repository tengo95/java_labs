package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        int invAmount = input.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();


        double investmentValue = invAmount;

        for (int i =1; i <= years; i++) {
            investmentValue =investmentValue + investmentValue*interestRate/100;
        }

        System.out.println(investmentValue);
    }
}

