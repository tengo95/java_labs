package Part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {

        int population = 380_123_456;

        int populationChange;

        int yearInSec = 3*365*24*60*60;

        populationChange = (yearInSec/6) - (yearInSec/12) + (yearInSec/40);
        System.out.println(population += populationChange);

    }
}
