package Part_01;

/**
 * Part 1 Exercise 7:
 *      Print pi to the console using the following formula: note that this is not the complete series to
 *      compute the true number pi.
 *
 *      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 *
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

//        System.out.println ( 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) );

        int sum = 0;

        for (int i=1; i<=17; i+=2) {
            sum += i;
        }

        System.out.println ( 4.0 * (1 - (1/sum) ) );
    }
}
