import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssignment {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number*number)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
