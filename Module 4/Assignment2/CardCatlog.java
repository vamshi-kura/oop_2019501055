class CardCatalog {
    /**
     * creating an cardSortTitle array which stores the cards based
     * on the title.
     */
    private static Card[] cardSortTitle;
    /**
     * creating an cardSortAuthor array which stores the cards based
     * on the author.
     */
    private static Card[] cardSortAuthor;
    /**
     * creating an cardSortSubject array which stores the cards based
     * on the subject.
     */
    private static Card[] cardSortSubject;
    /**
     * creating an myCards array to store the cards normally.
     */
    private static Card[] myCards;
    /**
     * creating a cardCount of type int which tells the number of books.
     */
    private static int cardCount;
    /**
     * creating a size of type for the array size.
     */
    private final int size = 100;
    /**
     * default constructor.
     */
    CardCatalog() {
        myCards = new Card[size];
        cardSortTitle = new Card[size];
        cardSortAuthor = new Card[size];
        cardSortSubject = new Card[size];
        cardCount = 0;
    }
    /**
     * addCard takes a card of type Card and add it in myCards
     * and we call three more functions to store the cards differently.
     * @param card we use the card object to store it in other arrays.
     */
    public void addCard(final Card card) {
        myCards[cardCount] = card;
        cardSortTitle(card);
        cardSortAuthor(card);
        cardSortSubject(card);
        cardCount++;
    }
    /**
     * sorting the cardSortTitle by title and assigning
     * the new card respectively.
     * @param card we use the card object to store it in other arrays.
     */
    public static void cardSortTitle(final Card card) {
        int i;
        int j;
        int flag = 0;
        for (i = 0; i < cardCount; i++) {
            if ((card.getTitle().compareTo(cardSortTitle[i].getTitle()))
            <= 0) {
                for (j = cardCount; j >= i; j--) {
                    cardSortTitle[j + 1] = cardSortTitle[j];
                }
                cardSortTitle[i] = card;
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            cardSortTitle[cardCount] = card;
        }
    }
    /**
     * sorting the cardSortTitle by author and assigning
     * the new card respectively.
     * @param card we use the card object to store it in other arrays.
     */
    public static void cardSortAuthor(final Card card) {
    int i;
    int j;
    int flag = 0;
    for (i = 0; i < cardCount; i++) {
        if ((card.getAuthor().compareTo(cardSortAuthor[i].getAuthor())) <= 0) {
            for (j = cardCount; j >= i; j--) {
                cardSortAuthor[j + 1] = cardSortAuthor[j];
            }
            cardSortAuthor[i] = card;
            flag = 1;
            break;
        }
    }
    if (flag == 0) {
        cardSortAuthor[cardCount] = card;
    }
    }
    /**
     * sorting the cardSortTitle by subject and assigning the
     * new card respectively.
     * @param card we use the card object to store it in other arrays.
     */
    public static void cardSortSubject(final Card card) {
    int i;
    int j;
    int flag = 0;
    for (i = 0; i < cardCount; i++) {
    if ((card.getSubject().compareTo(cardSortSubject[i].getSubject())) <= 0) {
        for (j = cardCount; j >= i; j--) {
            cardSortSubject[j + 1] = cardSortSubject[j];
        }
        cardSortSubject[i] = card;
        flag = 1;
        break;
    }
    }
    if (flag == 0) {
        cardSortSubject[cardCount] = card;
    }
    }
    /**
     * we display all the books of specific title.
     * @param title title to be searched.
     */
    public void getATitle(final String title) {
        for (int i = 0; i < cardCount; i++) {
            if (myCards[i].getTitle().equals(title)) {
                System.out.println(myCards[i].getTitle()
                + "," + myCards[i].getAuthor() + ","
                + myCards[i].getSubject());
            }
        }
    }
    /**
     * we display all the books of specific author.
     * @param author author to be searched.
     */
    public void getAnAuthor(final String author) {
        for (int i = 0; i < cardCount; i++) {
            if (myCards[i].getAuthor().equals(author)) {
                System.out.println(myCards[i].getTitle()
                + "," + myCards[i].getAuthor() + ","
                + myCards[i].getSubject());
            }
        }
    }
    /**
     * we display all the books of specific author.
     * @param subject subject to be searched.
     */
    public void getSubject(final String subject) {
        for (int i = 0; i < cardCount; i++) {
            if (myCards[i].getSubject().equals(subject)) {
                System.out.println(myCards[i].getTitle()
                + "," + myCards[i].getAuthor() + ","
                + myCards[i].getSubject());
            }
        }
    }
    /**
     * remove the books with the given title in all the arrays.
     * @param title title to be removed.
     */
    public void removeATitle(final String title) {
        int temporary1 = cardCount;
        int temporary2 = cardCount;
        int temporary3 = cardCount;
        int temporary4 = cardCount;
        int i;
        for (i = 0; i < temporary1; i++) {
            if (myCards[i].getTitle().equals(title)) {
                myCards[i] = null;
                for (int j = i; j < temporary1; j++) {
                    myCards[j] = myCards[j + 1];
                }
                i--;
                temporary1--;
            }
        }
        for (i = 0; i < temporary2; i++) {
            if (cardSortTitle[i].getTitle().equals(title)) {
                cardSortTitle[i] = null;
                for (int j = i; j < temporary2; j++) {
                    cardSortTitle[j] = cardSortTitle[j + 1];
                }
                i--;
                temporary2--;
            }
        }
        for (i = 0; i < temporary3; i++) {
            if (cardSortSubject[i].getTitle().equals(title)) {
                cardSortSubject[i] = null;
                for (int j = i; j < temporary3; j++) {
                    cardSortSubject[j] = cardSortSubject[j + 1];
                }
                i--;
                temporary3--;
            }
        }
        for (i = 0; i < temporary4; i++) {
            if (cardSortAuthor[i].getTitle().equals(title)) {
                cardSortAuthor[i] = null;
                for (int j = i; j < temporary4; j++) {
                    cardSortAuthor[j] = cardSortAuthor[j + 1];
                }
                temporary4--;
                i--;
            }
        }
        cardCount = temporary1;
    }
    /**
     * to display the card we have to convert each of the field into string.
     * @param type type of the sorting based the author wants.
     * @return returns alldone if the input is right else invalid.
     */
    public String printTheCatalog(final String type) {
        Card[] present;
        if (type == "Title") {
            present =  cardSortTitle;
        } else if (type == "Author") {
            present = cardSortAuthor;
        } else if (type == "Subject") {
            present = cardSortSubject;
        } else {
            System.out.println("invald");
            return "invalid";
        }
        for (int i = 0; i < cardCount; i++) {
            System.out.println("{title: " + present[i].getTitle()
            + ", author: " + present[i].getAuthor() + ", subject: "
             + present[i].getSubject() + "}");
        }
        return "all done";
    }
}