package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter minutes from 1 to 1,000,000,000: ");
        int number = input.nextInt();

        int years = number/60/24/365;

        int days = number/60/24 - years*365;

        System.out.println(years+ " years and "+ days+ " days");
    }
}
