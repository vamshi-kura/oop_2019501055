/**
 * Given an array of Strings, convert each string of the array into
 * lower case String and then return the array.
 *
 * Input : {"Hello", "Hi"}
 *  * Output : {"hello", "hi"}
 *
 * @author Siva Sankar
 */

public final class StringHandling {
     /**.
     * Default Constructor
     */
    private StringHandling() {
        //unused
    }

    /**.
     * This method returns the array of lower case strings.
     * @param arr the input array.
     * @return the array of lower case Strings based on the input parameter.
     */
    public static String[] lower(final String[] arr) {
        //  your code goes here....
        String[] newArr = new String[arr.length];
        for (int ind = 0; ind < arr.length; ind++) {
            newArr[ind] = arr[ind].toLowerCase();
        }
        return newArr;
    }
}
