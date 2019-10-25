/**
 * 
 */
public class User {
    /**.
     * for checkstyle
     */
    private User() {
        // unused.
    }
    /*
     * it's string type to store name of the user.
     */
    private String name;
    /**
     * user hasa piece obj attribute.
     */
    private Piece pobj;
    /**
     * returns the name attribute
     * @return
     */
    public User(String str) {
        name = str;
        pobj = new Piece(1, "none", true);
        
    }
    public String getName() {
        return name;
    }
    /**
     * to change the value of the name attribute
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *returns the pobj attribute
     * @return
     */
    public Piece getPobj() {
        return pobj;
    }
    /**
     * * to change the pobj attribute
     * @param pobj
     */
    public void setPobj(Piece pobj) {
        this.pobj = pobj;
    }

}