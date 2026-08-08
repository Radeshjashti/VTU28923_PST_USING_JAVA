import java.util.*;
import java.util.stream.*;

public class CountStudents {
    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(65, 80, 75, 90, 85, 70);

        long count = marks.stream()
                .filter(mark -> mark > 75)
                .count();

        System.out.println("Students scoring above 75: " + count);
    }
}