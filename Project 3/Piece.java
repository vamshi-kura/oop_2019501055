/**
 * 
 */
public class Piece {
    /**.
     * for check style
     */
    private Piece() {
        //unused
    }
    public Piece(int p, String ft, boolean b) {
        this.position = p;
        this.feature = ft;
        this.is_present =  b;
    }
    /**
     * integer value to store the position
     */
    private int position;
    /**
     * to add the features for the piece.
     */
    private String feature;
    public boolean is_present;
    /**
     * returns a position
     * @return
     */
    public int getPosition() {
        return position;
    }
    /**
     * we can chage the value.
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
    }
    /**
     * we'll get a the feature at the piece.
     * @return
     */
    public String getFeature() {
        return feature;
    }
    /**
     * we can change the feature.
     * 
     * @param feature
     */
    public void setFeature(String feature) {
        this.feature = feature;
    }
    // public void featureImplementaion(String feat) {
    //     if (feat.equals("ladder"))
    // }
}