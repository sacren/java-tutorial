/**
 * Prompt user for the radius of a circle in floating point number, compute the
 * diameter, circumference, and area of the circle in double and print the
 * values rounded to 2 decimal places.
 */
import java.util.Scanner;

public class CircleComputation {
  public static void main(String[] args) {
    double radius = getRadius();
    computeCircle(radius);
  }

  /**
   * Ask the user for radius.
   */
  public static double getRadius() {
    Scanner inputStream = new Scanner(System.in);

    System.out.print("Enter the radius: ");
    double radius = inputStream.nextDouble();
    inputStream.close();

    return radius;
  }

  /**
   * Compute diameter, circumference, and area.
   */
  public static void computeCircle(double radius) {

    double diameter = radius * 2;
    double circumference = diameter * Math.PI;
    double area = Math.PI * radius * radius;

    System.out.printf("The diameter is %.2f%n"
                      + "The circumference is %.2f%n"
                      + "The area is %.2f%n",
                      diameter, circumference, area);
  }
}
