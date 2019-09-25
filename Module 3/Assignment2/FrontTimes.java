/**
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is there if the
 * string is less than length 3. Return n copies of the front;
 *
 * Input : frontTimes("Chocolate", 2)
 * Output : ChoCho
 *
 * Input : frontTimes("Chocolate", 3)
 * Output : ChoChoCho
 *
 * Input : frontTimes("Abc", 3)
 * Output : AbcAbcAbc
 *
 * @author: Siva Sankar
 */

public final class FrontTimes {
    /**.
     * Default Constructor
     */
    private FrontTimes() {
        //unused
    }
    /**.
     * to avoid magic number
     */
    private static final int THREE = 3;
    /**.
     * This method returns n copies of the front.
     * @param str the string to be considered.
     * @param n the non-negative integer value.
     * @return the n copies of the front string.
     */
    public static String frontTimes(final String str, final int n) {
        String result = "";
        if (str.length() >= THREE) {
            for (int n1 = n; n1 >= 1; n1--) {
                result = result + str.substring(0, THREE);
            }
        } else {
            for (int n1 = n; n1 >= 1; n1--) {
                result = result + str;
            }
        }
        return result;
    }
}
