/**
 * 
 */

public class Set<E extends Comparable<E>> extends AbstractSet<E> {
    public Set(){
        super();
    }
    public Set(int capacity) {
        super(capacity);
    }
    public  void add(int index, E item){
        if (this.size >= list.length ){
            resize();
        }
        if(index >= 0 && index < size) {
            if (!(this.contains(item))) {
                for(int i =this.size; i >index; i--){
                    list[i] = list[i-1];
                }
                list[index] = item;
                size++;
            }   
        }
    }
    public void add(E item) {
        if (this.size >= list.length ){
            resize();
        }
        if (!(this.contains(item))) {
            list[size] = item;
            size++;
        }
    }
}