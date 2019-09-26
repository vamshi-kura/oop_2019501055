/**
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 *
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 *
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 *
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 *
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 *
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 *
 * @author Siva Sankar
 */

import java.util.Arrays;

public final class Stats {
    /**.
     * Default Constructor
     */
    private Stats() {
        //unused
    }

    /**
     * This method should return the mean of the elements of the array.
     * If the arr is empty (length is 0), return the mean as 0.
     * @param arr the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(final int[] arr) {
        //  Your code goes here....
        double add = 0;
        for (int ind = 0; ind < arr.length; ind++) {
            add += arr[ind];
        }
        if (arr.length == 0) {
            return 0.0;
        }
        return add / arr.length;
    }

    /**
     * This method returns the median of the elements of the array.
     * Prerequisite : The array should be sorted to find the median.
     *
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     *
     * @param arr the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(final int[] arr) {
        //  Your code goes here...
        Arrays.sort(arr);
        double med = 0.0;
        int mid = arr.length / 2;
        if (arr.length % 2 == 0) {
            med = (arr[mid] + arr[mid - 1]) / 2.0;
        } else {
            med = arr[mid];
        }
        return med;
    }

    /**
     * This method returns the mode of the array. If there is no mode, then it
     * returns 0 as the mode.
     *
     * @param arr the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static int mode(final int[] arr) {
        //  Your code goes here....
        int max = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }
            if (count != 1 && count > count1) {
                max = arr[i];
                count1 = count;
            }
        }
        return max;
    }

    /**
     * This method returns the variance of the input array.
     * Make use of the mean functon which has already written.
     *
     * @param arr the input array
     * @return the variance of the array.
     */
    public static double variance(final int[] arr) {
        //  Your code goes here....
        double var = 0;
        double c = mean(arr);
        for (int i = 0; i < arr.length; i++) {
            var += Math.pow(arr[i] - c, 2);
        }
        double var1 = (var) / arr.length;
        return var1;
    }

    /**
     * This method returns the standard deviation of the array.
     * Hint : You can find the square root using Math.sqrt() method.
     * @param arr the input array
     * @return the standard deviation of the input array.
     */
    public static double standardDeviation(final int[] arr) {
        //  Your code goes here....
        double sd = variance(arr);
        sd = Math.sqrt(sd);
        return sd;
    }
}
