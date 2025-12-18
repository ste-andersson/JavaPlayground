import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @DisplayName("reverseString")
    void reverseString() {
        assertThat(StringUtils.reverseString("Test"))
                .isEqualTo("tseT");
    }

    //Not Case sensitive
    @Test
    @DisplayName("countLetter")
    void countLetter() {
        assertThat(StringUtils.countLetter("STRAWberry", 'r'))
                .isEqualTo(3);
    }

    //Case sensitive
    @Test
    @DisplayName("letterFrequency")
    void letterFrequency() {
        assertThat(StringUtils.letterFrequency("STRAWberry", 'r'))
                .isEqualTo(2);
    }

    @Test
    @DisplayName("isPalindrome")
    void isPalindrome() {
        assertThat(StringUtils.isPalindrome("Anna"))
                .isEqualTo(true);
    }


}