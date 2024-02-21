package src.library.items;

public class Magazine extends LibraryItem implements BorrowableItem{
    private long issueNumber;
    private String issuer;

    public Magazine(String name, boolean isAvailable, long issueNumber, String issuer) {
        super(name, isAvailable);
        this.issueNumber = issueNumber;
        this.issuer = issuer;
    }

    public long getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(long issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + super.getId() + '\'' +
                ", name=" + super.getName() + '\'' +
                ", issueNumber=" + issueNumber + '\'' +
                ", issuer='" + issuer + '\'' +
                ", isAvailable='" + super.isAvailable() + '\'' +
                '}';
    }
}
