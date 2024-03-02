package src.library.users;

import src.library.items.BorrowableItem;

import java.util.ArrayList;

public class Member extends User {
    static int pos = 0;
    private ArrayList<BorrowableItem> borrowableItems;
    private boolean isActive;
    private String status;

    public Member(String login, String password, String firstName, String lastName, boolean isActive, String status) {
        super(login, password, firstName, lastName, "member");
        this.status = status;
        this.isActive = isActive;
        borrowableItems = new ArrayList<>();
    }

    public ArrayList<BorrowableItem> getBorrowableItems() {
        return borrowableItems;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void borrowItem(BorrowableItem item) {
        if ((status.equals("Gold") && borrowableItems.size() <= 35) ||
                (status.equals("Silver") && borrowableItems.size() <= 15) ||
                (status.equals("Bronze") && borrowableItems.size() <= 5)) {
            borrowableItems.add(item);
        }
    }
}
