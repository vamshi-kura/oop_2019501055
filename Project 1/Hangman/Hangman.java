import java.io.*;
import java.util.*;
/**
 * If a letter is guessed is indeed in the word (movie)
 * the program will reveal its correct position in the word (movie),
 * if not, you lose a point. If you lose the x number of points
 * (x will be based on the number missing letters), your game is over!
 * 
 * The score of the player is going to be the number of correct guesses.
 * If the player guesses correctly the entire movie word,
 * then his/her score is going to be the number of characters
 * in the word (movie).
 * The computer can award bonus points.
 */
public class Hangman {
    /**
     * for check style
     */
    /**
     * the players array.
     */
    private Player [] players;
    /**
     * no. of players
     */
    private int noOfPlayers;
    /**
     * this method return the 'players' field of the class
     * @return the the array.
     */
    public Player[] getPlayers() {
        return players;
    }
    /**
     *  By this method we can change the players  field of the class.
     * @param players the player object type
     */
    public void setPlayers(final Player[] players) {
        this.players = players;
    }
    /**
     * this method return the size  of the array.
     * @return the the size.
     */
    public int getNoOfPlayers() {
        return noOfPlayers;
    }
    /**
     * By this method we can change the noOfPlayers  field of the class.
     * @param noOfPlayers it's int type.
     */
    public void setNoOfPlayers(final int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public Hangman(int n) {
        players = new Player[n];
        noOfPlayers = 0;
    }

    public void leaderBoard(Player [] players, int size) {
        Arrays.sort(players);
        for(int i = 0; i < size; i++) {
            System.out.print(players[i].getUsername() + "  ");
            System.out.println(players[i].getScore());
        }

    }
    /**
     * 
     * @param args
     * @throws Exception
     */
    WordADT wordslist = new WordADT();
    String alpha;
    public static String getWords (String fileName) throws Exception {
        Scanner scan = new Scanner(new File("movies.txt"));
        StringBuffer sb = new StringBuffer();
        while(scan.hasNext()) {
            sb.append(scan.nextLine() + ";");
        }
        String s = sb.toString();
        s = s.substring(0, sb.length()-1);
        return s;
    }
    public static void main(String[] args) throws Exception {
        String data = getWords("movies.txt");
        data = data.toLowerCase();
        
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
        Hangman h = new Hangman(num);
        h.loadWords(data);
            

        for (int i = 0; i < num; i++) {
            System.out.println("enter the player name");
            Scanner name = new Scanner(System.in);
            String username =name.nextLine();
            Player p = new Player(username);
            h.addPlayer(p);
        }
        int pts;
        System.out.println(h.noOfPlayers);
        for(int i = 0; i < h.noOfPlayers; i++) {
            h.alpha = "abcdefghijklmnopqrstuvwxyz";
            pts = h.startGame();
            h.players[i].setScore(pts);  
            System.out.println(h.players[i].getScore()); 
        }
        System.out.println("LEADERBOARD");
        h.leaderBoard(h.players, h.noOfPlayers);
    }
    public void loadWords(final String s) {
        String [] temp = s.split(";");
        int count =0;
        int c =0;
        String [] temp1 = new String[temp.length / 4];
        String s2 = "";
        for (String s1 : temp) {
            if (s1.length() != 0) {
                if (s1.length() != 0) {
                    s2 +=  s1 + ":" ;
                    count++;
                }
            if (count % 4 == 0) {
                temp1[c] = s2;
                s2 = "";
                c++;
                }
            }
        }

        for(String s3 : temp1) {
            if (s3 != null) {
                String [] arr = s3.split(":");
                String [] clue = new String[2];
                c = 1;
                for (int i =0 ; i < 2; i++) {
                    clue[i] = arr[arr.length-1-c];
                    c--;
                }
                Word w = new Word(arr[0],arr[1],clue);
                
                wordslist.addWord(w);
            }
        }
    }

    public void addPlayer(Player p){
        players[noOfPlayers] = p;
        noOfPlayers++;
    }
    public int startGame() {
        int Count = 4 ;
        int flag = 2;
        Word wd;
        int points = 0;
        boolean p_flag = true;
        while(true) {
            System.out.println("enter the level: (easy, medium ,hard)");
            Scanner scan = new Scanner(System.in); 
            // need to use the try and catch test cases.
            String level = scan.nextLine();
            level = level.toLowerCase();
            if ( level.equals("easy") || level.equals("hard")
             || level.equals("medium")) {
                wd = wordslist.getWord(level);
                if (level.equals("hard")) {
                    points = 10;
                } else if (level.equals("meidum")) {
                    points = 5;
                }
                break;
            } else {
                System.out.println("Please enter correct input");
            }
        }
       
        char guessWord[] = new char[wd.getName().length()];
        for( int i = 0 ; i < wd.getName().length(); i++) {
            if (wd.getName().charAt(i) >= 97 && wd.getName().charAt(i)
            <= 122) {
                guessWord[i] = '_';
            } else {
                guessWord[i] =  ' ';
            }
        }
        System.out.println("Welcome to the game Hangman!");
        System.out.println("I am thinking of a moviename  that is " + 
        wd.getName().length() + " letters long");
        displayWords(guessWord);
        System.out.println("");
        // need totake input from the user and go on.
        while ( Count >= 0 ) {
            int count = 0;
            System.out.println("---------------------");
            System.out.println("You have " + Count + " guesses left");
            System.out.println("Available letters " + alpha);
            System.out.println("Enter a letter and for hints enter '.'");
            Scanner scan_1 = new Scanner(System.in);
            String guessLetter = scan_1.nextLine();
            String guessLettered = "";
            while (guessLetter.length() != 1) {
                System.out.println("please enter single letter :");
                Scanner scan_n = new Scanner(System.in);
                guessLettered = scan_n.nextLine();
                guessLetter = guessLettered;
            }

            
            if (guessLetter.equals(".") && flag <= 2 && flag > 0){
                String clues = "";
                p_flag = false;
                if (flag == 2)
                    clues = wd.getHints()[0];
                if (flag == 1)
                    clues =wd.getHints() [1];
                System.out.println(clues);
                flag--;
                if (points > 5) {
                    points -= 5;
                } else {
                    points = 0 ;
                }
                continue;
            } else if (guessLetter.equals(".") && flag <= 0) {
                System.out.println("used up all hints");
                continue; 
            }
            // if (guessLetter)
            guessLetter = guessLetter.toLowerCase().substring(0, 1);
            if (wd.getName().contains(guessLetter)
             && alpha.contains(guessLetter)) {
                guessWord = getGuessedWord(wd.getName(), guessLetter,
                guessWord);
                points++;
                System.out.println("letter present");

            } else if (alpha.contains(guessLetter)) {
                System.out.println("Oops! letter is not in my word:");
                if (points != 0) {
                    points--;
                }
                Count--;
            } 
            displayWords(guessWord);
            System.out.println("");
            getAvailableLetters(guessLetter);
            
            for (int i = 0; i < guessWord.length; i++) {
                if (guessWord[i] == '_') {
                    count++;
                }
            }
            if (count == 0) {
                if(p_flag) {
                    points += 10;
                }
                System.out.println("you guessed the correct answer");
                break;
            }
        }
        System.out.println("The correct answer is " + "\"" + wd.getName()
         + "\"");
        return points;
    }

    public void displayWords(char [] ch) {
        for( char a : ch) {
            if (a == ' ') {
                System.out.print(" ");
            } else {
                System.out.print(" " + a + " ");
            }
        }
    }
// need to check over "this" object"
    public void getAvailableLetters(String lg) {
       
        String lg_1 = lg.toLowerCase();
        for (int i = 0; i < alpha.length(); i++) {
            if(alpha.charAt(i) == lg.charAt(0)) {
                alpha =  alpha.replace(lg_1, "");
                return;
            }
        }
        System.out.println("letter already used");
    }

    public char[] getGuessedWord(String sw , String lg, char[] ga) {
        char [] ga_1 = ga;
        if (sw.contains(lg)){
            for (int i = 0; i < sw.length(); i++) {
                if (sw.charAt(i)== lg.charAt(0)) {
                    ga_1[i] = lg.charAt(0);
                }
            }
        }
        return ga_1;
    }

    
}
