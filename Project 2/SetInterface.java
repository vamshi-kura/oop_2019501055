/**
 * This acts as an interface (API) for the client.
 * 
 * @author Siva Sankar
 */

public interface SetInterface <E extends Comparable<E>> {
    /**
     * Returns the subList of elements that are in the index range of 
     * fromIndex to toIndex
     * @param fromIndex From Index
     * @param toIndex To Index
     * @return the subList of this List based on fromIndex and toIndex
     */
    public AbstractSet<E> subSet(int fromIndex, int toIndex);
    /**
     * Combining all elements  and storing in a new set.
     * @param set1 
     * @param set2
     * @return a set that consists of all elements.
     */
    public AbstractSet<E> union(AbstractSet<E> set2);
    /**
     * Reterving only common elements from the two sets.
     * @param set1
     * @param set2
     * @return a set that contains only common elements
     */
    public AbstractSet<E> intersection(AbstractSet<E> set2);

}