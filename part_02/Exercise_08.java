package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1,000,000,000: ");
        int number = input.nextInt();

        int i = 0;

        while (i < 1_000_000_000) {
            if (i == number) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
