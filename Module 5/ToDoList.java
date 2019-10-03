import java.util.Arrays;
public class ToDoList {
    private Task[]  tas;
    private int taskInd;
    static final int N = 10;
    public ToDoList() {
        this.tas = new Task[20];
        this.taskInd = 0;
    }
    public void addTask(Task t) {
        tas[taskInd] = 0;
        taskInd++;
    }
    public Date displayTaskOfdate (Date d) {
        for(int i = 0; i < tas.length; i++ ){
            if(d.equals(tas[i].getDate)) {
                System.out.println(tas[i].toString());
            }

        }
    }

    public String displayTaskName (String n) {
        for(int i = 0; i < tas.length; i++ ){
            if(n.equals(tas[i].name)) {
                System.out.println(tas[i].toString());
            }
        }
    }
    public void removeTask (String taskname) {

    }
    public void changeStatus (String stat) {

    }
    
}


