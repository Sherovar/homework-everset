package src.module2.task4.ex6;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Wooooof");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + "}";
    }
}
