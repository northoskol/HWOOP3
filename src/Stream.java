// Класс для стрима, содержащий список групп
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group> {
    List<Group> groups;

    public Stream(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<Group> iterator() {
        return groups.iterator();
    }
}