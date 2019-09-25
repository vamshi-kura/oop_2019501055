/**
 * Given an array of Integers, return an array of the square
 * of each values in the array.
 *
 * Input : {1, 2, 3}
 * Output : {1, 4, 9}
 *
 * @author Siva Sankar
 * @author Mayank
 */

public final class Squares {
     /**.
     * Default Constructor
     */
    private Squares() {
        //unused
    }
    /**.
     * This method returns the array of ints that are squares of each element
     * in the input array.
     *
     * @param nums the input array.
     *
     * @return the array of ints that are squares of each element
     * in the input array.
     *
     */
    public static int[] squared(final int[] nums) {
        //  Your code goes here.
        int[] newArr = new int[nums.length];
        for (int ind = 0; ind < nums.length; ind++) {
            newArr[ind] = nums[ind] * nums[ind];
        }
        return newArr;
    }
}
