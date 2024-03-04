import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Класс студента
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String specialization;
    private int order;  // Поле order теперь представляет оценку

    public int getOrder() {
        return order;
    }

    public Student(int order) {
        this.order = order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Student(String name, int age, String specialization, int order) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.order = order;
    }

   @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialization='" + specialization + '\'' +
                ", order=" + order +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        int result = Integer.compare(order, student.order);
        if (result == 0) {
            result = Integer.compare(age, student.age);
            if (result == 0) {
                result = name.compareTo(student.name);
                if (result == 0) {
                    result = specialization.compareTo(student.specialization);
                }
            }
        }
        return result;
    }
}
