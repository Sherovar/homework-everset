package src.library.items;

public class DVD extends LibraryItem{
    private int runtime;

    public DVD(String name, boolean isAvailable, int runtime) {
        super(name, isAvailable);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", runtime=" + runtime + " min" +
                ", isAvailable='" + super.isAvailable() + '\'' +
                '}';
    }
}
