import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortingUtilsTest {

    @Test
    @DisplayName("isSorted")
    void isSorted() {
        assertThat(SortingUtils.isSorted(5, 7, 9, 50, 678))
                .isEqualTo(true);
    }

}