import java.util.*;

public class User {
    /**
     * 
     */
    public String userName;
    /**
     * 
     */
    public User[] userConnections;
    /**
     * 
     */
    public int noOfUser;
    /**
     * 
     * @param user
     */
    public User(String name ) {
        this.userName = name;
        userConnections = new User[10];
        this.noOfUser = 0;

    }
    public User(String name,User[] n) {
        this.userName = name;
        userConnections = new User[10];
        this.noOfUser = 0;
    }
    public void addConn(User ub) {
        userConnections[noOfUser] = ub;
        noOfUser++;
    }
    
    
    public void setUserName(String user) {
        this.userName = user;
    }
    /**
     * 
     * @return
     */
    public String getUserName() {
        return this.userName;
    }
    /**
     * 
     * @param conn
     */
    public void setUserConnections(User[] conn) {
        this.userConnections = conn;
    }
    /**
     * 
     * @return
     */
    public User[] getUserConnections() {
        return this.userConnections;
    }
    /**
     * 
     * @param user
     */
    public void setNoOfUser(int n) {
        this.noOfUser = n;
    }
    /**
     * 
     * @return
     */
    public int getNoOfUser() {
        return this.noOfUser;
    }
    public String toString() {
         String s = userName  + " : ";
         if (this.noOfUser == 0) {
             return s + "";
         }
        else{
             s += "[";
         }
         for (int i =0; i< this.noOfUser - 1; i++){
            s += this.userConnections[i].userName +", ";
        }
        s += this.userConnections[this.noOfUser - 1].userName + "]";
        return s;
    }

    
    
}