/**
 * This class maintains the catalog  of card.
 *
 * The following are the opertaions that this CardCatlog application can
 * perform.
 *
 *1. Users should be able to addACard() to the catalog and the cards should be filed in the correct order inside of the arrays based on the correct field.
 *2. Users should be able to getATitle() by specifying the book's title (a String). This method should return the first Card with a title that matches the given title. Bonus: This should be done using a binary search.
 *3. Users should be able to getAnAuthor() by specifying a specific author. The method should return all the books written by this author.
 *4. Users should be able to getSubject() which should return a list which contains all the books that involve this subject. This should be implemented using regex to search for the books.
 *5. Users should be able to removeATitle() which should remove this books from ALL of the card catalog stacks.
 *6. Users should be able to printTheCatalog() which should neatly print out all of the books in order by either title, or author, or subject based on how the user wants it.    
 *
 * @author Kura Vamshi Krishna
 */
import java.util.Arrays;
public  class CardCatlog{
    public Card [] tas;
    
    public int cardsCount;
    /**
     * to avoid magic number
     */
    static final int N =10;
    /**
     * public non-parameterized Constructor.
     */
    
    public CardCatlog() {
        this.tas = new Card[N];
        // this.author = new Card[N];
        // this.subject = new Card[N];
        this.cardsCount =0;
    }
    /**
     * this method  is used to add a card to all the arrays that we defined at the time of object creation.
     * @param newCard is a card object.
     */
    public void addACard(Card newCard) {
        tas[cardsCount] = newCard;
        
        // Arrays.sort(title, new Card.titleOrder());
        // Arrays.sort(author, new Card.authorOrder());
        // Arrays.sort(subject, new Card.subjectOrder());
        cardsCount++;

    }
    /**
     * this method should return the first Card with a title that matches the given title
     * @param titleName the search item.
     * @return the card which has the particular title name 
     */
    public Card getTitle(final String titleName) {
        for(int i =0; i < tas.length; i++) {
            if (tas[i].getTitle().equals(titleName))
                return tas[i];
        }
        return null;
    }

    /**
     * The method should return all the books written by this author.
     * @param authorName the author name.
     * @return an array that matches with the author name.
     */
    public Card [] getAuthor(final String authorName) {
         Card pAuthor[] = new Card[tas.length];
         int count = 0;
         for(int i = 0; i < tas.length;i++) {
            if (tas[i].getAuthor().equals(authorName))
                pAuthor[count] = tas[i];
                count++;
         }
         return pAuthor;
    }
    /**
     * This should be implemented using regex to search for the books.
     * @param subjectName the subject name.
     * @return an array that matches with the author name.
     */
    public Card [] getSubject(final String subjectName) {
        Card pSubject[] = new Card[tas.length];
        int count = 0;
        for(int i = 0; i < tas.length;i++) {
           if (tas[i].getSubject().equals(subjectName))
               pSubject[count] = tas[i];
               count++;
        }
        return pSubject;

    }
    /**
     * By this method we can remove all card objects that contain the title .
     * @param titleName
     * @return
     */
    public boolean removeATitle(final String titleName) {
        int index [] =new int[tas.length];
        int count =-1;
        for(int i =0; i < tas.length; i++) {
            if (tas[i].getTitle().equals(titleName)) {
                index[count] = i;
                count++;
            }
        }
        if (count >= 0){
            for(int i: index) {
                tas[i] = null;
            }
            for(int k = index[0]; k < tas.length; k++) {
                tas[k] = tas[k+1];
                if (k > (tas.length-1)-count){ 
                    tas[k] = null;
                }

            }
            return true;
        }
        return false;

    }
    /**
     * 
     * @param var
     * @return
     */
    public  String printTheCatalog() {
        String s = "";
        for (Card each : tas) {
            s += this.toString() + "\n";
        }
        return s;
    }
}
