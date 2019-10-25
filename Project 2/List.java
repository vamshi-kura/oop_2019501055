/**
 * 
 */

public class List<E extends Comparable<E>> extends AbstractList<E> {
    public List(){
        super();
    }
    public List(int capacity) {
        super(capacity);
    }
    public  void add(int index, E item){
        if (this.size >= list.length ){
            resize();
        }
        if(index >= 0 && index < size) {
            for(int i =this.size; i >index; i--){
                list[i] = list[i-1];
            }
            list[index] = item;
            size++;
        }
    }
    public void add(E item) {
        if (this.size >= list.length ){
            resize();
        }
        list[size] = item;
        size++;
    }
}