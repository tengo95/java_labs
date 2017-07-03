package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles to be driven: ");
        int miles = input.nextInt();

        System.out.print("Enter vehicle MPG: ");
        double mpg = input.nextDouble();

        System.out.print("Enter price per gallon of fuel: ");
        int price = input.nextInt();

        double cost = miles / mpg * price;
        System.out.println("Cost of journey: "+ cost);
    }
}