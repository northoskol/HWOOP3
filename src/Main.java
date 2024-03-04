import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("q", 20, "chemistry", 5);
        Student s2 = new Student("a", 22, "chemistry", 8);
        Student s5 = new Student("q", 40, "chemistry", 4);
        Student s6 = new Student("f", 44, "chemistry", 4);
        Student s7 = new Student("g", 45, "chemistry", 7);
        Student s8 = new Student("j", 26, "chemistry", 11);
        Student s9 = new Student("g", 32, "math", 3);

        Student s3 = new Student("z", 24, "chemistry", 2);
        Student s4 = new Student("e", 21, "chemistry", 1);
        ArrayList<Student> studentsGroup1 = new ArrayList<>(List.of(s1, s2, s5));
        ArrayList<Student> studentsGroup2 = new ArrayList<>(List.of(s3, s4, s6));
        ArrayList<Student> studentsGroup3 = new ArrayList<>(List.of(s9, s7, s8));

        Group group1 = new Group(studentsGroup1);
        Group group2 = new Group(studentsGroup2);
        Group group3 = new Group(studentsGroup3);
        List<Group> groups1 = List.of(group1, group2);
        List<Group> groups2 = List.of(group3);


        studentsGroup1.sort(new StudentComparator());
        studentsGroup2.sort(new StudentComparator());
        studentsGroup3.sort(new StudentComparator());

        System.out.println("Сравнение студентов:");
        for (Student student : group1) {
            System.out.println(student);
        }

        for (Student student : group2) {
            System.out.println(student);
        }

        for (Student student : group3) {
            System.out.println(student);
        }

        Stream stream1 = new Stream(groups1);
        Stream stream2 = new Stream(groups2);

        // Используем StreamComparator для сравнения количества групп в стриме
        StreamComparator streamComparator = new StreamComparator();
        int result = streamComparator.compare(stream1, stream2);
        System.out.println("\n Сравнение групп в стриме:");
        System.out.println("Comparison result: " + result);
    }
}
