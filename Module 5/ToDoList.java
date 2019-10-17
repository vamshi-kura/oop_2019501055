
/**
 * we create an operations class to manage the tasks.
 */
class ToDoList {
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
    ToDoList() {
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