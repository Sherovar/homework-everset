package src.library.items;

public abstract class LibraryItem {
    private static int latestId = 1;
    private int id;
    private String name;
    private boolean isAvailable;

    public LibraryItem(String name, boolean isAvailable) {
        id = latestId++;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }




}
