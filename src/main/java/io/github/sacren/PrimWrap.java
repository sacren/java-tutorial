/**
 * PrimWrap class.
 *
 * <p>Private instance data:
 * -byteObj:Byte
 * -shortObj:Short
 * -intObj:Integer
 * -longObj:Long
 * -floatObj:Float
 * -dblObj:Double
 * -charObj:Character
 * -boolObj:Boolean
 *
 * <p>Constructor:
 * +PrimWrap()
 *
 * <p>Public methods:
 * +set():void
 * +getByte():Byte
 * +getShort():Short
 * +getChar():char
 * +toString():String
 */

public class PrimWrap {
    /* private instance data */
    private Byte byteObj;
    private Short shortObj;
    private Integer intObj;
    private Long longObj;
    private Float floatObj;
    private Double dblObj;
    private Character charObj;
    private Boolean boolObj;

    /** PrimWrap constructor. */
    public PrimWrap() {
        set();
    }

    /** PrimWrap setter of instance data. */
    public void set() {
        byteObj = Byte.MAX_VALUE; /* auto-box from byte to Byte */
        shortObj = Short.MAX_VALUE; /* auto-box from short to Short */
        intObj = Integer.MAX_VALUE; /* auto-box from int to Integer */
        longObj = Long.MAX_VALUE; /* auto-box from long to Long */
        floatObj = Float.MAX_VALUE; /* auto-box from float to Float */
        dblObj = Double.MAX_VALUE; /* auto-box from double to Double */
        charObj = 'X'; /* auto-box from char to Character */
        boolObj = true; /* auto-box from boolean to Boolean */
    }

    /** PrimWrap getter for Byte object. */
    public Byte getByte() {
        Number num = byteObj;
        return num.byteValue(); /* auto-box from byte to Byte */
    }

    /** PrimWrap getter for Short object. */
    public Short getShort() {
        return Short.parseShort(shortObj.toString());
    }

    /** PrimWrap getter for char type. */
    public char getChar() {
        return charObj; /* auto-unboxing */
    }

    /** PrimWrap string method. */
    public String toString() {
        return String.format(
                "=== Wrapper classes for primitive types ===%n%n"
                        + "Byte object:            %d%n"
                        + "Short object:           %d%n"
                        + "Integer object:         %d%n"
                        + "Long object:            %d%n"
                        + "Float object:           %f%n"
                        + "Double object:          %f%n"
                        + "Character object:       %c%n"
                        + "Boolean object:         %b%n%n"
                        + "=== Number and Byte wrappers ===%n%n"
                        + "Number object in Byte value: %d%n%n"
                        + "=== Character to char ===%n%n"
                        + "%c%n%n"
                        + "=== Parse Short string ===%n%n"
                        + "%d",
                byteObj,
                shortObj,
                intObj,
                longObj,
                floatObj,
                dblObj,
                charObj,
                boolObj,
                getByte(),
                getChar(),
                getShort());
    }
}
