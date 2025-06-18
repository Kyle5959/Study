package variable;

import java.util.Arrays;

public class Student{
    String name;
    int age;
    int grade;

    Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "이름: " + name + ", 나이: " + age + ", 학년: " + grade;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Hong", 22, 1);
        Student student2 = new Student("Kim", 20, 2);

        Student[] students = {student1, student2};

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(Arrays.toString(students));
        System.out.println(students[0].name);

        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

}