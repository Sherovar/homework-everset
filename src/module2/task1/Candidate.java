package src.module2.task1;

public class Candidate {
    private String name;
    private String work;
    private int income;

    public Candidate(String name, String work, int income) {
        this.name = name;
        this.work = work;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public String getWork() {
        return work;
    }

    public int getIncome() {
        return income;
    }

    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[8];
        candidates[0] = new Candidate("James Clark", "banker", 5000);
        candidates[1] = new Candidate("Edvin Johnson", "architect", 3000);
        candidates[2] = new Candidate("Katty Wesley", "designer", 5500);
        candidates[3] = new Candidate("Bread Pitt", "cooker", 3000);
        candidates[4] = new Candidate("Jane Edisson", "scientist", 2500);
        candidates[5] = new Candidate("William Johnson", "banker", 1100);
        candidates[6] = new Candidate("Askar Balgabek", "dianolicisonist", 10);
        candidates[7] = new Candidate("Liam Turvey", "designer", 6500);
        for (Candidate candidate : candidates) {
            if (candidate.income > 1000 && !candidate.work.equals("banker") && !candidate.name.contains("Johnson") && !candidate.name.contains("Edisson")){
                System.out.println(candidate.name);
            }
        }
    }
}
