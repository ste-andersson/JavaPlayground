import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    @DisplayName("fizzBuzz")
    void fizzBuzz() {
        assertThat(MathUtils.fizzBuzz(15, 3, 5, "Fizz", "Buzz"))
                .endsWith("FizzBuzz");
    }

    @Test
    @DisplayName("sumEvens")
    void sumEvens() {
        assertThat(MathUtils.sumEvens(15, 3, 5, 8, 8))
                .isEqualTo(16);
    }

    @Test
    void findMin() {
        assertThat(MathUtils.findMin(55, 4, 5, 50, 9))
                .isEqualTo(4);
    }
}