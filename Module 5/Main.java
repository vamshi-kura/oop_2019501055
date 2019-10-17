import java.util.Scanner;

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
        ToDoList standard = new ToDoList();
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
