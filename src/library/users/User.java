package src.library.users;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private static List<User> userList= new ArrayList<>();
    static private int id = 1;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String role;


    public User(String login, String password, String firstName, String lastName, String role) {
        id++;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public static boolean addUser(User user){
        return userList.add(user);
    }

    public static User getUser(String login){
        for (User user : userList) {
            if (login.equals(user.getLogin())){
                return user;
            }
        }
        System.err.println("Can't find such user");
        return null;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
