import java.util.Comparator;

/**
 * This class discusses about the Player Object. The attributes of the
 * this object are as follows.
 * name : Name 
 * Score : the points.
 *
 *
 * @author kura vamshi krishna
 */
public class Player implements  Comparable<Player> {
    // /**
    //  * For check style
    //  */
    // private Player() {
    //     //unsused
    // }
    /**
     * the player name.
     */
    private String username;
    /**
     * to store points.
     */
     private  int score;
    /**
     * parameterized constructor
     * @param username string type is used  to store name attribute.
     * @param score int type used to store score attribute.
     */
    public Player(String username) {
        this.username = username;
        this.score = 0;
    }
    /**
     * this method return the 'username' field of the class.
     * @return  the name value.
     */
    public String getUsername() {
        return this.username;
    }
    /**
     * By this method we can change the name  field of the class.
     * @param username it's string variable.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * this method return the 'score' field of the class.
     * @return the score value.
     */
    public int getScore() {
        return this.score;
    }
    /**
     * By this method we can change the score field of the class.
     * @param score its int value.
     */
    public void setScore(int score) {
        this.score = score;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof Player)) {
    //         return false;
    //     }
    //     Player player = (Player) o;
    //     return player.equals(username, player.username);
    // }

    public int compareTo(Player that) {
        return Integer.compare(this.score, that.score);
    }    

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", score='" + getScore() + "'" +
            "}";
    }
     

}