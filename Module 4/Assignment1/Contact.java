/**
 * This class discusses about the Contact Object. The attributes of the
 * contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 *
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class
public final class Contact {
    /**.
     * for check style
     */
    private Contact() {
        //unused
    }
    /**
     * declaring the field of contact as private so others cannot change the
     * value.
     */
    private String name;
    /**
     * declaring the field of contact as private so others cannot change the
     * value.
     */
    private String email;
    /**
     * declaring the field of contact as private so others cannot change the
     * value.
     */
    private String phoneNumber;

    /**.
     * it's parameterized constructor
     * @param name1 it's a string variable that stores name of the contact.
     * @param email1 it's a string variable that store email of a person.
     * @param phoneNumber1 it's a string variable that stores a phone number.
     */

    public Contact(final String name1, final String email1,
    final String phoneNumber1) {
        this.name = name1;
        this.email = email1;
        this.phoneNumber = phoneNumber1;
    }
    /**.
     * By this method we can change the name of the contact
     * @param name1 it's string variable.
     */
    public void setName(final String name1) {
        this.name = name1;
    }
    /**
     * this method return the 'name' field of the class.
     * @return  the name value.
     */
    public String getName() {
        return this.name;
    }
    /**.
     * By this method we can change the email of the contact
     * @param email1 it's string variable.
     */
    public void setEmail(final String email1) {
        this.email = email1;
    }
    /**
     * this method return the 'email' field of the class.
     * @return  the email variable  value.
     */
    public String getEmail() {
        return this.email;
    }
    /**
     * By this method we can change the phone no. of the contact
     * @param phn it's string variable.
     */
    public void setPhoneNumber(final String phn) {
        this.phoneNumber = phn;
    }
   /**
     * this method return the 'phoneNumber' field of the class.
     * @return  the phone number variable  value.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * this method is used to print the fields of the object.
     * @return the edpected ouput manner.
     */
    public String toString() {
        return "{ Name = " + this.name + ", " + "Email = " + this.email + ", "
         + "Phone Number = " + this.phoneNumber + " }";
    }
}
