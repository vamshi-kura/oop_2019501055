/**
 * List Data Type. Write a data type List.java that
 * represents an listay of homogeneous elements. 
 * Implement the following public API which can be 
 * used as an API for the rest of your course.
 * 
 * @author Praveen Garimella
 * @author Siva Sankar
 * @author Jagan
 * 
 * @since August - 2018
 */

// import java.util.Arrays;
// import java.util.Set;

public abstract class AbstractSet<E extends Comparable<E>> extends AbstractList<E> implements SetInterface<E>  {
    public AbstractSet() {
        super();
    }
    public AbstractSet(int capacity) {
        super(capacity);
    }
    /**
     * Appends all of the elements in the specified list to the end of this list, or
     * it will be added in order if the list is OrderedList, in the order that
     * they are returned by the specified list's Iterator.
     * 
     * @param lst list containing elements to be added to this list.
     */
    public void addAll(AbstractSet<E> lst) {
        // TODO
        // Your code goes here.
        for(int i=0; i<lst.size(); i++) {
            this.add(lst.get(i));
        }
        
    }
    /**
     * Returns a view of the portion of this list between the specified fromIndex, 
     * inclusive, and toIndex, exclusive. (If fromIndex and toIndex are equal, 
     * the returned list is empty.) The returned list is backed by this list, 
     * so non-structural changes in the returned list are reflected in this list,
     *  and vice-versa. The returned list supports all of the optional list operations.
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex high endpoint (exclusive) of the subList
     * @return a view of the specified range within this list
     */
    public AbstractSet<E> subSet(int fromIndex, int toIndex) {
        // TODO
        // Your code goes here.
        if (fromIndex >= 0 && fromIndex < toIndex && toIndex > fromIndex && toIndex <= this.size){
            AbstractSet<E> l = new Set<E>(toIndex-fromIndex);
            for(int i =fromIndex; i<toIndex; i++){
                l.add(list[i]);
            }
            return l;
        }
        return null;
    }
    /**
     * Combining all elements  and storing in a new set.
     * @param set1 
     * @param set2
     * @return a set that consists of all elements.
     */
    public AbstractSet<E> union(AbstractSet<E> set2) {
        AbstractSet<E> newSet = new OrderedSet<E>(this.size()+set2.size());
        newSet.addAll(this);
        newSet.addAll(set2);
        return newSet;
    }
    /**
     * Reterving only common elements from the two sets.
     * @param set1
     * @param set2
     * @return a set that contains only common elements
     */
    public AbstractSet<E> intersection(AbstractSet<E> set2) {
        AbstractSet<E> newSet = new OrderedSet<E>(this.size()+set2.size());
        for(int j =0; j < set2.size(); j++) {
            if (contains(set2.get(j))){
                newSet.add(set2.get(j));
            }
        }
        return newSet;
    }

    
}