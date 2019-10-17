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