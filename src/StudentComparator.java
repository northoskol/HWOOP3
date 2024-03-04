// Компаратор для сравнения студентов по оценкам
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student t1, Student t2) {

        int result = Integer.compare(t1.getOrder(), t2.getOrder());
        if (result == 0) {
            result = t1.getName().compareTo(t2.getName());
            if (result == 0) {
                result = t1.getSpecialization().compareTo(t2.getSpecialization());
            }
        }
        return result;
    }
}