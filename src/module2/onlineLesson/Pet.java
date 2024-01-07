package src.module2.onlineLesson;

public class Pet extends Animal {
    private String livingArea;


    public Pet() {
    }

    public Pet(String name, String livingArea) {
        super(name);
        this.livingArea = livingArea;
    }

    public String getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }
}
