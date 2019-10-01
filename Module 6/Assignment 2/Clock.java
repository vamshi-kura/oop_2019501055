// import sun.security.rsa.SunRsaSign;

/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */

public class Clock {
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    int h;
    int m;
    public Clock(int h, int m) {
        this.h = h;
        this.m = m;
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {
        this.h = Integer.parseInt(s.substring(0, 2));
        this.m = Integer.parseInt(s.substring(3,5));
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String s="";
        if (this.h < 10) {
            s += "0"+this.h;
        } else {
            s += this.h;
        }
        s += ":";
        if (this.m < 10) {
            s += "0"+this.m;
        } else {
            s += this.m;
        }
        return s;
    }


    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (this.h < that.h){
            return true;
        } else if (this.h == that.h) {
            if(this.m < that.m){
                return true;
            }else {
                return false;
            }

        }
        return false;
    }

    private void check() {
        
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        if (this.m == 59) {
            this.h += 1;
            this.m = 0;
            if (this.h == 24)
                this.h = 0;
        }
        else 
            this.m += 1;

    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
        for(int i = 0;i < delta;i++){
            this.tic();
        }
    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("09:29");
        clock.toc(31);
        System.out.println(clock);
    }
}