package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static final int FIZZ_BUZZ_UNTIL = 100;
    public static final int FIZZ_BUZZ_FROM = 1;

    public List<String> getNumbers() {
        return IntStream.rangeClosed(FIZZ_BUZZ_FROM, FIZZ_BUZZ_UNTIL).mapToObj(Integer::toString).collect(Collectors.toList());
    }
}
