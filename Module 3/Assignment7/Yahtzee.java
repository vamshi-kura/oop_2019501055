/**
 *  * Here in this program we need to roll down 5 dice until we get same number
 * in all the  dices.
 *
 * @author Kura Vamshi Krishna
 */

public final class Yahtzee {
    /**.
     * to avoid magic number
     */
    private static final double SIX = 6;
    /**.
     * Default Constructor
     */
    private Yahtzee() {
    //unused
    }
    /**.
     * Her ethe method roll generates a random number from 1 to 6 and all
     * the numbers are genreted in random wise.
     * @return it return value from 1 to 6.
     */
    public static int rollDice() {
        double randomNo = Math.random();
        randomNo *= SIX;
        randomNo += 1;
        int intRandom = (int) randomNo;
        return intRandom;
    }
    /**
     * It's the main method where the compiler starts the compiling the code
     * amd the count value is printed when all the dice values are equal.
     * @param args name of the SDtring array
     */
    public static void main(final String[] args) {
        int d1 = rollDice();
        int d2 = rollDice();
        int d3 = rollDice();
        int d4 = rollDice();
        int d5 = rollDice();
        int count = 1;
        while (!(d1 == d2 && d2 == d3 && d3 == d4 && d4 == d5)) {
            d1 = rollDice();
            d2 = rollDice();
            d3 = rollDice();
            d4 = rollDice();
            d5 = rollDice();
            count += 1;
        }
        System.out.print(count);
    }
}
