/**
 * we create a card class in order to store the fields title,a uthor, subject.
 */
class Card {
    /**
     * title of the book.
     */
    private String title;
    /**
     * author of the book.
     */
    private String author;
    /**
     * subject of the book.
     */
    private String subject;
    /**
     * default constructor.
     */
    Card() {
        title = "title";
        author = "author";
        subject = "subject";
    }
    /**
     * constructoe to assign the given parameters.
     * @param title1 title of the book.
     * @param author1 author of the book.
     * @param subject1 subject of the book.
     */
    Card(final String title1, final String author1, final String subject1) {
        this.title = title1;
        this.author = author1;
        this.subject = subject1;
    }
    /**
     * getter for title.
     * @return the respective title of the book.
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * setter for title.
     * @param title1 title of the book.
     */
    public void setTitle(final String title1) {
        this.title = title1;
    }
    /**
     * getter for author.
     * @return the respective author of the book.
     */
    public String getAuthor() {
        return this.author;
    }
    /**
     * setter for author.
     * @param author1 author of the book.
     */
    public void setAuthor(final String author1) {
        this.author = author1;
    }
    /**
     * getter for subject.
     * @return the respective subject of the book.
     */
    public String getSubject() {
        return this.subject;
    }
    /**
     * setter for subject.
     * @param subject1 subject of the book.
     */
    public void setSubject(final String subject1) {
        this.subject = subject1;
    }
}