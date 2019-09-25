/**
 * Given an array of elements, return the String that has two values separated
 * by commans. The first value is the sum of all the elements except minimum
 * and the second value is the sum of all the elements except the maximum.
 *
 * Input : {1,2,3,4,5};
 * Output : 14,10
 *
 * Input : {1,2}
 * Output : 2,1
 *
 * @author Siva Sankar
 */

public final class MiniMaxSum {
    /**.
     * Default Constructor
     */
    private MiniMaxSum() {
        //unused
    }
    /**.
     * This method returns the minimum element in the array.
     * @param arr contains the elements in arr.
     * @return the minimum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int min(final int[] arr) {
        // int[] newArr = new int[arr.length];
        int min = arr[0];
        for (int ind = 0; ind < arr.length; ind++) {
            if (min > arr[ind]) {
                min = arr[ind];
            }
        }
        return min;
    }
    /**.
     * This method returns the maximum element in the array.
     * @param arr contains the elements in arr.
     * @return the maximum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int max(final int[] arr) {
        //  Your code goes here...int min = arr[0];
        int max = arr[0];
        for (int ind = 0; ind < arr.length; ind++) {
            if (max < arr[ind]) {
                max = arr[ind];
            }
        }
        return max;
    }

    /**
     * This method returns the sum of all the elements in the array.
     * @param arr  contains the elements in arr.
     * @return the sum of all the elements in the arr. returns -1 if there are
     * no elements.
     */
    public static int sum(final int[] arr) {
        //  Your code goes here...
        int add = 0;
        for (int ind = 0; ind < arr.length; ind++) {
            add += arr[ind];
        }
        return add;
    }
    /**.
     * Make use of the functions defined for finding the
     * minimum element, maximum element and the sum of all the elements of teh
     * array arr.
     *
     * @param arr the input array.
     * @return the string version of maxSum and minSum separated by commas.
     */
    public static String miniMaxSum(final int[] arr) {
        //  Your code goes here...
        int maxSum = sum(arr) - max(arr);
        int minSum = sum(arr) - min(arr);
        return minSum + "," + maxSum;
    }
}
