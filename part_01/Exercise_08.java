package Part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {

    private static final double radius = 3.14;

    public static void main(String[] args) {

        double area, perimeter;
        double radius = 3.14;
        area = Math.PI * radius * radius;
        perimeter = 2* Math.PI *radius;

        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ perimeter);
    }
}
