package src.module2.task1;

public class Student_1 {
    private String name;
    private int markMath;
    private int markEnglish;
    private int markProgramming;

    public Student_1(String name, int markMath, int markEnglish, int markProgramming) {
        this.name = name;
        this.markMath = markMath;
        this.markEnglish = markEnglish;
        this.markProgramming = markProgramming;
    }

    public float getMedianMark(){
        return (markEnglish + markMath + markProgramming) / 3f;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student_1[] array = new Student_1[5];
        array[0] = new Student_1("Tonas Anderson", 5,5,4);
        array[1] = new Student_1("Steve White", 3,3,4);
        array[2] = new Student_1("Anna Smith", 4,2,5);
        array[3] = new Student_1("Jackson Turley", 2,4,3);
        array[4] = new Student_1("Katty Bree", 3,5,4);
        for (Student_1 student1 : array) {
            float medianMark =student1.getMedianMark();
            if (medianMark >= 4){
                System.out.printf("%s %.2f %n",student1.getName(), medianMark);
            }
        }
    }

}
