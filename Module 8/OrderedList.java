/**
 * The list class creates the ordered list and perform operations on it.
 * All the methods from the AbstractList are inherited.
 * Adding of elements to the list can be done here.
 * @author Piyush Jain.
 */
public class OrderedList extends AbstractList {
    /**
     * This methods adds the element to the list by checking the order.
     * @param element to be added.
     */
    public void add(final int element) {
        if (this.size() == this.getList().length) {
            resize();
        }
        int size = this.size();
        int[] arr = this.getList();
        for (int i = 0; i < size; i++) {
            if (arr[i] > element) {
                for (int j = size; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i] = element;
                size++;
                break;
            }
            if (size == this.size()) {
                arr[size++] = element;
            }
        }
        this.setList(arr);
        this.setSize(size);
    }
}
