/**
 * This is an abstract class for the implementing the methods declared in the
 * ListInterface.
 * @author Piyush Jain
 */
public abstract class AbstractList implements ListInterface {
    /**
     * The list that is going to be created.
     */
    private int[] list;
    /**
     * The number of elements in the list.
     */
    private int size;
    /**
     * A constant with int value 10.
     */
    static final int TEN = 10;
    /**
     * The default constructor that initialises the empty list with the
     * initial capacity of 10 elements, and size 0.
     */
    AbstractList() {
        this.list = new int[TEN];
        this.size = 0;
    }
    /**
     * The constructor that initalises the list if an array is provided.
     * The size is set to be the number of elements in the array.
     * @param pList the user provided array.
     */
    AbstractList(final int[] pList) {
        this.list = pList;
        this.size = pList.length;
    }
    /**
     * This constructor sets the initial list capacity of teh size provided.
     * @param pSize the initial capacity for the list.
     */
    AbstractList(final int pSize) {
        this.list = new int[pSize];
        this.size = 0;
    }
    /**
     * The getter method for the list.
     * @return the current list.
     */
    public int[] getList() {
        return this.list;
    }
    /**
     * The setter method for the list.
     * @param pList the list from user.
     */
    public void setList(final int[] pList) {
        this.list = pList;
    }
    /**
     * The setter method for the size.
     * @param pSize the size from user.
     */
    public void setSize(final int pSize) {
        this.size = pSize;
    }
    /**
     * Thid method returns the number of elements in this list.
     * if list is empty, then it returns 0 by default.
     * @return the number of elements in this list.
     */
    public int size() {
        return this.size;
    }
    /**
     * Returns an item at a particular index from this list.
     * @param index the element at the index to be found.
     * @return the element present at the index.
     */
    public int get(final int index) {
        if (index >= 0 && index < size) {
            return this.list[index];
        }
        return -1;
    }
    /**
     * This method returns the index of an item. If the item is not
     * present in the list, then return -1.
     * @param item to be used to find the index.
     * @return the index of the element if present, -1 otherwise.
     */
    public int indexOf(final int item) {
        for (int i = 0; i < this.size; i++) {
            if (this.list[i] == item) {
                return i;
            }
        }
        return -1;
    }
    /**
     * This method returns true if the item is present in this list.
     * If the item is not present, then return false.
     * @param item to be used to find whether it is present in this
     * list.
     * @return true if item is present in this list and false otherwise.
     */
    public boolean contains(final int item) {
        for (int i = 0; i < this.size; i++) {
            if (this.list[i] == item) {
                return true;
            }
        }
        return false;
    }
    /**
     * This method will removes the element at a particular index.
     * Think of once you remove the element, there will be a empty
     * space.
     *
     * Now move all the items to the left by one position.
     *
     * Please see the comemnts in Assignment - 2 for more details
     * in Polymorphism and Abstract Data Type.
     *
     * @param index to be removed from a particular index in this list.
     */
    public void remove(final int index) {
        if (index < size) {
            for (int i = index; i < size; i++) {
                this.list[i] = this.list[i + 1];
            }
            size--;
        }
    }
    /**
     * This method will resize the capacity of the current list to double
     * the current capacity.
     */
    public void resize() {
        int[] arr = new int[2 * this.size];
        for (int i = 0; i < this.size; i++) {
            arr[i] = this.list[i];
        }
        this.setList(arr);
    }
    /**
     * Converts the list to a readable string format.
     * @return the list in string format.
     */
    public String toString() {
        String str = "[";
        for (int i = 0; i < this.size - 1; i++) {
            str += this.list[i] + ",";
        }
        return (str + this.list[this.size - 1] + "]");
    }
}
