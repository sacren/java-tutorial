/**
 * Patt2D class for 2-D patterns.
 *
 * <p>Public methods:
 * +getEmptySq():String
 * +getTriBotL():String
 * +getTriTopL():String
 * +getTriBotR():String
 * +getTriTopR():String
 * +getMirrorZ():String
 * +getLetterZ():String
 * +getHrGlass():String
 * +getHrGlBox():String
 * +getParall():String
 * +getSolidSq():String
 * +getChecker():String
 * +toString():String
 *
 * <p>#
 *    # #
 *    # # #
 *    # # # #
 *    # # # # #
 *    # # # # # #
 *    # # # # # # #
 *    # # # # # # # #
 *          (a)
 *
 * <p># # # # # # # #
 *    # # # # # # #
 *    # # # # # #
 *    # # # # #
 *    # # # #
 *    # # #
 *    # #
 *    #
 *          (b)
 *
 * <p># # # # # # # #
 *      # # # # # # #
 *        # # # # # #
 *          # # # # #
 *            # # # #
 *              # # #
 *                # #
 *                  #
 *          (c)
 *
 *               <p>#
 *                # #
 *              # # #
 *            # # # #
 *          # # # # #
 *        # # # # # #
 *      # # # # # # #
 *    # # # # # # # #
 *          (d)
 *
 * <p># # # # # # #
 *    #           #
 *    #           #
 *    #           #
 *    #           #
 *    #           #
 *    # # # # # # #
 *         (e)
 *
 * <p># # # # # # #
 *      #
 *        #
 *          #
 *            #
 *              #
 *    # # # # # # #
 *         (f)
 *
 * <p># # # # # # #
 *              #
 *            #
 *          #
 *        #
 *      #
 *    # # # # # # #
 *         (g)
 *
 * <p># # # # # # #
 *      #       #
 *        #   #
 *          #
 *        #   #
 *      #       #
 *    # # # # # # #
 *         (h)
 *
 * <p># # # # # # #
 *    # #       # #
 *    #   #   #   #
 *    #     #     #
 *    #   #   #   #
 *    # #       # #
 *    # # # # # # #
 *         (i)
 *
 *     <p># # # # # # # #
 *       # # # # # # # #
 *      # # # # # # # #
 *     # # # # # # # #
 *    # # # # # # # #
 *   # # # # # # # #
 *  # # # # # # # #
 * # # # # # # # #
 *       (j)
 *
 * <p># # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *          (k)
 *
 * <p># # # # # # #
 *     # # # # # # #
 *    # # # # # # #
 *     # # # # # # #
 *    # # # # # # #
 *     # # # # # # #
 *    # # # # # # #
 *         (l)
 */
public class Patt2D {
    /* private static data */
    private static final int SIZE = 8;
    private static final int FIRST_COUNT = 1;

    /** Patt2D getter for pattern of square with empty center. */
    public String getEmptySq() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (row % SIZE > 1 && col % SIZE > 1) {
                    sb.append("  ");
                    continue;
                }
                if (col == SIZE) {
                    sb.append(String.format("#%n"));
                    continue;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /** Patt2D getter for right triangle at bottom left. */
    public String getTriBotL() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (col == row) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /** Patt2D getter for right triangle at top left. */
    public String getTriTopL() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (col + row > SIZE) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /** Patt2D getter for right triangle at top right. */
    public String getTriTopR() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (col == SIZE) {
                    sb.append(String.format("#%n"));
                    break;
                }
                if (row > col) {
                    sb.append("  ");
                    continue;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /** Patt2D getter for right triangle at bottom right. */
    public String getTriBotR() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (col == SIZE) {
                    sb.append(String.format("#%n"));
                    break;
                }
                if (col + row <= SIZE) {
                    sb.append("  ");
                    continue;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /** Patt2D getter for mirrored letter Z. */
    public String getMirrorZ() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (row % SIZE < 2 && col != SIZE) {
                    sb.append("# ");
                    continue;
                }
                if (col == row || col == SIZE) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("  ");
            }
        }
        return sb.toString();
    }

    /** Patt2D getter for pattern of letter Z. */
    public String getLetterZ() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (row % SIZE < 2 && col != SIZE) {
                    sb.append("# ");
                    continue;
                }
                if (col == SIZE - row + 1 || col == SIZE) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("  ");
            }
        }
        return sb.toString();
    }

    /** Patt2D getter for pattern of hourglass. */
    public String getHrGlass() {
        boolean crossed = false;
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (row % SIZE < 2) {
                    if (col == SIZE) {
                        sb.append(String.format("#%n"));
                        break;
                    }
                    sb.append("# ");
                    continue;
                }
                /* SIZE / 2 + 1 for both odd and even numbers. */
                if (SIZE / 2 + 1 == row) {
                    crossed = true;
                }
                if (col == row) {
                    if (crossed) {
                        sb.append(String.format("#%n"));
                        break;
                    }
                    sb.append("# ");
                    continue;
                }
                if (col == SIZE - row + 1) {
                    if (crossed) {
                        sb.append("# ");
                        continue;
                    }
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("  ");
            }
        }
        return sb.toString();
    }

    /** Patt2D getter for pattern of hourglass inside a box. */
    public String getHrGlBox() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (col == FIRST_COUNT) {
                    sb.append("# ");
                    continue;
                }
                if (col == SIZE) {
                    sb.append(String.format("#%n"));
                    break;
                }
                if (row % SIZE < 2 || col == row || col == SIZE - row + 1) {
                    sb.append("# ");
                    continue;
                }
                sb.append("  ");
            }
        }
        return sb.toString();
    }

    /** Patt2D getter for pattern of parallelogram. */
    public String getParall() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            /* add leading spaces to the row */
            for (int sp = 0; sp < SIZE - row; sp++) {
                sb.append(" ");
            }
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (SIZE == col) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /**
     * Patt2D getter for solid square.
     *
     * <p>The simplest pattern employing nested loop. All other patterns are
     * more or less adding extension to it.
     */
    public String getSolidSq() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                if (col == SIZE) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /** Patt2D getter for pattern of checker board. */
    public String getChecker() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            if (row % 2 == 0) {
                sb.append(" ");
            }
            for (int col = FIRST_COUNT; col < SIZE; col++) {
                sb.append("# ");
            }
            sb.append(String.format("#%n"));
        }
        return sb.toString();
    }

    /** Patt2D string method. */
    public String toString() {
        return String.format(
                "%s%9s%n%n"
                        + "%s%9s%n%n"
                        + "%s%9s%n%n"
                        + "%s%9s%n%n"
                        + "%s%9s%n%n"
                        + "%s%9s%n%n"
                        + "%s%9s%n%n"
                        + "%s%9s%n%n"
                        + "%s%9s%n%n"
                        + "%s%9s%n%n"
                        + "%s%9s%n%n"
                        + "%s%9s",
                getTriBotL(), "(a)",
                getTriTopL(), "(b)",
                getTriTopR(), "(c)",
                getTriBotR(), "(d)",
                getEmptySq(), "(e)",
                getMirrorZ(), "(f)",
                getLetterZ(), "(g)",
                getHrGlass(), "(h)",
                getHrGlBox(), "(i)",
                getParall(), "(j)",
                getSolidSq(), "(k)",
                getChecker(), "(l)");
    }
}
