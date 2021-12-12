public class User {

    public String userName;
    public String userSurname;
    public String email;
    public static int totalOnline = 0; // counter for our users

    public User(String userName, String userSurname, String email) { // constructor
        this.userName = userName;
        this.userSurname = userSurname;
        this.email = email;
        totalOnline++;
    }

    public static String toCounter() { // method to print out the number of users
        return "Today there are " + totalOnline + " visitors in our library";
    }
}
