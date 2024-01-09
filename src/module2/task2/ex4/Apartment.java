package src.module2.task2.ex4;

public class Apartment {
    private String title;
    private int smet;
    private String type;

    public Apartment(String title, int smet, String type) {
        this.title = title;
        this.smet = smet;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSmet() {
        if (type.equals("Cyberbricks")){
            return (int)(smet * 1.5);
        } else if (type.equals("Carbonpanel")){
            return (int)(smet * 0.8);
        }
        return smet;
    }

    public void setSmet(int smet) {
        this.smet = smet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
