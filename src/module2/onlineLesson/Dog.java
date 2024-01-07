package src.module2.onlineLesson;

public class Dog extends Pet{
    private String type;

    public Dog() {
    }

    public Dog(String name, String livingArea, String type) {
        super(name, livingArea);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dog{" +
                '\'' + super.toString() + '\'' +
                "livingArea='" + getLivingArea() + '\'' +
                "type='" + type + '\'' +
                '}';
    }
}
