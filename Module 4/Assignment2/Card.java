/**
 * This class discusses about the Contact Object. The attributes of the
 * contact object
 * are as follows.
 * title of the book
 * author of the book
 * subject of the book
 *
 * @author Kura Vamshi Krishna.
 */

//  Your code goes here... For Contact class
public final class Card {
    /**.
     * for check style
     */
    private Card() {
        //unused
    }
    /**
     * declaring the field of contact as private so others cannot change the
     * value.
     */
    private String title;
    /**
     * declaring the field of contact as private so others cannot change the
     * value.
     */
    private String author;
    /**
     * declaring the field of contact as private so others cannot change the
     * value.
     */
    private String subject;

    /**.
     * it's parameterized constructor
     * @param title1 it's a string variable that stores name of the contact.
     * @param author1 it's a string variable that store email of a person.
     * @param subject1 it's a string variable that stores a phone number.
     */

    public Card(final String title1, final String author1,
    final String subject1) {
        this.title = title1;
        this.author = author1;
        this.subject = subject1;
    }
    /**
     * this method is used to print the fields of the object.
     * @return the expected ouput manner.
     */
    public  String toString() {
        return "{ Name = " + this.title + ", " + "author = " + this.author
        + ", " + "Subject = " + this.subject + " }";
    }
    /**.
     * By this method we can change the name of the contact
     * @param title1 it's string variable.
     */
    public void setTitle(final String title1) {
        this.title = title1;
    }
    /**
     * this method return the 'name' field of the class.
     * @return  the name value.
     */
    public String getTitle() {
        return this.title;
    }
    /**.
     * By this method we can change the email of the contact
     * @param author1 it's string variable.
     */
    public void setAuthor(final String author1) {
        this.author = author1;
    }
    /**
     * this method return the 'email' field of the class.
     * @return  the email variable  value.
     */
    public String getAuthor() {
        return this.author;
    }
    /**
     * By this method we can change the phone no. of the contact
     * @param sub it's string variable.
     */
    public void setSubject(final String sub) {
        this.subject = sub;
    }
   /**
     * this method return the 'phoneNumber' field of the class.
     * @return  the phone number variable  value.
     */
    public String getSubject() {
        return this.subject;
    }

}
