package src.module2.task1;

public class Student_2 {
    private String name;
    private double avgMark;
    private double scholarship;

    public String getName() {
        return name;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public double getScholarship() {
        return scholarship;
    }

    public Student_2(String name, double avgMark, double scholarship) {
        this.name = name;
        this.avgMark = avgMark;
        this.scholarship = scholarship;
    }

    public void recalculateScholarship(){
        if (avgMark < 2){
            return;
        }
        if (avgMark > 4.5){
            scholarship *= 1.3;
            System.out.printf("%s will take %.0f (%.1f)%n", name, scholarship, avgMark);
        }
        else {
            scholarship *= 1.1;
            System.out.printf("%s will take %.0f (%.1f)%n", name, scholarship, avgMark);
        }
    }

    public static void main(String[] args) {
        Student_2 array[] = new Student_2[5];
        array[0] = new Student_2("Medet", 3.5, 20000);
        array[1] = new Student_2("Azamat", 4.7, 20000);
        array[2] = new Student_2("Ali", 1.6, 20000);
        array[3] = new Student_2("Tougzhan", 2.9, 20000);
        array[4] = new Student_2("Aidana", 4.8, 20000);
        for (Student_2 student2 : array) {
            student2.recalculateScholarship();
        }
    }

}
