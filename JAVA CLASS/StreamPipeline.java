import java.util.*;
import java.util.stream.*;

public class StreamPipeline {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(12, 25, 30, 12, 45, 50, 25, 60);

        List<Integer> result = numbers.stream()
                .distinct()              // 1. Remove duplicates
                .filter(n -> n > 20)     // 2. Select > 20
                .map(n -> n * 2)         // 3. Multiply by 2
                .sorted()                // 4. Sort ascending
                .limit(4)                // 5. First 4 values
                .collect(Collectors.toList());

        System.out.println("Result: " + result);
    }
}