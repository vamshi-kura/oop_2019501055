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

    public User() {
    }

    public User(String userName, User[] userConnections, int noOfUser) {
        this.userName = userName;
        this.userConnections = userConnections;
        this.noOfUser = noOfUser;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User[] getUserConnections() {
        return this.userConnections;
    }

    public void setUserConnections(User[] userConnections) {
        this.userConnections = userConnections;
    }

    public int getNoOfUser() {
        return this.noOfUser;
    }

    public void setNoOfUser(int noOfUser) {
        this.noOfUser = noOfUser;
    }

    public User userName(String userName) {
        this.userName = userName;
        return this;
    }

    public User userConnections(User[] userConnections) {
        this.userConnections = userConnections;
        return this;
    }

    public User noOfUser(int noOfUser) {
        this.noOfUser = noOfUser;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(userConnections, user.userConnections) && noOfUser == user.noOfUser;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userConnections, noOfUser);
    }
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
<<<<<<< HEAD

=======
>>>>>>> f034c1c8939121152d8b36cd7971e33f4677dfe0
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