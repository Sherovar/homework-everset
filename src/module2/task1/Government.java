package src.module2.task1;

public class Government {
    private String name;
    private int cost;
    private String type;
    boolean isGovernmental;

    public Government(String name, int cost, String type, boolean isGovernmental) {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.isGovernmental = isGovernmental;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public boolean isGovernmental() {
        return isGovernmental;
    }

    public static void main(String[] args) {
        int budget = 30000;
        String specType = "Science";
        Government[] governments = new Government[3];
        governments[0] = new Government("HeavyMetallInc", 15000, "Factory", false);
        governments[1] = new Government("RapResearchLab", 10000, "Science", true);
        governments[2] = new Government("OmegaTRC3", 20000, "Business", false);
        int result = 0;
        for (Government government : governments) {
            if (government.isGovernmental()){
                if (government.getType().equals(specType)){
                    result += government.getCost() * 0.8;
                }
            } else {
                result += government.getCost();
            }
        }
        System.out.println(result - budget);
    }
}
