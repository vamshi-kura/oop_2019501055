/**
 * This class discusses about the Word Object. The attributes of the
 * this object are as follows.
 * name : Name 
 * level : the difficulty level.
 * hints [] : arrays of strings that has hints.
 *
 * @author kura vamshi krishna
 */
import java.util.Objects;

public class Word {
    /**
     * For check style
     */
    private Word() {
         //unsused
    }

    /**
     * the movie name.
     */
    private String name;
    /**
     * the difficulty level
     */
    private String level;
    /**
     * the array that contains hints.
     */
    private String[] hints;
    /**
     * parameterized constructor
     * @param n string type that is used to store name attribute
     * @param l string type that is used to store level attribute
     * @param h string [] type that is used to store hints attribute
     */
    public Word(String name, String level, String[] hints) {
        this.name = name;
        this.level = level;
        this.hints = hints;
    }
    /**
     * this method return the 'name' field of the class.
     * @return  the name value.
     */
    public String getName() {
        return this.name;
    }
    /**
     * By this method we can change the name  field of the class.
     * @param name it's string variable.
     */
    public void setName(final String name) {
        this.name = name;
    }
    /**
     * this method return the 'level' field of the class.
     * @return the level value.
     */
    public String getLevel() {
        return this.level;
    }
    /**
     * By this method we can change the level field of the class.
     * @param level its  string variable.
     */
    public void setLevel(String level) {
        this.level = level;
    }
    /**
     *this method return the 'hints' field of the class.
     * @return  the hints value.
     */
    public String[] getHints() {
        return this.hints;
    }
    /**
     * By this method we can change the hinst field of the class.
     * @param hints its string array.
     */
    public void setHints(String[] hints) {
        this.hints = hints;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Word)) {
            return false;
        }
        Word word = (Word) o;
        return Objects.equals(name, word.name);
    }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(name, level, hints);
    // }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", level='" + getLevel() + "'" +
            ", hints='" + getHints() + "'" +
            "}";
    }


}