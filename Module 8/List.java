  
/**
 * The list class creates the list and perform operations on it.
 * All the methods from the AbstractList are inherited.
 * Adding of elements to the list can be done here.
 * @author Piyush Jain.
 */
public class List extends AbstractList {
    /**
     * This methods adds the element to the list.
     * @param element to be added.
     */
    public void add(final int element) {
        if (this.size() == this.getList().length) {
            resize();
        }
        int[] arr = this.getList();
        int size = this.size();
        arr[size++] = element;
        this.setList(arr);
        this.setSize(size);
    }
}
