<<<<<<< HEAD
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * we create a class for each task.
 */
class Task {
    /**
     * name of the task.
     */
    private String name;
    /**
     * task description.
     */
    private String description;
    /**
     * deadline for the task.
     */
    private String date;
    /**
     * status of the task.
     */
    private String status;

    /**
     * parametric constructor to initialize.
     * @param newname of the  task.
     * @param newdescription of the task.
     * @param newdate of the task.
     */
    Task(final String newname, final String newdescription, final String newdate, final String newstatus) {
        name = newname;
        description = newdescription;
        date = newdate;
        status = newstatus;
    }

    /**
     * getter for task name.
     * @return the name.
     */
    public String getName() {
        return this.name;
    }
    /**
     * setter for task name.
     * @param name1 of the task
     */
    public void setName(final String name1) {
        this.name = name1;
    }

    /**
     * getter for task description.
     * @return the description.
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * setter for task description.
     * @param description1 of the task.
     */
    public void setDescription(final String description1) {
        this.description = description1;
    }

    /**
     * getter for task date.
     * @return the date.
     */
    public String getDate() {
        return this.date;
    }
    /**
     * setter for task date.
     * @param date1 of the task.
     */
    public void setDate(final String date1) {
        this.date = date1;
    }

    /**
     * getter for task status.
     * @return the status.
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * setter for task status.
     * @param status1 of the ststus
     */
    public void setStatus(final String status1) {
        this.status = status1;
    }
}






/**
 * we create an operations class to manage the tasks.
 */
class Operations {
    /**
     * creating an task array of myTasks.
     */
    private Task[] myTasks;
    /**
     * no of items in the array.
     */
    public int noOfItems;
    /**
     * initial array size.
     */
    private final int sampleArraySize = 10;

    /**
     * default constructor to initialize the array and get
     * the no of tasks.
     */
    Operations() {
        myTasks = new Task[sampleArraySize];
        noOfItems = 0;
    }

    /**
     * add task method will add the tasks to our array.
     * @param task to be added.
     */
    void addTask(final Task task) {
        if (myTasks.length - noOfItems == 1) {
            resize();
        }
        myTasks[noOfItems] = task;
        noOfItems++;
    }
    /**
     * incase if the array is full we will use the resize method.
     */
    void resize() {
        myTasks = Arrays.copyOf(myTasks, 2 * myTasks.length);
    }

    /**
     * the following method will search the name in all the tasks ans returns boolean.
     * @param name to be searched.
     * @return true if found else false.
     */
    boolean searchTask(final String name) {
        for (int i = 0; i < noOfItems; i++) {
            if (myTasks[i].getName().equals(name)) {
                return true;
            }
        } return false;
    }

