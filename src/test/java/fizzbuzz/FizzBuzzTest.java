package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void createFizzBuzz() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void get100Numbers() {
        assertThat(fizzBuzz.getNumbers()).hasSize(100);
    }

    @Test
    void replace3WithFizz() {
        assertThat(fizzBuzz.getNumbers().get(2)).isEqualTo("Fizz");
    }
}
