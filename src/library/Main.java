package src.library;

import src.library.items.*;
import src.library.users.Librarian;
import src.library.users.Member;
import src.library.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User.addUser(new Member("MEMber", "qwerty", "Adam", "Smith", true, "bronze"));
        User.addUser(new Librarian("Lebra", "qwerty", "Kevin", "Smith", 1));
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new DVD("Top Gun", true, 123));
        libraryItems.add(new DVD("Police Academy", false, 144));
        libraryItems.add(new Book("Hobbit", true, "Tolkien", "Hobbit", "9780261103344"));
        libraryItems.add(new Book("The Hitchhiker's Guide to the Galaxy", false, " Douglas Adams", "The Hitchhiker's Guide to the Galaxy", "9781590072578"));
        libraryItems.add(new Magazine("NY TIMES", true, 1_000_000, "A.G. Sulzberger"));
        libraryItems.add(new Magazine("The Guardian Weekly", false, 100_000, "Guardian Media Group"));


        System.out.println("Welcome to library!");
        User currentUser = null;
        do {
            currentUser = login();
        } while (currentUser == null);
        int action = 99;
        while (action != 0){
            actionList(currentUser);
            action = scanner.nextInt();
            switch (action){
                case 1 -> System.out.println(libraryItems);
            }

        }



    }


    private static User login() {
        User user = null;
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        user = User.getUser(username);
        if (user == null) {
            return null;
        }
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        if (password.equals(user.getPassword())) {
            return user;
        }
        System.err.println("Incorrect password!");
        return null;
    }

    public static void actionList(User user){
        System.out.println("Choose action:");
        System.out.println("1. List items.");
        System.out.println("2. Get Profile info.");
        if (user.getRole().equals("librarian")){
            System.out.println("3. List users.");
            System.out.println("4. Activate/Deactivate user.");
        } else if (user.getRole().equals("member")){
            System.out.println("3. Borrow item");
        }
        System.out.println("0. EXIT");
    }
}