    /**
     * the following method will update the status of the task.
     * @param name of task for which status to be updated.
     * @param status to update.
     */
    void updateStatus(final String name, final String status) {
        int flag = 0;
        for (int i = 0; i < noOfItems; i++) {
            if (myTasks[i].getName().equals(name)) {
                myTasks[i].setStatus(status);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("no corresponding task is found to update the status.");
        }
    }

    /**
     * search by name method displays all the tasks with the corresponding name.
     * @param name to be searched.
     */
    void searchByName(final String name) {
        for (int i = 0; i < noOfItems; i++) {
            if (myTasks[i].getName().equals(name)) {
                taskPrint(myTasks[i]);
            }
        }
    }

    /**
     * date to be searched.
     * @param date to search.
     */
    void searchByDate(final String date) {
        for (int i = 0; i < noOfItems; i++) {
            if (myTasks[i].getDate().equals(date)) {
                taskPrint(myTasks[i]);
            }
        }
    }

    /**
     * we use the remove method to remove the tasks from the array.
     * @param task to be removed.
     */
    void removeTask(final String name) {
        int j;
        for (int i = 0; i < noOfItems; i++) {
            if (myTasks[i].getName().equals(name)) {
                for (j = i; j < noOfItems; j++) {
                    myTasks[j] = myTasks[j + 1];
                }
                myTasks[j + 1] = null;
                noOfItems--;
            }
        }
    }
    
    /**
     * method to display all the tasks.
     */
    void displayAll() {
        for (int i = 0; i < noOfItems; i++) {
            taskPrint(myTasks[i]);
        }
    }

    /**
     * method to display all incomplete tasks.
     */
    void displayIncomplete() {
        for (int i = 0; i < noOfItems; i++) {
            if (myTasks[i].getStatus().equals("incomplete")) {
                taskPrint(myTasks[i]);
            }
        }
    }

    /**
     * method to display all completed tasks.
     */
    void displayComplete() {
        for (int i = 0; i < noOfItems; i++) {
            if (myTasks[i].getStatus().equals("complete")) {
                taskPrint(myTasks[i]);
            }
        }
    }

    /**
     * method to display all overdue tasks.
     */
    void displayOverDue() {
        for (int i = 0; i < noOfItems; i++) {
            taskStatus(myTasks[i]);
            if (myTasks[i].getStatus().equals("overdue")) {
                taskPrint(myTasks[i]);
            }
        }
    }

    /**
     * we use taskprint to print each type in task object.
     * @param task to be printed.
     */
    void taskPrint(final Task task) {
        System.out.println("name of the task: " + task.getName() + "\n" + "task description: " + task.getDescription() + "\n" + "deadline for the task: " + task.getDate() + "\n" + "status of the task: " + task.getStatus());
        System.out.println("----------------------------------------------------------");
    }

    void taskStatus(final Task task) {
        if (task.getStatus() != "complete") {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String presentDate = formatter.format(date);
            if (presentDate.compareTo((task.getDate())) > 0) {
                task.setStatus("overdue");
                // return "overdue";
            } else {
                task.setStatus("incomplete");
                // return "in ";
            }
        }   
    }
}

=======
import java.util.Scanner;

>>>>>>> d033ee08bd3783af283ef36d317eaa37c8146010
public final class Main {
    /**
     * for check style.
     */
    private Main() {
        //check style
    }
    /**
     * main method.
     * @param args for terminal.
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        Operations standard = new Operations();
=======
        ToDoList standard = new ToDoList();
>>>>>>> d033ee08bd3783af283ef36d317eaa37c8146010
        boolean status = true;
        while (status) {
            System.out.println("--------------------------");
            System.out.println("Enter the following keywords to do the necessary operations");
            System.out.println("addtask---------add a task");
            System.out.println("remove task---------remove a task");
            System.out.println("update status---------add a task");
            System.out.println("all---------to display all");
            System.out.println("incomplete---------to display all incomplete tasks");
            System.out.println("overdue---------to display all overdue tasks");
            System.out.println("searchbyname---------search by name.");
            System.out.println("searchbydate---------search by specified date.");
            System.out.println("--------------------------");
            System.out.println("type of operation:");
            String mode = scanner.nextLine();
            switch (mode) {
                case "addtask":
                    System.out.println("enter the name of the task.");
                    String newname = scanner.nextLine();
                    System.out.println("enter the description of the task.");
                    String newdescription = scanner.nextLine();
                    System.out.println("enter the date of the task in yyyy/mm/dd format.");
                    String newdate = scanner.nextLine();
                    System.out.println("enter the status of the task.");
                    String newstatus = scanner.nextLine();
                    standard.addTask(new Task(newname, newdescription, newdate, newstatus));
                    break;
                case "removetask":
                    System.out.println("enter the task name to be removed.");
                    String toRemove = scanner.nextLine();
                    if (standard.searchTask(toRemove)) {
                        standard.removeTask(toRemove);
                    } else {
                        System.out.println("task not found.");
                    }
                    break;
                case "updatestatus":
                    System.out.println("enter the task name to be updated.");
                    String taskName = scanner.nextLine();
                    System.out.println("enter the status to be updated to.");
                    String taskStatus = scanner.nextLine();
                    standard.updateStatus(taskName, taskStatus);
                    break;
                case "all":
                    standard.displayAll();
                    break;
                case "complete":
                    standard.displayComplete();
                    break;
                case "incomplete":
                    standard.displayIncomplete();
                    break;
                case "overdue":
                    standard.displayOverDue();
                    break;
                case "searchbyname":
                    System.out.println("Enter the name to be searched:");
                    String nameToSearch = scanner.nextLine();
                    standard.searchByName(nameToSearch);
                    break;
                case "searchbydate":
                    System.out.println("Enter the date to be searched in 'yyyy/mm/dd format.'");
                    String dateToSearch = scanner.nextLine();
                    standard.searchByDate(dateToSearch);
                    break;
                case "exit":
                    status = false;
            }
        }
        scanner.close();
    }
}
