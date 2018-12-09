/**
 * Circle class
 *
 * <p>Two private instance variables:
 * Radius (of the type double) and color (of the type String), with default
 * value of 1.0 and "red", respectively.
 *
 * <p>Two overloaded constructors:
 * A default constructor with no argument, and a constructor which takes a
 * double argument for radius.
 *
 * <p>Two public methods:
 * getRadius() and getArea(), which return the radius and area of this
 * instance, respectively.
 */
public class Circle {
    private double radius;
    private String color;

    /** Default constructor initializing instance attributes. */
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    /** Constructor initializing attributes both default and customized. */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    /** Constructor with 2 parameters. */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** Public instance method for radius. */
    public double getRadius() {
        return radius;
    }

    /** Public method for circle diameter. */
    public double getDiameter() {
        return radius * 2;
    }

    /** Public method for circumference. */
    public double getCircumference() {
        return radius * 2 * Math.PI;
    }

    /** Public instance method for circle area. */
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
