/**
 * This class implements all the methods of the SocialNetrorkInterface 
 * You are free to add your own behaviours to this class.
 * 
 * @author Siva Sankar
 */

import java.util.Arrays;

public class SocialNetwork {

    /**
     * users indicates the actual users in the network
     */
    User[] users;

    /**
     * The size indicates the numebr of users in the network
     */
    int size;

    /**
     * Initializes the default values of the social network.
     */
    public SocialNetwork() {
        // TODO
        // Your code goes here
        users = new User[100];
        size = 0;

    }

    /**
     * This method takes the string as a parameter which is used
     * to create a network. do nothing if the string is empty.
     * 
     * @param str to be used to create a network.
     */
    public void createDataStructure(String str) {
        // TODO
        // Your code goes here
        String [] str1;
        if (str.length() == 0) {
            return;
        } else {
            str1 = str.split(";");
            for (int i =0; i<str1.length; i++) {
                String s = str1[i].replace(" is connected to ", ",");
                String[] s1 = s.split(",");
                String name = s1[0];
                // int c = s1.length - 1;
                User u = new User(name);
                if (!(searchUser(u)))
                    addUser(u);
                for (int j = 1; j < s1.length; j++ ) {
                    String name1 = s1[j];
                    User u1 = new User(name1);
                    if (!(searchUser(u1))) {
                        addUser(u1);
                    }
                    u=getUser(u.userName);
                    addConnection(u, u1);
                }   
            }
        }
        return;
    }

    private boolean searchUser(User user) {
        for (int i = 0; i < size; i++) {
<<<<<<< HEAD
=======
            
>>>>>>> f034c1c8939121152d8b36cd7971e33f4677dfe0
            if (user.userName.equals(users[i].userName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Please don't modify the follwoing code.
     * This method returns the User based on the userName.
     * 
     * @param userName the string to be used to search for the user.
     * @return the User object based on the userName. 
     * Returns null otherwise
     */
    public User getUser(String userName) {
        for (int i = 0; i < size; i++) {
            if (userName.equals(users[i].userName)){
                return users[i];
            }
        }
        return null;
    }

    /**
     * This method adds a new User (object) that is passed as 
     * argument to the social network if the user is not currently 
     * on the social network.
     * @param userA to be added to the social network.
     */
    public void addUser(User userA) {
        // TODO
        // Your code goes here
        if (searchUser(userA)){
            return;
        }
        users[size] = userA;
        size++;
    }
    /**
     * This method takes two users (objects) as arguments and 
     * connects them on the network. userA and userB are 
     * the users that are passed as parameters to this function, 
     * then add userB to userA’s connections
     * 
     * Note: Both userA and userB should be there on the network.
     * if anyone of them are not on the network, then do nothing.
     * 
     * @param userA the userB is to be added to userA connections
     * @param userB to be added to userA connections
     */
    public void addConnection(User userA, User userB) {
        // TODO
        // Your code goes here
        // User[] us = userA.getUserConnections();
        // System.out.println("therre1");
        if (userA == null || userB == null){
            return;
        }
        if (searchUser(userA) && searchUser(userB)) {
            userA.addConn(userB);
        }
    }

    /**
     * This method takes a user object as an argument that returns the 
     * connections of this user. Return null if the user is not in 
     * the network.
     * 
     * @param userA the user object used to return the 
     * connections of this user.
     * 
     * @return the list of connections of userA. otherwise return null
     */
    public User[] getConnections(User userA) {
        // TODO
        // Your code goes here
        if (!(searchUser(userA))) {
            return null;
        }
        // need to  check below condition.
        if (userA.noOfUser == 0) {
            return null;
        }
        return userA.userConnections;
    }

    /**
     * This method returns the common connections of userA and userB.
     * Note: both userA and userB should be on the network. if anyone 
     * of them is not in the network, then return null
     * 
     * @param userA the first user
     * @param userB the second user
     * 
     * @return the common connections of both userA and userB if they 
     * both are in the network, otherwise return null
     */
    public User[] getCommonConnections(User userA, User userB) {
        // TODO
        // Your code goes here
        if (userA == null || userB == null){
            return null;
        }
        if (!(searchUser(userA) && searchUser(userB))){
            return null;
        }

       
        User[] f1 =  userA.userConnections;
        User[] f2 = userB.userConnections;
        User[] res = new User[f1.length+f2.length];
        int count = 0 ; 
        if (userB.noOfUser == 0 || userA.noOfUser == 0) {
            return null;
        }
        for (int i = 0 ; i < userA.noOfUser; i++){
            for (int j = 0; j< userB.noOfUser; j++) {
                if( f1[i].userName.equals(f2[j].userName)) {
                    res[count] = f1[i];
                    count++;
                }
            }
        }
        return res;  
    }

    /**
     * This reutrns the String version of the social network.
     * 
     * @return the String version of the network, return an empty string
     * if there are no users in the network.
     */
    public String toString() {
        if (this.size == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        for (i = 0; i < size-1; i++) {
            // if(users[i].noOfUser == 0 ) {
            //     continue;
            // }
            sb.append(users[i] + "\n");
        }
        // if (users[i].noOfUser != 0)
        sb.append(users[i]);
        return sb.toString();
    }
    public delUser(String un) {
        int index = -1;
        for (int i=0; i < size; i++) {
            if (un.equals(users[i].userName)){
                index =i;
                break
            }
        }
        if (index >= 0){
            for (int j = index; j < size; j++){
                users[i] = users[i];
            }
            uses[size--] = null;
    }
    }

    
}