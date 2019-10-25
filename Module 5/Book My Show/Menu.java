
/**
 * This menu class creates objects for BookYourShow and Show objects
 * and adds the shows objects to the BookYourShow Object. Then the
 * Patrons can book the tickets based on the shows available.
 * This is a sample and skeleton code that gives you an idea of how
 * to create objects for different classes.
 * You can have your own test cases and test your Show, Patron and
 * BookYourShow classes.
 * @author Praveen Garimella
 * @author Siva Sankar
 */

public final class Menu {
    /**
     * for check style.
     */
    private Menu() {
      //check style
    }
    /**
     * main nethod.
     * @param args for terminal.
     */
    public static void main(final String[] args) {
      //  Creating an object for BookYourShow application.
      BookYourShow book = new BookYourShow();

      String movieName = "Mission Impossible";
      String datetime = "Aug 18, 2015 17:30";
      String[] seats = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2"};
      //  Creating an object for Show with the movieName, datetime and
      //  the number of seats and adding the show to the BookYourShow
      //  Object.
      Show show = new Show(movieName, datetime, seats);
      book.addAShow(show);
      //System.out.println(show);

      //  Creating an object for Show with the movieName, datetime and
      //  the number of seats of seats and adding the show to the BookYourShow
      //  Object.
      movieName = "Mission Impossible";
      datetime = "Aug 18, 2015 10:30";
      show = new Show(movieName, datetime, seats);
      book.addAShow(show);

      //  Creating an object for Show with the movieName, datetime and
      //  the number of seats of seats and adding the show to the BookYourShow
      //  Object.
      movieName = "Inside Out";
      datetime = "Aug 18, 2015 15:30";
      show = new Show(movieName, datetime, seats);
      book.addAShow(show);

      //  Searching for a show at a specific date and time.
      Show result = book.getAShow("Mission Impossible", "Aug 18, 2015 17:30");
      if (result == null) {
        System.out.println("No shows available!");
      } else {
        System.out.println("Movie Name: " + result.getMovieName());
        System.out.println("Date and Time: " + result.getDate());
      }
      System.out.println("- - - - -- - - - -- - - -- ");
      Patron p = new Patron("Praveen", "9989968765");
      String[] s = {"B1", "B2"};
      result.bookAShow(p, s);

      Patron r = new Patron("Varshini", "888888888");
      result.bookAShow(r, s);

      //  Print the tickets Once the tickets are booked....
      result.printTickets(p);
      result.printTickets(r);
    }
  }

  class BookYourShow {
    /**
     * to store all shows.
     */
    public Show[] allShows;
    /**
     * total no of shows.
     */
    public int totalShows;
    /**
     * max size of the array.
     */
    private final int maxSize = 100;
    /**
     * default constructor.
     */
    BookYourShow() {
    allShows = new Show[maxSize];
    totalShows = 0;
    }
    /**
     * add a show in the server.
     * @param show to be added.
     */
    void addAShow(final Show show) {
      allShows[totalShows] = show;
      totalShows++;
    }
    /**
     * get a show from the server.
     * @param movieName is the name of the movie.
     * @param movieDate is the date and time of the movie.
     * @return all matching shows else null.
     */
    Show getAShow(final String movieName, final String movieDate) {
      for (int i = 0; i < totalShows; i++) {
        if (allShows[i].getMovieName().equals(movieName)
         && allShows[i].getDate().equals(movieDate)) {
          return allShows[i];
        }
      }
      return null;
    }
  }

  class Patron {
    /**
     * name of the customer.
     */
    private String name;
  /**
   * getter for customers name.
   * @return the name of the customer.
   */
  public String getName() {
    return this.name;
  }
  /**
   * setter for customers name.
   * @param newname of the customer.
   */
  public void setName(final String newname) {
    this.name = newname;
  }
    /**
     * mobile number of the customer.
     */
    private String mobileNumber;

  /**
   * getter for mobile number of the customer.
   * @return the mobile number of the customer.
   */
  public String getMobileNumber() {
    return this.mobileNumber;
  }
  /**
   * setter for the mobile number fo the customer.
   * @param newmobileNumber of the customer.
   */
  public void setMobileNumber(final String newmobileNumber) {
    this.mobileNumber = newmobileNumber;
  }
    /**
     * name of the movie.
     */
    private String moviename;
  /**
   * getter for movie name.
   * @return the movie name.
   */
  public String getMoviename() {
    return this.moviename;
  }
  /**
   * setter for movie name.
   * @param newmoviename to assign.
   */
  public void setMoviename(final String newmoviename) {
    this.moviename = newmoviename;
  }
    /**
     * date and time of the movie.
     */
    private String date;
  /**
   * getter for the movie date and time.
   * @return the date of the movie.
   */
  public String getDate() {
    return this.date;
  }
  /**
   * setter for the movie date and time.
   * @param newdate of the movie.
   */
  public void setDate(final String newdate) {
    this.date = newdate;
  }
    /**
     * seats array for the customer to choose.
     */
    private String[] seats;
  /**
   * getter for the seats array.
   * @return the seats choosen by the customer.
   */
  public String[] getSeats() {
    return this.seats;
  }
  /**
   * setter for assigning the seats choosen by the customer.
   * @param newseats array choosen by the customer.
   */
  public void setSeats(final String[] newseats) {
    this.seats = newseats;
  }
    /**
     * parametrized constructoe.
     * @param customerName to initialize.
     * @param customerMobileNumber to initialize.
     */
    Patron(final String customerName, final String customerMobileNumber) {
      setName(customerName);
      setMobileNumber(customerMobileNumber);
    }
  }

  class Show {
    /**
     * name of the movie.
     */
    private String movieName;
  /**
   * getter for movie name.
   * @return the movie name
   */
  public String getMovieName() {
    return this.movieName;
  }
  /**
   * setter for movie name.
   * @param newmovieName to be assigned
   */
  public void setMovieName(final String newmovieName) {
    this.movieName = newmovieName;
  }

    /**
     * date of the movie.
     */
    private String date;
  /**
   * getter for movie data and time.
   * @return the date and time.
   */
  public String getDate() {
    return this.date;
  }
  /**
   * setter for movie date and time.
   * @param newdate of the movie to be assigned.
   */
  public void setDate(final String newdate) {
    this.date = newdate;
  }
    /**
     * array of seats.
     */
    private String[] seats;

  /**
   * getter for seats array.
   * @return the seats array
   */
  public String[] getSeats() {
    return this.seats;
  }
  /**
   * setter for seats array.
   * @param newseats array to be assigned.
   */
  public void setSeats(final String[] newseats) {
    this.seats = newseats;
  }
    /**
     * parametrized constructor.
     * @param a is the movie name.
     * @param b is the movie data and time.
     * @param c is the seats available in the movie.
     */
    Show(final String a, final String b, final String[] c) {
      setMovieName(a);
      setDate(b);
      setSeats(c);
    }

    /**
     * book a show method to book the tickets.
     * @param customer of type patron to get the details of name
     *  and mobile number.
     * @param seatsToBook are the seats choosen by the customer to book.
     */
    void bookAShow(final Patron customer, final String[] seatsToBook) {
      int availableSeats = 0;
      for (int i = 0; i < seatsToBook.length; i++) {
        for (int j = 0; j < seats.length; j++) {
          if (seats[j] != null) {
            if (seatsToBook[i] == seats[j]) {
              seats[j] = null;
              availableSeats++;
            }
          }
        }
      }

      if (availableSeats == seatsToBook.length) {
        customer.setMoviename(movieName);
        customer.setDate(date);
        customer.setSeats(seatsToBook);
      }
    }
    /**
    * the following method removes all the shows that match the movie name.
    * @param show to be removed from our shows.
    */
    void removeShow(final Show show) {
        for (int i = 0; i < totalShows; i++) {
        if (show.getMovieName().equals(allShows[i].getMovieName())) {
            allShows[i] = null;
            int j;
            for (j = i; j < totalShows; j++) {
            allShows[j] = allShows[j + 1];
            }
            allShows[j] = null;
        }
        }
    }
    /**
     * tickets to print when called.
     * @param h is the customers account to send ot print the tickets to.
     */
    void printTickets(final Patron h) {
      System.out.println("hello " + h.getName() + ": ");
      if (h.getMoviename() != null) {
        System.out.println("details for the booked tickets are:");
        System.out.println(h.getMoviename());
        System.out.println(h.getDate());
        for (int i = 0; i < h.getSeats().length; i++) {
          System.out.println(h.getSeats()[i]);
        }
      } else {
        System.out.println("sorry no tickets are available for the show.");
      }
      System.out.println("--------------------------");
    }
  }
