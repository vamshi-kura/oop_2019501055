/**
 * 
 */
import java.io.*;
import java.util.*;
public class Board {
    /**
     * for checkstyle
     */
    private Board() {
        //unused.
    }
    /**
     * for storing Pieces in a piece arrays
     */
    private Piece [] pieces;
    /**
     * for storing USERS IN USERS array
     */
    private User [] users;
    /**
     * return the pieces array
     * @return
     */
    private int noOfUser;
    public Board(int num) {
        pieces = new Piece[100];
        users = new User[num];
        noOfUser = 0;
    }
    public Piece[] getPieces() {
        return pieces;
    }
    /**
     * to change piece array.
     * @param pieces
     */
    public void setPieces(Piece[] pieces) {
        this.pieces = pieces;
    }
    /**
     * return the pieces array
     * @return
     */
    public User[] getUsers() {
        return users;
    }
    /**
     * to change piece array.
     * @param users
     */
    public void setUsers(User[] users) {
        this.users = users;
    }
    /**
     * to get noOfUser attribute.
     * @return
     */
    public int getNoOfUser() {
        return noOfUser;
    }
    /**
     * to change no of user attirbute.
     * @param noOfUser
     */
    public void setNoOfUser(int noOfUser) {
        this.noOfUser = noOfUser;
    }
    /**
     * 
     * @param arr1
     * @param arr2
     */
    public void creatingBoard (int[][] arr1,int[][] arr2) {
        for (int i = 0; i < pieces.length; i++ ) {
            boolean flag_L = false;
            boolean flag_S = false;
            Piece  pie;
            for(int j =0 ; j < arr1.length; j++){
                if (i+1 == arr1[j][0]) {
                    // pie.setPosition(arr1[j][1]);
                    // pie.setFeature("ladder");
                    pie = new Piece(arr1[j][1], "Ladder", false);
                    pieces[i] = pie;
                    flag_L = true;
                    break;
                }
            }

            if(!flag_L) {
                for(int k =0 ; k < arr2.length; k++){
                    if (i+1 == arr2[k][0]) {
                        // pie.setPosition(arr1[j][1]);
                        // pie.setFeature("ladder");
                        pie = new Piece(arr2[k][1], "Snake", false);
                        pieces[i] = pie;
                        flag_S = true;
                        break;
                    }
                }
            }
            if (!(flag_L || flag_S)) {
                pie = new Piece(i+1, "none", false);
                pieces[i] = pie;
            }
        }
    }
    /**
     * for add users into the users array
     * @param u
     */
    public void addUser(User u) {
        users[noOfUser] = u;
        noOfUser++;
    }
    /**
     * geting a value after rolling  dice.
     * @return
     */
    public int rollDice() {
        return (int) (Math.random() * 6 + 1);
        
    }
    public void display(int i) {
        // for(int j = 0; j <  10; j++) {
        //     System.out.print(" " + "__" + " ");
        // }
        Piece pe;
        for (int k = i * 10;k < (i+1) * 10;k++) {
            pe = pieces[k];
            if (pe.getFeature().equals("Ladder")) {
            System.out.print(" " + "LL" + " ");
            } else if (pe.getFeature().equals("Snake")) {
            System.out.print(" " + "SS" + " " );
            } else {
            System.out.print(" " + "__" + " ");
            }
        }
        System.out.println();
        for(int k = i * 10;k < (i+1) * 10;) {
            k = k + 1;
            if (i == 0) {
                if(k == 10) {
            System.out.print(" " + k + " ");
                }else{
            System.out.print(" " + 0 + k + " ");
                }
            } else {
            System.out.print(" " + k + " ");
            }
        }
    }
    public void startGame () {
        int z = 0;
        int dice_value = 0;
        Piece p1;
        int toPos = 0;
        int fromPos;
        System.out.println("Welcome to the game Snake & Ladders!");
        while(pieces[99].is_present != true) {
            int i = 0;
            while (i < noOfUser) {
                if (users[i] == null) {
                    continue;
                }
                System.out.println("---------------------------------------");
                z = users[i].getPobj().getPosition();
                System.out.println(users[i].getName() + " are at position " + z);
                // p1.is_present = false;
                display(z / 10);
                System.out.println();
                System.out.print("Enter a letter 'r' for rolling dice ");
                System.out.println( "(or) '.' to display the positions of other players");
                Scanner scan_1 = new Scanner(System.in);
                String guessLetter = scan_1.nextLine();
                guessLetter = guessLetter.toLowerCase();
                String guessLettered = "";
                while (!guessLetter.contains("r")) {
                    if (guessLetter.length() != 1){
                        System.out.println("please enter single letter :");
                    }else if (guessLetter.equals(".")) {
                        for(int l =0; l< noOfUser;l++) {
                            Piece e = users[l].getPobj();
                            System.out.print(users[l].getName() + " " + e.getPosition());
                            System.out.println();
                            
                        }
                        System.out.println("Now type r to roll the dice");
                    } else  {
                        System.out.println("please enter correct input");
                    }
                    Scanner scan_n = new Scanner(System.in);
                    guessLettered = scan_n.nextLine();
                    guessLetter = guessLettered;
                    if (guessLetter.equals("r")) {
                        break;
                    }
                }
                if (guessLetter.equals("r")) {
                    dice_value = rollDice();
                    System.out.println("After rolling a dice : " + dice_value);
                    p1 = users[i].getPobj();
                    p1.is_present = false;
                    fromPos = p1.getPosition(); // need to check.
                    toPos = fromPos + dice_value;
                } 
                if (toPos <= 100) {
                    users[i].setPobj(pieces[toPos-1]);
                } else {
                    System.out.println("oops try next chance ");
                    i++;
                    continue;
                }
                p1 = users[i].getPobj();
                if (p1.getFeature().equals("Ladder")) {
                    // need to say to the user
                    System.out.println(" Hurray you got a ladder" + toPos);
                    System.out.println("new Position : " + p1.getPosition());
                } else  if (p1.getFeature().equals("Snake")){
                    // need to say to the uaer
                    System.out.println(" oops you got a snake" + toPos);
                    System.out.println("new Position : " + p1.getPosition());
                }
                p1.is_present = true;
                System.out.println("new Position : " + p1.getPosition());
                if(p1.getPosition() == 100){
                    //need to show in output
                    System.out.println(users[i].getName() + " is Winner");
                    break;
                }
                if (dice_value == 6) {
                    continue;
                }
                i++;
                
            }
        }
    }
    public static void main(String[] args) {

        int num = 0;
        while(true) {
            try {
                System.out.println("enter no. of players:");
                Scanner scanned= new Scanner(System.in);
                num = scanned.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("enter a valid number");
                System.out.println(e.getMessage());
            }
        }
        Board b = new Board(num);
        int [][] snakes = {{43, 16},{55, 34},{70, 48},{78, 42},{95, 73},{96, 82}};
        int [][]  ladder = {{6, 27},{9, 50},{20, 39},{25, 57},{53, 72},{54, 85},{61, 82}};
        b.creatingBoard(ladder, snakes);
        for(int i =0; i < num; i++) {
            System.out.println("enter the player name");
            Scanner name = new Scanner(System.in);
            String username =name.nextLine();
            User p = new User(username);
            b.addUser(p);
        }
        b.startGame();
    }
    // public void remove(int index) {
    //     users[index] = null; 
    // }
}