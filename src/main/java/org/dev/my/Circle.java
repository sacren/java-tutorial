/**
 * Circle class
 *
 * <p>Private data with default values:
 * -radius:double = 1.0
 * -color:String = "red"
 *
 * <p>Constructor:
 * +Circle()
 * +Circle(radius:double)
 * +Circle(radius:double, color:String)
 *
 * <p>Public methods:
 * +getRadius():double
 * +getArea():double
 * +setRadius(radius:double):void
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

    /** Public method to reset radius. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Public method for Circle description. */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
