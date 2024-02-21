package src.library.users;

import src.library.items.BorrowableItem;

public class Member extends User{
    private BorrowableItem borrowableItem[];
    private boolean isActive;
    private String status;

    public Member(String login, String password, String firstName, String lastName,boolean isActive, String status) {
        super(login, password, firstName, lastName, "member");
        this.status = status;
        this.isActive = isActive;
        if (status.equalsIgnoreCase("bronze")){
            this.borrowableItem = new BorrowableItem[5];
        } else if (status.equalsIgnoreCase("silver")){
            this.borrowableItem = new BorrowableItem[15];
        } else if (status.equalsIgnoreCase("gold")){
            this.borrowableItem = new BorrowableItem[35];
        }
    }

    public BorrowableItem[] getBorrowableItem() {
        return borrowableItem;
    }

    public void setBorrowableItem(BorrowableItem[] borrowableItem) {
        this.borrowableItem = borrowableItem;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
