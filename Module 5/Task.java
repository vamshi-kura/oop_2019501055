class Task {
    /**.
     * declaring the field of task as private so others cannot change the
     * value.
     */
    private final String name;
    /**
     * declaring the field of task as private so others cannot change the
     * value.
     */
    private final Stirng description;
    /**
     * declaring the field of task as private so others cannot change the
     * value.
     */
    private final Date dueDate;
    /**
     * declaring the field of task as private so others cannot change the
     * value.
     */
    private final String status;

    public Task(String s, String des, Date d, String stat) {
        this.name = s;
        this.description = des;
        this.dueDate= d;
        this.status = stat;
    }
    
    public void setName(final String na) {
        this.name = na;
    }
    /**
     * this method return the 'name' field of the class.
     * @return  the name value.
     */
    public String getName() {
        return this.name;
    }
    /**.
     * By this method we can change the description of the task
     * @param desc1 it's string variable.
     */
    public void setDescription(final String desc) {
        this.description = desc;
    }
    /**
     * this method return the  description field of the class.
     * @return  the description variable  value.
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * By this method we can change the duedate  of the task
     * @param da it's string variable.
     */
    public void setDate(final String da) {
        this.duedate = da;
    }
   /**
     * this method return the due date field of the class.
     * @return  the duedate variable  value.
     */
    public String getDate() {
        return this.dueDate;
    }
    /**
     * By this method we can change the status. of the task
     * @param st it's string variable.
     */
    public void setStatus(final String st) {
        this.status= st;
    }
   /**
     * this method return the 'status' field of the class.
     * @return  the Status variable  value.
     */
    public String getStatus() {
        return this.status;
    }

}