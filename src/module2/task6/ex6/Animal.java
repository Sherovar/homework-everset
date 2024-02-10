package src.module2.task6.ex6;

public abstract class Animal {
    public Animal(String name) {
        this.name = name;
    }

    private String name;
    public abstract void greets();
}
