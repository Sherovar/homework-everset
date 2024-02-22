package src.module3.collection2;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alexey", "1119/1", 1,new int[]{4,2,5,4,2}));
        students.add(new Student("Semen", "2119/1", 2,new int[]{4,5,5,4,2}));
        students.add(new Student("Pavel", "4149/1", 4,new int[]{1,2,2,4,2}));
        students.add(new Student("Mihei", "3113/1", 3,new int[]{4,2,5,4,2}));
        students.add(new Student("Stiffler", "2219/1", 2,new int[]{1,2,5,4,1}));

        students.removeIf(student -> student.getAvgScore() < 3);

        for (Student student : students) {
            if (student.getAvgScore() >= 3){
                student.setCourse(student.getCourse() + 1);
            }
        }

        List<Student> studentsPrint = printStudents(students, 3);
        for (Student student : studentsPrint) {
            System.out.println(student.getName() + " " + student.getCourse());
        }


    }
    public static List<Student> printStudents(List<Student> students, int course){
        ArrayList<Student> studentsResult = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourse() == course){
                studentsResult.add(student);
            }
        }
        return studentsResult;
    }


}

class Student {
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> grades;

    public Student(String name, String group, int age, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = age;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int grade : grades) {
            integers.add(grade);
        }
        this.grades = integers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getAvgScore() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum/grades.size();
    }

}
