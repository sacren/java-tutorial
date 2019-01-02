/**
 * Driver for Cylinder.
 */
import java.util.Scanner;

public class CylinderDriver {
    /** Prompt the user for input and instantiate. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        double radius;
        System.out.print("Enter cylinder radius: ");
        radius = inputStream.nextDouble();
        double height;
        System.out.print("Enter cylinder height: ");
        height = inputStream.nextDouble();
        System.out.print("Enter cylinder color: ");
        String color = inputStream.next();
        inputStream.close();
        Cylinder colorCylinder = new Cylinder(radius, height, color);
        Cylinder userCylinder = new Cylinder(radius, height);
        Cylinder defaultCylinder = new Cylinder();
        System.out.println();
        System.out.print(defaultCylinder);
        System.out.printf(
                "The default base area is %.2f%n"
                        + "The default surface area is %.2f%n"
                        + "The default volume is %.2f%n%n",
                defaultCylinder.getArea(), /* default cylinder base area */
                defaultCylinder.getSurfaceArea(), /* default cylinder surface area */
                defaultCylinder.getVolume()); /* default cylinder volume */
        System.out.print(userCylinder);
        System.out.printf(
                "The custom base area is %.2f%n"
                        + "The custom surface area is %.2f%n"
                        + "The custom volume is %.2f%n%n",
                userCylinder.getArea(), /* custom cylinder base area */
                userCylinder.getSurfaceArea(), /* custom cylinder surface area */
                userCylinder.getVolume()); /* custom cylinder volume */
        System.out.print(colorCylinder);
        System.out.printf(
                "The color cylinder base area is %.2f%n"
                        + "The color cylinder surface area is %.2f%n"
                        + "The color cylinder volume is %.2f%n"
                        + "The color cylinder is %s%n",
                colorCylinder.getArea(),
                colorCylinder.getSurfaceArea(),
                colorCylinder.getVolume(),
                colorCylinder.getColor());
    }

    private static boolean isInputValid(String s) {
        for (char c: s.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
