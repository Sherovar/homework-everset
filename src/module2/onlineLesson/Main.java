package src.module2.onlineLesson;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Jhonny", "House", "Jack Russel");
        Dog dog1 = new Dog();
        dog1.setName("Rex");
        dog1.setLivingArea("Lake");
        dog1.setType("Shepherd");

        System.out.println(dog1);

    }
}
