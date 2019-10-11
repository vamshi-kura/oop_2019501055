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
    public boolean searchUserarray(User user) {
        for (int i = 0; i < noOfUser; i++) {
            if (user.equals(userConnections[i])) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
         String s = userName  + " : ";
         if (this.noOfUser == 0 ) {
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