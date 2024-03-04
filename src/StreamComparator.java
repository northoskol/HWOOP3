// Компаратор для сравнения количества групп в стриме
import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        int result = Integer.compare(stream1.groups.size(), stream2.groups.size());

        if (result < 0) {
            System.out.println("Stream 2 has more groups than Stream 1");
        } else if (result > 0) {
            System.out.println("Stream 1 has more groups than Stream 2");
        } else {
            System.out.println("Both streams have the same number of groups");
        }

        return result;
    }
}
