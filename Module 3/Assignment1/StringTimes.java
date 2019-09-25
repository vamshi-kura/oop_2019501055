/**
 * Given a string and an integer value n, repeat the string and concatenate
 * to the resultant string n times.
 *
 * Input : Hi, 2
 * Output : HiHi
 *
 * You can see the more test cases in the JUnit.java file.
 *
 * @author Siva Sankar
 */

public final class StringTimes {
    /**.
     * Default Constructor
     */
    private StringTimes() {
        //unused
    }
    /**.
     * This method returns the String that is appending the String n
     * times
     * @param  str the given String
     * @param  n   the integer
     * @return the String that is appended n times to the resultant Stirng
     */

    public static String stringTimes(final String str, int n) {
        //  Your code goes here....
        String result = "";
        for (; n >= 1; n--) {
            result = result + str;
        }
        return result;
    }
}
