package variable;

public class Student2 {
    String name;
    int age;
    int grade;

    public static void main(String[] args) {
        Student2 student1 = new Student2();
        printStudent(student1, "gildong", 20, 80);

        Student2 student2 = new Student2();
        printStudent(student2, "gildong", 20, 80);

        System.out.println(student1.name + student1.age + student1.grade);
    }

    static void printStudent(Student2 student, String name, int age, int grade) {

        student.name = name;
        student.age = age;
        student.grade = grade;

    }

}
