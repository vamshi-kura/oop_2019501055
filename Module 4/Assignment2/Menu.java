/**
 * creating a class of same name as file to create the main function.
 */
public final class Menu {
    /**
     * check style.
     */
    private Menu() {
        // not called
    }
    /**
     * creating a main method.
     * @param args args in console.
     */
    public static void main(final String[] args) {
        Card details = new Card("revenge", "vamsi", "partC");
        CardCatalog obj = new CardCatalog();
        obj.addCard(details);
        Card details2 = new Card("scifi", "naveen", "partA");
        obj.addCard(details2);
        Card details3 = new Card("thriller", "ravi", "partB");
        obj.addCard(details3);
        Card details4 = new Card("revenge", "sai", "partD");
        obj.addCard(details4);
        obj.removeATitle("revenge");
        // sort by title
        obj.printTheCatalog("Title");
        System.out.println("-------------------------------");
        // sort by author
        obj.printTheCatalog("Author");
        System.out.println("-------------------------------");
        // sort by subject
        obj.printTheCatalog("Subject");
    }
}