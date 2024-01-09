package src.module2.task2.ex5;

public class Esper {
    private String name;
    private int mighty;
    private String type;

    public Esper(String name, int mighty, String type) {
        this.name = name;
        this.mighty = mighty;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMighty() {
        return mighty;
    }

    public void setMighty(int mighty) {
        this.mighty = mighty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
