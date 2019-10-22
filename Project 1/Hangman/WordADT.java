/**
 * This class discusses about the WordADT Object. The attributes of the
 * this object are as follows.
 * wordarray : list of words. 
 * size : the size of the wordarray.
 *
 * @author kura vamshi krishna
 */
public class WordADT {
    /**
     * the words array.
     */
    private Word [] wordArray;
    /**
     * the size of the array.
     */
    private int size;
    /**
     * non parameterized constructor
     * @param wordarray words array used to store the words.
     * @param size to store no of words.
     */
    public WordADT() {
        this.wordArray = new Word[100];
        this.size = 0;
    }
    /**
     * this method return the 'wordarray' field of the class
     * @return the the array.
     */
    public Word[] getWordArray() {
        return this.wordArray;
    }
    /**
     *  By this method we can change the wordArray  field of the class.
     * @param wordArray the word type
     */
    public void setWordArray(Word[] wordArray) {
        this.wordArray = wordArray;
    }
    /**
     * this method return the 'size' field of the class
     * @return the the size.
     */
    public int getSize() {
        return this.size;
    }
    /**
     * By this method we can change the wordArray  field of the class.
     * @param size it's int type.
     */
    public void setSize(int size) {
        this.size = size;
    }
    /**
     * The addword method takes in a parameter of type word object and
     * adds this to the word list.
     * @param word to be added.
     */
    public void addWord(Word word) {
        wordArray[size] = word;
        size++;
    }
    /**
     * This method search for the word based on the level
     * and gives the
     * word in your words list.
     * @param diff is  the specifies the level of difficulity
     * @return  word if it presents or else null;
     */
    public Word getWord(String diff) {
        diff = diff.toLowerCase();
        boolean b = true;
        // double r = Math.random()*(size);
        while (b) {
            double r = Math.random()*(size);
            Word w = wordArray[(int) r];
            if (w.getLevel().equals(diff)) {
                return w;
            } 
        }
        return null; // we need to check the condition. when we use in game.
    }
    @Override
    public String toString() {
        return "{" +
            " wordArray='" + getWordArray() + "'" +
            ", size='" + getSize() + "'" +
            "}";
    }

}