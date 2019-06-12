/**
 * BenchMark class for String, StringBuffer and StringBuilder.
 *
 * <p>Private instance data:
 * -original:String
 *
 * <p>Constructor:
 * +BenchMark()
 *
 * <p>Public methods:
 * +set()
 * +getTimeString():long
 * +toString():String
 */
public class BenchMark {
    /* private instance data */
    private String original;

    /** BenchMark constructor. */
    public BenchMark() {
        set();
    }

    /** BenchMark setter for the long string. */
    public void set() {
        int size = 16536;
        char c = 'a';
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            if (Character.getNumericValue(c) > 35) {
                c = 'a';
            }
            sb.append(c++);
        }
        original = sb.toString();
    }

    /** BenchMark getter for String. */
    public long getTimeString() {
        long start;
        long estimate;
        String reversed = "";
        start = System.nanoTime();
        for (char c : original.toCharArray()) {
            reversed = c + reversed;
        }
        estimate = System.nanoTime() - start;
        return estimate;
    }

    /** BenchMark string method. */
    public String toString() {
        return String.format(
                "Time: %d usec (String)",
                getTimeString() / 1000);
    }
}
